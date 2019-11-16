package yycg.base.vo;

/**
 * 包装分页的参数，用来只用来传递和接收数据不做处理
 */
public class PageQuerySQL {
    private int rows;//每行的个数
    private int page;//页码
    private int total;//总数
    private String dq;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDq() {
        return dq;
    }

    public PageQuerySQL(int rows, int page, int total, String dq, String name) {
        this.rows = rows;
        this.page = page;
        this.total = total;
        this.dq = dq;
        this.name = name;
    }

    public PageQuerySQL(int rows, int page, int total, String dq) {
        this.rows = rows;
        this.page = page;
        this.total = total;
        this.dq = dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public PageQuerySQL(int rows, int page, int total) {
        this.rows = rows;
        this.page = page;
        this.total = total;
    }

    public int getTatol() {
        return total;
    }

    public void setTatol(int tatol) {
        this.total = tatol;
    }

    public PageQuerySQL(int rows, int page) {
        this.rows = rows;
        this.page = page;
    }

    public PageQuerySQL() {
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
