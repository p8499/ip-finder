package p8499.tools.ipfinder.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import p8499.tools.ipfinder.service.feignClient.SohuPv
import javax.script.Bindings
import javax.script.ScriptEngineManager

@Service
class IPv4Service {
    @Autowired
    protected lateinit var sohuPv: SohuPv

    protected val scriptEngineManager: ScriptEngineManager by lazy { ScriptEngineManager() }

    fun internetAddress(): String {
        val scriptEngine = scriptEngineManager.getEngineByName("javascript")
        scriptEngine.eval(sohuPv.cityjson())
        val bindings = scriptEngine.get("returnCitySN") as Bindings
        return bindings["cip"] as String;
    }
}