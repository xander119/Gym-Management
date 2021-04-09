package cn.gym.mgt.comon;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class RequestPage implements Serializable {
    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页码")
    private Integer pageNum;
    /**
     * 每页数量
     */
    @ApiModelProperty(value = "每页数量")
    private Integer pageSize;
    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数")
    private Integer totalPage;
    /**
     * 总条数
     */
    @ApiModelProperty(value = "总条数")
    private Long total;

    public RequestPage() {
        this.pageNum = 1;
        this.pageSize = 10;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
