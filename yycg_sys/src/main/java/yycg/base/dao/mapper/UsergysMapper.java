package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Usergys;
import yycg.base.pojo.UsergysExample;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public interface UsergysMapper {
    int count();
    List<Usergys> selectByPage(PageQuerySQL pageQuerySQL);

    long countByExample(UsergysExample example);

    int deleteByExample(UsergysExample example);

    int deleteByPrimaryKey(String id);

    int insert(Usergys record);

    int insertSelective(Usergys record);

    List<Usergys> selectByExampleWithBLOBs(UsergysExample example);

    List<Usergys> selectByExample(UsergysExample example);

    Usergys selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByExampleWithBLOBs(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByExample(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByPrimaryKeySelective(Usergys record);

    int updateByPrimaryKeyWithBLOBs(Usergys record);

    int updateByPrimaryKey(Usergys record);
}