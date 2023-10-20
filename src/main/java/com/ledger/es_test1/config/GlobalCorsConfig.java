package com.ledger.es_test1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GlobalCorsConfig {
    /**
     * 允许跨域调用的过滤器
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // 允许所有域名进行跨域调用
        config.addAllowedHeader("*"); // 允许跨域请求包含任意头信息
        config.addAllowedMethod("*"); // 允许任何跨域请求方法
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}