package com.qlvt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qlvt.config.CorsFilter;

@Configuration
public class SecurityConfig  {

    @Bean
    CorsFilter corsFilter() {
        CorsFilter filter = new CorsFilter();
        return filter;
    }
}
