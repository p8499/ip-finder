package p8499.tools.ipfinder.service.task

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FindIpTaskTest {
    @Autowired
    protected lateinit var findIpTask: FindIpTask

    @Test
    fun testRun() {
        assertDoesNotThrow { findIpTask.run() }
    }
}
