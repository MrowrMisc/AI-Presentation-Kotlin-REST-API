
package org.mrowrpurr.todosapi

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTests {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `GET hello returns Hello, World!`() {
        mockMvc.get("/hello")
            .andExpect {
                status { isOk() }
                content { string("Hello, World!") }
            }
    }

    @Test
    fun `GET json returns JSON response`() {
        mockMvc.get("/json")
            .andExpect {
                status { isOk() }
                content { json("""{"message":"Hello, JSON!"}""") }
            }
    }
}