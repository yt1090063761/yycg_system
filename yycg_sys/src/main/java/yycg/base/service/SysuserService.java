package yycg.base.service;

import yycg.base.pojo.Custom.PageQuerySQLCustom;
import yycg.base.pojo.Sysuser;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface SysuserService {
    /**
     *这个是登陆的时候暂时使用
     * @param id
     * @return
     */
    public Sysuser findBySysuserID(String id);

    /**
     * 查询所有的用户
     * @return
     */
    public List<Sysuser> getAll(PageQuerySQL pageQuerySQL,Sysuser sysuser);

    /**
     * 总数
     * @return
     */
    int count();


}
