package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.BssSysArea;
import yycg.base.pojo.Dicttype;
import yycg.base.pojo.Useryy;
import yycg.base.service.DictionaryService;
import yycg.base.service.userjdService;
import yycg.base.service.useryyService;
import yycg.base.vo.DataGridResultInfo;
import yycg.base.vo.PageQuerySQL;
import yycg.base.vo.Ztree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * 医院维护
 */

@Controller
@RequestMapping("yyuser")
public class YyuserAction {
    @Autowired
    private useryyService useryyService;
    @Autowired
    private DictionaryService dictionaryService;
    @Autowired
    private userjdService userjdService;


    /**
     * 跳转添加页面
     *
     * @return
     */
    @RequestMapping("useryyedit_add")
    public String add_jsp() {
        return "base/user/useryyedit";
    }

    /**
     * 跳转修改页面
     *
     * @param editid
     * @param model
     * @return
     */
    @RequestMapping("useryyedit")
    public String useryyedit_jsp(String editid, Model model) {

        Useryy useryy = useryyService.selectByid(editid);
        List<Dicttype> dicttypes = dictionaryService.yytype("");
        model.addAttribute("useryy", useryy);
        model.addAttribute("yylbList", dicttypes);

        return "base/user/useryyedit";
    }

    /**
     * 保存或者修改
     *
     * @param
     * @return
     */
    @RequestMapping("useryysave")
    public String insertOrUpdate(Useryy useryy) {
        if (useryy.getId() != "" && !useryy.getId().equals("")) {
            //修改
            useryyService.update(useryy);
        } else {
            //添加
            System.out.println("添加"+useryy.getDq());
            useryyService.insert(useryy);
        }

        return "";
    }

    /**
     * 查看详情
     *
     * @param editid 医院id
     * @param model
     * @return
     */
    @RequestMapping("useryyview")
    public String useryyview_jsp(String editid, Model model) {
        Useryy useryy = useryyService.selectByid(editid);
        model.addAttribute("useryy", useryy);
        return "base/user/useryyview";
    }

    /**
     * 医院维护的首页数据
     *
     * @param pageQuerySQL 分页参数的包装类
     * @return
     */
    @RequestMapping("useryyquery_result")
    public @ResponseBody
    DataGridResultInfo result(PageQuerySQL pageQuerySQL) {

        // 总数
        int count = useryyService.count();
        List<Useryy> useryys = useryyService.allUseryy(pageQuerySQL);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        dataGridResultInfo.setRows(useryys);
        dataGridResultInfo.setTotal(count);
        return dataGridResultInfo;
    }

    /**
     * 跳转首页
     *
     * @return
     */
    //页面
    @RequestMapping("useryyquery")
    public String useryyquery_jsp(Model model) {

        List<Dicttype> dicttypes = dictionaryService.yytype("006");

        model.addAttribute("yylbList", dicttypes.get(0).getDictinfo());

        return "base/user/useryyquery";
    }

    /**
     * 地区加载
     * @param otherParam
     * @param areaid
     * @return
     */
    @RequestMapping("areaload/sync")
    public @ResponseBody
    List<Ztree> areaload(String otherParam, String areaid) {

        //数组里的就是数据库的arealevel字段的值
        List<BssSysArea> bssSysAreas = userjdService.selectLv(new Integer[]{1,2,3});
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

}
