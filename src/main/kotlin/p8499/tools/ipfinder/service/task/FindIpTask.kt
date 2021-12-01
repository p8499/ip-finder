package p8499.tools.ipfinder.service.task

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import p8499.tools.ipfinder.service.IPv4Service
import p8499.tools.ipfinder.service.MailService

@Service
class FindIpTask {
    @Autowired
    protected lateinit var iPv4Service: IPv4Service

    @Autowired
    protected lateinit var mailService: MailService

    @Scheduled(cron = "59 59 23 * * SUN-SAT")
    fun run() {
        mailService.send(
            to = arrayOf("p8499@126.com"),
            subject = "Home IP Address",
            text = iPv4Service.internetAddress()
        )
    }
}