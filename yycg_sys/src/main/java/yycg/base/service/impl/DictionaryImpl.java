package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.mapper.DicttypeMapper;
import yycg.base.pojo.Dicttype;
import yycg.base.service.DictionaryService;

import java.util.Dictionary;
import java.util.List;
@Service("dictionaryService")
public class DictionaryImpl implements DictionaryService{
    @Autowired
  private DicttypeMapper dicttypeMapper;

    @Override
    public List<Dicttype> yytype(String type) {
        return dicttypeMapper.selectByTypecode(type);
    }
}
