package yycg.base.action;

import com.mchange.v2.codegen.bean.PropsToStringGeneratorExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.Usergys;
import yycg.base.pojo.Usergysarea;
import yycg.base.service.usergysService;
import yycg.base.vo.DataGridResultInfo;
import yycg.base.vo.PageQuery;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

@Controller
@RequestMapping("gysuser")
public class GyUserAcction {
    @Autowired
    private usergysService usergysService;

    /**
     * 供应商首页
     *
     * @return
     */
    @RequestMapping("usergysquery")
    public String index() {

        return "base/user/usergysquery";
    }

    @RequestMapping("usergysquery_result")
    public @ResponseBody
    DataGridResultInfo index_data(PageQuerySQL pageQuerySQL) {

        //System.out.println(pageQuerySQL.getRows());
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        dataGridResultInfo.setTotal(usergysService.count());
        List<Usergys> usergys = usergysService.selectByPage(pageQuerySQL);
        dataGridResultInfo.setRows(usergys);

//        for (int i=0;i<usergys.size();i++){//取userarea
//
//            List<Usergysarea> list=usergys.get(i).getUsergysarea();
//            for (int i1=0;i1<list.size();i1++){
//                System.out.println(usergys.get(i).getId());
//      //          System.out.println(list.get(i1).getBssSysArea().getAreaid());
//                System.out.println(list.get(i1).getBssSysArea().getAreaname());
//            }
//
//
//
//        }


//        System.out.println("sql长度"+usergysService.selectByPage(pageQuerySQL).size());
//        System.out.println("总条数"+usergysService.count());
//        System.out.println("数据长度"+dataGridResultInfo.getRows().size());
        // System.out.println(usergysService.selectByPage(pageQuerySQL).get(0).getUsergysarea().get(0).getBssSysArea().getAreaname());
        return dataGridResultInfo;
    }

}
