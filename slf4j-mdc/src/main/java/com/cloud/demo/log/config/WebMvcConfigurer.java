package com.cloud.demo.log.config;

import com.cloud.demo.log.interceptors.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/1 11:33
 * WEB MVC配置类
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    /**
     * 把我们的拦截器注入为bean
     *
     * @return
     */
    @Bean
    public HandlerInterceptor logInterceptor() {
        return new LogInterceptor();
    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则, 这里假设拦截 /url 后面的全部链接
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(logInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
