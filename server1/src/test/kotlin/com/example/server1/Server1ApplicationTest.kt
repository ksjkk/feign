package com.example.server1

import com.example.server1.app.ApiService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class Server1ApplicationTest(@Autowired private val apiService: ApiService){

    @Test
    @DisplayName("server1 에서 server2로 feign test")
    fun success(){
        val result = "server2"
        val feignResult = apiService.thatServer()

        Assertions.assertThat(feignResult).isEqualTo(result)
    }
}
