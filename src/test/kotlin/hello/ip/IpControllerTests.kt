package hello.ip

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class IpControllerTests {

    @Autowired
    lateinit var controller: IpController

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun contextLoads() {
        assertThat(controller).isNotNull()
    }
    @Test
    fun getIp() {
        this.mockMvc.perform(get("/ip"))
            .andDo(print())
            .andExpect(status().isOk)
    }
}