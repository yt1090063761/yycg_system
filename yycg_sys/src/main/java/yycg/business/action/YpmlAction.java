package yycg.business.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.vo.DataGridResultInfo;
import yycg.base.vo.PageQuerySQL;

@Controller
@RequestMapping("ypml")
public class YpmlAction {

    @RequestMapping("ypxxquery")
    public String yyml_jsp(){
        System.out.println("药品目录");
        return "/business/ypml/querygysypml";
    }

    @RequestMapping("querygysypml_result")
    public DataGridResultInfo getAllypml(PageQuerySQL pageQuerySQL){
        DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();

        return dataGridResultInfo;
    }
}
