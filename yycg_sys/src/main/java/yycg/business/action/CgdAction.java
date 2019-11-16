package yycg.business.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cgd")
public class CgdAction {

    @RequestMapping("queryYycgdmx")
    public String jsp(){

        return "business/cgd/queryYycgd";
    }
}
