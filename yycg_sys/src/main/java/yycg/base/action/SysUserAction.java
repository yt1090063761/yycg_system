package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.Custom.PageQuerySQLCustom;
import yycg.base.pojo.Sysuser;
import yycg.base.service.SysuserService;
import yycg.base.vo.DataGridResultInfo;
import yycg.base.vo.PageQuerySQL;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("sysuser")
public class SysUserAction {
    @Autowired
    private SysuserService sysuserService;

    /**
     * 跳转到用户首页
     * @return
     */
    @RequestMapping("sysuserquery")
    public String sysuser_jsp(){

        return "/base/user/sysuserquery";
    }

    /**
     * 返回数据网格数据
     * @param
     * @return
     */
    @RequestMapping("sysuserquery_result")
    @ResponseBody
    public DataGridResultInfo sysuser(PageQuerySQL pageQuerySQL, Sysuser sysuser) {
        System.out.println("name:"+sysuser.getUsername());

        List<Sysuser> sysuserList=null;
   //     sysuserList = sysuserService.getAll(pageQuerySQL,sysuser);

        if (sysuser.getUsername()!=null&&!sysuser.getUsername().equals("")&&sysuser.getUsername()!=""){
            System.out.println("非空");
            sysuserList = sysuserService.getAll(pageQuerySQL,sysuser);
        }else {
            System.out.println("空值");
            sysuser.setUsername("");
            sysuserList = sysuserService.getAll(pageQuerySQL,sysuser);
        }

        int count=sysuserService.count();
        DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
        dataGridResultInfo.setRows(sysuserList);
        dataGridResultInfo.setTotal(count);
        dataGridResultInfo.setFooter(sysuserList);
        return dataGridResultInfo;
    }

}
