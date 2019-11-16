package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Userjd;
import yycg.base.pojo.UserjdExample;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface UserjdMapper {
    List<Userjd> selectAllUserjd(PageQuerySQL pageQuerySQL);

    int userjdTototal();

    long countByExample(UserjdExample example);

    int deleteByExample(UserjdExample example);

    int deleteByPrimaryKey(String id);

    int insert(Userjd record);

    int insertSelective(Userjd record);

    List<Userjd> selectByExample(UserjdExample example);

    Userjd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Userjd record, @Param("example") UserjdExample example);

    int updateByExample(@Param("record") Userjd record, @Param("example") UserjdExample example);

    int updateByPrimaryKeySelective(Userjd record);

    int updateByPrimaryKey(Userjd record);
}