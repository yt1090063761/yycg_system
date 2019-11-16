package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import yycg.base.dao.mapper.UseryyMapper;
import yycg.base.pojo.Useryy;
import yycg.base.service.useryyService;
import yycg.base.vo.PageQuery;
import yycg.base.vo.PageQuerySQL;

import java.util.List;

public class useryyImpl implements useryyService {
    @Autowired
    private UseryyMapper useryyMapper;

    @Override
    public int count() {
        return useryyMapper.count();
    }

    @Override
    public List<Useryy> allUseryy(PageQuerySQL pageQuerySQL) {

        return useryyMapper.selectAll(pageQuerySQL);
    }

    @Override
    public Useryy selectByid(String id) {
        return useryyMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(Useryy useryy) {
        useryyMapper.insertSelective(useryy);
    }

    @Override
    public void update(Useryy useryy) {
        useryyMapper.updateByPrimaryKey(useryy);
    }
}
