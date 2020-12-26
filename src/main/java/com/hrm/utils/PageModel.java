package com.hrm.utils;

public class PageModel {
    private int pageIndex;//页码
    private int pageSize=4; //页码大小
    private int totalSize;
    private int rocordCount;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalSize() {//计算得到页码值
        if(rocordCount%pageSize==0)
        {
            totalSize=rocordCount/pageSize;//页码总数=所有条数/页码大小4

        }else
        {
            totalSize=rocordCount/pageSize +1;
        }
        return totalSize;
    }


    public int getRocordCount() {
        return rocordCount;
    }

    public void setRocordCount(int rocordCount) {
        this.rocordCount = rocordCount;
    }
    //获取分页查询，当前页的第一个索引值
    public int getFirstLimitParam(){
        return  (this.getPageIndex()-1)*this.pageSize;
    }
}
