package yycg.base.vo;

import java.util.ArrayList;
import java.util.List;

public class DataGridResultInfo {
    //操作结果信息
    //  private ResultInfo resultInfo;

    //总条数
    private int total;
    //结果集
    private List rows = new ArrayList();

    //总计告诉footer
    private List footer = new ArrayList();

    public DataGridResultInfo() {
    }

    public DataGridResultInfo(int total, List rows, List footer) {
        this.total = total;
        this.rows = rows;
        this.footer = footer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public List getFooter() {
        return footer;
    }

    public void setFooter(List footer) {
        this.footer = footer;
    }


}
