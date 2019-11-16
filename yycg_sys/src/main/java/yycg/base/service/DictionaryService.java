package yycg.base.service;

import yycg.base.pojo.Dicttype;

import java.util.Dictionary;
import java.util.List;

public interface DictionaryService {
    /**
     * 查询类别，参数是类型编码
     * @param type
     * @return
     */
    List<Dicttype> yytype(String type);
}
