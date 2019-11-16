package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yycg.base.pojo.Sysuser;
import yycg.base.service.SysuserService;
@Controller
public class FirstAction {

    @Autowired
    private SysuserService sysuserService;
    /**
     * @param model
     * @return
     */
    //首页的跳转和欢迎页的加载
    @RequestMapping("first")
    public String first(Model model) {
        System.out.println("sssaa");
        Sysuser sysuser = sysuserService.findBySysuserID("189");
        model.addAttribute("sysuser", sysuser);
        return "base/first";
    }

    @RequestMapping("welcome")
    public String wecome() {
        return "base/welcome";
    }
}
