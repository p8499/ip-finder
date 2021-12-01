package p8499.tools.ipfinder.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service
import javax.annotation.Resource


@Service
class MailService {
    @Value("\${spring.mail.username}")
    protected lateinit var username: String

//    protected val mailHost = "smtp.126.com"
//    protected val mailTransportProtocol = "smtp"
//    protected val mailSmtpAuth = "true"
//    protected val mailUser = "p8499"
//    protected val mailPassword = "Sou`12"
//    protected val mailFromAddress = "p8499@126.com"

//    protected val props
//        get() = Properties().apply {
//            setProperty("mail.host", mailHost);
//            setProperty("mail.transport.protocol", mailTransportProtocol);
//            setProperty("mail.smtp.auth", mailSmtpAuth);
//        }
//    protected val session: Session by lazy { Session.getInstance(props) }

    //    protected val transport: Transport by lazy { session.transport }
    @Resource
    protected lateinit var mailSender: JavaMailSender

    fun send(
        to: Array<String>,
        cc: Array<String> = emptyArray(),
        bcc: Array<String> = emptyArray(),
        subject: String,
        text: String
    ) {
        val message = mailSender.createMimeMessage()
        with(MimeMessageHelper(message, true)) {
            setFrom(username)
            setTo(to)
            setCc(cc)
            setBcc(bcc)
            setSubject(subject)
            setText(text)
        }
        mailSender.send(message)
//        transport.connect(mailUser, mailPassword)
//        val message = MimeMessage(session).apply {
//            setFrom(InternetAddress(mailFromAddress))
//            setRecipients(Message.RecipientType.TO, to.map(::InternetAddress).toTypedArray())
//            setRecipients(Message.RecipientType.CC, cc.map(::InternetAddress).toTypedArray())
//            setRecipients(Message.RecipientType.BCC, bcc.map(::InternetAddress).toTypedArray())
//            setSubject(subject, charset)
//            setContent(content, type)
//        }
//        transport.sendMessage(message, message.allRecipients)
//        transport.close()
    }
}