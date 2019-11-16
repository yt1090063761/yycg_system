package yycg.base.dao.mapper;

import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Dicttype;
import yycg.base.pojo.DicttypeExample;

import java.util.List;

public interface DicttypeMapper {
    /**
     * 根据id查医院类型
     * @param example
     * @return
     */
    List<Dicttype> selectByTypecode(String typecode);

    long countByExample(DicttypeExample example);

    int deleteByExample(DicttypeExample example);

    int deleteByPrimaryKey(String typecode);

    int insert(Dicttype record);

    int insertSelective(Dicttype record);

    List<Dicttype> selectByExample(DicttypeExample example);

    Dicttype selectByPrimaryKey(String typecode);

    int updateByExampleSelective(@Param("record") Dicttype record, @Param("example") DicttypeExample example);

    int updateByExample(@Param("record") Dicttype record, @Param("example") DicttypeExample example);

    int updateByPrimaryKeySelective(Dicttype record);

    int updateByPrimaryKey(Dicttype record);
}