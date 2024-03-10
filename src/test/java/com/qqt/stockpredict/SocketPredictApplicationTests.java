package com.qqt.stockpredict;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.qqt.stockpredict.mapper.UserMapper;
import com.qqt.stockpredict.model.entity.Stocknews;
import com.qqt.stockpredict.model.entity.User;
import com.qqt.stockpredict.service.StocknewsService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SocketPredictApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Resource
    private StocknewsService stocknewsService;

    @Test
    public void testDataSave() {
        try {
            // Create the URL and the connection
            URL url = new URL("https://api.jisuapi.com/news/get");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Enable input and output streams
            connection.setDoOutput(true);
            connection.setDoInput(true);

            // Set the request parameters
            String parameters = "channel=外汇&start0&num=40&appkey=b87e3a8ecb03a8c6";

            // Write the parameters to the connection
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(parameters.getBytes());
            outputStream.flush();
            outputStream.close();

            // Get the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            // Close the connection
            connection.disconnect();

            JSONObject jsonObject = new JSONObject(response.toString());
            JSONObject result = jsonObject.getJSONObject("result");
            JSONArray list = result.getJSONArray("list");

            // Iterate through the list array
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.getJSONObject(i);

                // Extracting data
                String title = item.getString("title");
                String time = item.getString("time");
                String src = item.getString("src");
                String category = item.getString("category");
                String pic = item.getString("pic");
                String phoneUrl = item.getString("url");
                String weburl = item.getString("weburl");
                String content = item.getString("content");
                Stocknews stocknews = new Stocknews();
                stocknews.setCategory(category);
                stocknews.setSource(src);
                stocknews.setPicture(pic);
                stocknews.setContent(content);
                stocknews.setTittle(title);
                stocknews.setTime(time);
                stocknews.setPhoneUrl(phoneUrl);
                stocknews.setWebUrl(weburl);
                System.out.println(stocknews);
                stocknewsService.save(stocknews);
            }
            System.out.println("List的长度为：" + list.length());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBCryptPasswordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("123456");
        boolean matches = passwordEncoder.matches("1234", "$2a$10$WCD7xp6lxrS.PvGmL86nhuFHMKJTc58Sh0dG1EQw0zSHjlLFyFvde");
        System.out.println(encode);
        System.out.println(encode2);
        System.out.println(matches);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userName", "qqtang");
        User user = userMapper.selectOne(wrapper);
        System.out.println("user = " + user);
    }

    @Test
    public void testGetStockNews() {
        String url = "http://query.sse.com.cn/commonQuery.do";
        Map<String, String> params = new HashMap<>();
        params.put("sqlId", "COMMON_SSE_SJ_GPSJ_GPSJZM_TJSJ_L");
        params.put("PRODUCT_NAME", "股票，主板，科创板");
        params.put("type", "inParams");
        params.put("_", "1640855495128");

        Map<String, String> headers = new HashMap<>();
        headers.put("Referer", "http://www.sse.com.cn/");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36");

        try {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                url = UriComponentsBuilder.fromUriString(url).queryParam(entry.getKey(), entry.getValue()).build().toString();
            }

            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();

            System.out.println("content = " + content);

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(content.toString(), JsonObject.class);
            JsonArray resultArray = jsonObject.getAsJsonArray("result");
            JsonObject resultObject = resultArray.get(0).getAsJsonObject();

            StringBuilder result = new StringBuilder();
            for (Map.Entry<String, JsonElement> entry : resultObject.entrySet()) {
                String key = entry.getKey();
                JsonObject value = entry.getValue().getAsJsonObject();
                String stock = value.get("股票").getAsString();
                String mainBoard = value.get("主板").getAsString();
                String scienceBoard = value.get("科创板").getAsString();
                result.append(key + "\t" + stock + "\t" + mainBoard + "\t" + scienceBoard + " ");
            }

            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
