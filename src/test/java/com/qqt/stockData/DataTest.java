package com.qqt.stockData;

import com.qqt.stockpredict.mapper.StocknewsMapper;
import com.qqt.stockpredict.model.entity.Stocknews;
import com.qqt.stockpredict.service.StocknewsService;
import com.qqt.stockpredict.service.impl.StocknewsServiceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @Author QQT
 * @Create 2024--02--04 17:29
 */
@SpringBootTest
public class DataTest {
    public static void main(String[] args) {
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
            String parameters = "channel=头条&start=0&num=40&appkey=b87e3a8ecb03a8c6";

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

            // Print the response
            System.out.println("Response: " + response.toString());

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
