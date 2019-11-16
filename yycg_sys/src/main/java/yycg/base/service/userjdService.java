package yycg.base.service;

import yycg.base.pojo.BssSysArea;
import yycg.base.pojo.Userjd;
import yycg.base.vo.PageQuery;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface userjdService {
    /**
     *
     * @param pageQuerySQL
     * @return
     */
    public List<Userjd> findAllUserjd(PageQuerySQL pageQuerySQL);

    /**
     * 查询的是数据的总条数
     * @return
     */
    public int userjdTototal();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Userjd selectByID(String id);

    /**
     * 添加，
     * @param userjd
     */
    public void insertUserjd(Userjd userjd);

    /**
     * 查询 管理地区
     * @param id  id是一个数组，当值为1，查询的是顶级的管理地区（1 市级），2为乡镇，3为村
     * @return
     */
    public List<BssSysArea> selectLv(Integer[] id);

    /**
     * 修改
     * @param userjd
     */
    public void update(Userjd userjd);

    /**
     * 根据id删除监管单位信息
     * @param id
     */
    public void delByID(String id);
}
