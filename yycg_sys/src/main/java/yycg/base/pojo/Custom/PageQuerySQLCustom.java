package yycg.base.pojo.Custom;

import yycg.base.pojo.Sysuser;
import yycg.base.vo.PageQuerySQL;

/**
 * 作为pagequerysql的扩展类，用于同时实现条件查询和分页的参数包装
 */
public class PageQuerySQLCustom extends PageQuerySQL {
    private Sysuser sysuser;

    public Sysuser getSysuser() {
        return sysuser;
    }

    public void setSysuser(Sysuser sysuser) {
        this.sysuser = sysuser;
    }
}
