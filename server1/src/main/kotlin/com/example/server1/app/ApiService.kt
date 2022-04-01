package com.example.server1.app

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ApiService(
    private val feignApi: FeignApi
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun thatServer(): String {
        log.debug("feign start")
        return feignApi.toServer2()
    }
}