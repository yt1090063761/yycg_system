package yycg.base.action;

import javafx.application.Application;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.BssSysArea;
import yycg.base.pojo.Sysuser;
import yycg.base.pojo.Userjd;
import yycg.base.service.SysuserService;
import yycg.base.service.userjdService;
import yycg.base.vo.DataGridResultInfo;
import yycg.base.vo.PageQuerySQL;
import yycg.base.vo.Ztree;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("jduser")
public class JdUserAction {
    @Autowired
    private SysuserService sysuserService;
    @Autowired
    private userjdService userjdService;


    //系统用户 功能
    @RequestMapping("sysuserquery")
    public String sysuser_jsp() {

        return "base/user/sysuserquery";
    }

    //监管单位功能 state
    //页面跳转
    @RequestMapping("userjdquery")
    public String userjdquery(Model model) {
        return "base/user/userjdquery";
    }

    /**
     * @param pageQuerySQL 包装了分页的参数
     * @param request      用来获取条件查询的单位名称和地区
     * @return
     */

    @RequestMapping(value = "userjdquery_result", produces = "application/json;charset=utf-8")
    @ResponseBody
    public DataGridResultInfo userjd_result(PageQuerySQL pageQuerySQL, HttpServletRequest request) throws UnsupportedEncodingException {
        System.out.println("-------------------------------------------");

        String id = request.getParameter("userjdCustom.dq");
        String name = request.getParameter("userjdCustom.mc");

        if (id != null && !id.equals("")) {
            pageQuerySQL.setDq(id);
        }
        if (name != null && !name.equals("")) {
            pageQuerySQL.setName("%" + new String(request.getParameter("userjdCustom.mc").getBytes("ISO-8859-1"), "UTF-8") + "%");
        }


        //页码和数据总数和数据
        List<Userjd> userjdList = userjdService.findAllUserjd(pageQuerySQL);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        dataGridResultInfo.setRows(userjdList);//数据
        dataGridResultInfo.setTotal(userjdService.userjdTototal());//总条数

        return dataGridResultInfo;
    }

    //跳转页面并加载
    @RequestMapping("userjdview")
    public String userjdedit(String editid, Model model) {
        Userjd userjd = userjdService.selectByID(editid);
        model.addAttribute("userjd", userjd);
        return "/base/user/userjdview";
    }

    //页面加载地区
    @RequestMapping("areaload/async")
    public @ResponseBody
    List<Ztree> areaload(String otherParam, String areaid) {
        System.out.println("添加树形结构");
        //数组里的就是数据库的arealevel字段的值
        List<BssSysArea> bssSysAreas = userjdService.selectLv(new Integer[]{1, 2});
        List<Ztree> ztrees = new ArrayList<>();
        for (BssSysArea bssSysArea : bssSysAreas) {
            Ztree ztree = new Ztree();
            ztree.setId(bssSysArea.getAreaid());
            ztree.setName(bssSysArea.getAreaname());
            ztree.setpId(bssSysArea.getParentid());
            ztrees.add(ztree);
        }

        return ztrees;
    }

    //跳转 etidit页面
    @RequestMapping("userjdedit")
    public String addUserjd_jsp(String editid, Model model) {
        if (editid != null && !editid.equals("")) {
            //修改页面
            Userjd userjd = userjdService.selectByID(editid);
            model.addAttribute("userjd", userjd);
        }


        return "/base/user/userjdedit";
    }

    @RequestMapping("userjdsave")
    public String addUser(Userjd userjd, HttpServletRequest request,HttpServletResponse response) throws IOException {

        if (userjd.getId() != null && !userjd.getId().equals("")) {
            userjdService.update(userjd);
            return "base/success";
        }

        userjdService.insertUserjd(userjd);

       // response.getWriter().print("");
       return "base/success";
    }

    @RequestMapping("userjddel")
    public String delete(Userjd userjd) {
        System.out.println(  userjd.getId());
        userjdService.delByID(userjd.getId());

        return "base/success";
    }
//监管单位模块 end


    //登陆页面
    @RequestMapping("login")
    public String login() {
        return "base/user/login";
    }

    /**
     * @param model
     * @return
     */
    //首页的跳转和欢迎页的加载
//    @RequestMapping("first")
////    public String first(Model model) {
////        Sysuser sysuser = sysuserService.findBySysuserID("189");
////        model.addAttribute("sysuser", sysuser);
////        return "base/first";
////    }


}
