package yycg.base.service.impl;

import org.apache.ibatis.type.DoubleTypeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.mapper.BssSysAreaMapper;
import yycg.base.dao.mapper.UserjdMapper;
import yycg.base.pojo.BssSysArea;
import yycg.base.pojo.Userjd;
import yycg.base.service.userjdService;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

@Service
public class userjdImpl implements userjdService {
@Autowired
private UserjdMapper userjdMapper;
@Autowired
private BssSysAreaMapper bssSysAreaMapper;
    @Override
    public List<Userjd> findAllUserjd(PageQuerySQL pageQuerySQL) {

       // System.out.println("12");
        return userjdMapper.selectAllUserjd(pageQuerySQL);
    }

    @Override
    public int userjdTototal() {

        return userjdMapper.userjdTototal();
    }

    @Override
    public Userjd selectByID(String id) {
        return userjdMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertUserjd(Userjd userjd) {
        userjdMapper.insertSelective(userjd);
    }

    @Override
    public List<BssSysArea> selectLv(Integer[] id) {
        return bssSysAreaMapper.selectByTwo(id);
    }

    @Override
    public void update(Userjd userjd) {
        userjdMapper.updateByPrimaryKeySelective(userjd);
    }

    @Override
    public void delByID(String id) {
        userjdMapper.deleteByPrimaryKey(id);
    }
}
