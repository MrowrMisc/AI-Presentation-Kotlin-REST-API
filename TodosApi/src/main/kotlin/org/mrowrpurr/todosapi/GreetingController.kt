package org.mrowrpurr.todosapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World!"
    }

    @GetMapping("/json")
    fun getJson(): Map<String, String> {
        return mapOf("message" to "Hello, JSON!")
    }
}
