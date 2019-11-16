package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.mapper.UsergysMapper;
import yycg.base.pojo.Usergys;
import yycg.base.service.usergysService;
import yycg.base.vo.PageQuerySQL;

import java.util.List;
@Service("usergysService")
public class usergysImpl implements usergysService{
    @Autowired

    private UsergysMapper usergysMapper;

    @Override
    public int count() {
        return usergysMapper.count();
    }

    @Override
    public List<Usergys> selectByPage(PageQuerySQL pageQuerySQL) {


    List<Usergys> usergys=   usergysMapper.selectByPage(pageQuerySQL);

        System.out.println(usergys.size());


        return usergys;
    }
}
