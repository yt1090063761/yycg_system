package yycg.base.service;

import yycg.base.pojo.Useryy;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface useryyService {
    /**
     * 计算医院用户总数
     * @return
     */
    int count();

    /**
     * 分页查询首页信息
     * @param pageQuerySQL
     * @return
     */
    List<Useryy> allUseryy(PageQuerySQL pageQuerySQL);

    /**
     * 根据id查询医院的相关信息
     * @param id
     * @return
     */
    Useryy selectByid(String id);

    /**
     * 添加
     * @param useryy
     */
    void insert(Useryy useryy);

    /**
     * 修改
     * @param useryy
     */
    void update(Useryy useryy);
}
