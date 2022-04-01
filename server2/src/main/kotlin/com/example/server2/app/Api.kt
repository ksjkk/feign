package com.example.server2.app

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("api")
class Api {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping(value = ["/server"])
    fun thisServer(request: HttpServletRequest): String {
        log.info("header x-api-key : ${request.getHeader("x-api-key")}")
        return "server2"
    }
}