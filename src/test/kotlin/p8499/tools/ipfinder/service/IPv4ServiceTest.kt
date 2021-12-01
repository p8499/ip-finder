package p8499.tools.ipfinder.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class IPv4ServiceTest {
    @Autowired
    protected lateinit var iPv4Service: IPv4Service

    @Test
    fun testInternetAddress() {
        assert(iPv4Service.internetAddress().isNotEmpty())
    }
}
