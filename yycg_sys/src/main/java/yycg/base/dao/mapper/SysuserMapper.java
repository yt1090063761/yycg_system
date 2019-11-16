package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Custom.PageQuerySQLCustom;
import yycg.base.pojo.Sysuser;
import yycg.base.pojo.SysuserExample;
import yycg.base.vo.PageQuerySQL;

import java.util.List;
import java.util.Map;

public interface SysuserMapper {
    /**
     * 查询所有用户
     * @return
     */
   List<Sysuser> selectAll(Map<String,Object> map);

    /**
     * 查总条数
     * @return
     */
   int count();

    long countByExample(SysuserExample example);

    int deleteByExample(SysuserExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    List<Sysuser> selectByExample(SysuserExample example);

    /**
     * 根据查询监管单位信息
     * @param id
     * @return
     */
    Sysuser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);
}