package yycg.base.service;

import yycg.base.pojo.Usergys;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface usergysService {
    /**
     * 查询总条数
     * @return
     */
     int count();

    /**
     * 分页查询出供应商的信息
     * @param pageQuerySQL
     * @return
     */
    List<Usergys> selectByPage(PageQuerySQL pageQuerySQL);
}
