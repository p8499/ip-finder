package p8499.tools.ipfinder

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
class IpFinderApplication : CommandLineRunner {
    override fun run(vararg args: String) {
        while (true) {
            Thread.sleep(1000)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<IpFinderApplication>(*args)
}
