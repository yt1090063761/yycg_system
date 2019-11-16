package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Usergysarea;
import yycg.base.pojo.UsergysareaExample;
import yycg.base.pojo.UsergysareaKey;

import java.util.List;

public interface UsergysareaMapper {
    long countByExample(UsergysareaExample example);

    int deleteByExample(UsergysareaExample example);

    int deleteByPrimaryKey(UsergysareaKey key);

    int insert(Usergysarea record);

    int insertSelective(Usergysarea record);

    List<Usergysarea> selectByExample(UsergysareaExample example);

    Usergysarea selectByPrimaryKey(UsergysareaKey key);

    int updateByExampleSelective(@Param("record") Usergysarea record, @Param("example") UsergysareaExample example);

    int updateByExample(@Param("record") Usergysarea record, @Param("example") UsergysareaExample example);

    int updateByPrimaryKeySelective(Usergysarea record);

    int updateByPrimaryKey(Usergysarea record);
}