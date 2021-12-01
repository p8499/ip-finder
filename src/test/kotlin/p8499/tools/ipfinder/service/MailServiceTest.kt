package p8499.tools.ipfinder.service

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MailServiceTest {
    @Autowired
    protected lateinit var mailService: MailService

    @Test
    fun testSend() {
        assertDoesNotThrow { mailService.send(to = arrayOf("p8499@126.com"), subject = "Test", text = "Test") }
    }
}
