package hello.ip

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class IpController {

    @GetMapping("/ip")
    fun getIp(req: HttpServletRequest): String {
        val ip: String? = req.getHeader("X-FORWARDED-FOR")

        return ip?:"anonymous"
    }
}