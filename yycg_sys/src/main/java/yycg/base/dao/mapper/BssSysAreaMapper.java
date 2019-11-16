package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysArea;
import yycg.base.pojo.BssSysAreaExample;

import java.util.List;

public interface BssSysAreaMapper {

    List<BssSysArea> selectByTwo(@Param("levels") Integer[] levels);


    long countByExample(BssSysAreaExample example);

    int deleteByExample(BssSysAreaExample example);

    int deleteByPrimaryKey(String areaid);

    int insert(BssSysArea record);

    int insertSelective(BssSysArea record);

    List<BssSysArea> selectByExample(BssSysAreaExample example);

    BssSysArea selectByPrimaryKey(String areaid);

    int updateByExampleSelective(@Param("record") BssSysArea record, @Param("example") BssSysAreaExample example);

    int updateByExample(@Param("record") BssSysArea record, @Param("example") BssSysAreaExample example);

    int updateByPrimaryKeySelective(BssSysArea record);

    int updateByPrimaryKey(BssSysArea record);
}