package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.pojo.Sysuser;
import yycg.base.service.SysuserService;
@Service
public class SysuserImpl implements SysuserService {
@Autowired
    private SysuserMapper sysuserMapper;
    @Override
    public Sysuser findBySysuserID(String id) {
        return sysuserMapper.selectByPrimaryKey(id);
    }
}
