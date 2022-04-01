package com.example.server1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Server1Application

fun main(args: Array<String>) {
	runApplication<Server1Application>(*args)
}
