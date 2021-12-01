package p8499.tools.ipfinder.service.feignClient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "sohuPv", url = "http://pv.sohu.com")
interface SohuPv {
    @GetMapping("cityjson")
    fun cityjson(@RequestParam ie: String = "utf-8"): String
}