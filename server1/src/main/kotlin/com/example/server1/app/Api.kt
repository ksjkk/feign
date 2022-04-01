package com.example.server1.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class Api(
    private val apiService: ApiService
) {

    @GetMapping(value = ["/server"])
    fun thisServer() = "this is server1"

    @GetMapping(value = ["/server2"])
    fun thatServer() = apiService.thatServer()
}

