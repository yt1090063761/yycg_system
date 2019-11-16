package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.pojo.Custom.PageQuerySQLCustom;
import yycg.base.pojo.Sysuser;
import yycg.base.service.SysuserService;
import yycg.base.vo.PageQuerySQL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysuserImpl implements SysuserService {
    @Autowired
    public SysuserMapper sysuserMapper;

    @Override
    public Sysuser findBySysuserID(String id) {
        return sysuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sysuser> getAll(PageQuerySQL pageQuerySQL, Sysuser sysuser) {
        Map<String, Object> map = new HashMap<>();
        map.put("sysuser", sysuser);
        map.put("pageQuerySQL", pageQuerySQL);
        System.out.println(pageQuerySQL.getPage());

        System.out.println(map.size());
        return sysuserMapper.selectAll(map);
    }

    @Override
    public int count() {
        return sysuserMapper.count();
    }

}
