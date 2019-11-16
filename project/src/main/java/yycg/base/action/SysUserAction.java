package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yycg.base.pojo.Sysuser;
import yycg.base.service.SysuserService;

@Controller
@RequestMapping("sysuser")
public class SysUserAction {
@Autowired
    private SysuserService sysuserService;
    @RequestMapping("first")
    public String first(Model model){
        Sysuser sysuser=sysuserService.findBySysuserID("189");
        model.addAttribute("sysuser",sysuser);
        System.out.println("跳转首页");
        return "base/first";
    }

    @RequestMapping("wecome")
    public String wecome(){

        return "base/wecome";
    }
}
