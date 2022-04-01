package com.example.server1.config

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

@Configuration
class FeignConfig {

    @Bean
    fun requestHeader(): RequestInterceptor = BasicRequestInterceptor()
}

class BasicRequestInterceptor: RequestInterceptor{
    override fun apply(template: RequestTemplate) {
        template.header("x-api-key", "abc")
        template.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
    }
}