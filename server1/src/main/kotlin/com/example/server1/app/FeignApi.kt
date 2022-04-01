package com.example.server1.app

import com.example.server1.config.FeignConfig
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name = "to-server2",
    url = "\${feign.destination.server2}",
    configuration = [ FeignConfig::class ]
)
interface FeignApi {

    @GetMapping("/api/server")
    fun toServer2(): String
}