package com.qqt.stockpredict.config;

import com.qqt.stockpredict.filter.JwtAuthenticationTokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * 安全配置
 *
 * @author QQT
 * @date 2023/11/17
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   /** 这里使用了数组当作下方可变参数列表的参数 */
    private String[]  matchers = new String[]{
            "/user/login",
           "/user/register",
           "/doc.html",
           "/favicon.ico",
           "/v2/api-docs",
           "/swagger-resources/**",
           "/webjars/**",
           "/swagger/**",
           "/swagger-ui.html",
           "/v2/**",
           "/v2/api-docs-ext/**"
   };

    @Resource
    private JwtAuthenticationTokenFilter authenticationTokenFilter;
    
    /**
     * 将BCryptPasswordEncoder加入到容器中
     **/
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 将认证入口AuthenticationManager注入容器中用于用户认证
     **/
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 配置SpringSecurity对需要放行的接口放行
     **/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //关闭csrf
                .csrf().disable()
                //不通过Session获取SecurityContext
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 对于登录接口 允许匿名访问，下面注释的是视频中的使用方式
                //.antMatchers("/user/login").anonymous()
            	.antMatchers(matchers).anonymous()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated();
        // 参数列表分别为需要插入的过滤器和标识过滤器的字节码
        http.addFilterBefore(authenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
