package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_top
 */
@TableName(value ="cn_stock_top")
@Data
public class CnStockTop implements Serializable {
    /**
     * 
     */
    @TableId(value = "date")
    private LocalDate date;

    /**
     * 
     */
    @TableId(value = "code")
    private String code;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "ranking_times")
    private Double ranking_times;

    /**
     * 
     */
    @TableField(value = "sum_buy")
    private Double sum_buy;

    /**
     * 
     */
    @TableField(value = "sum_sell")
    private Double sum_sell;

    /**
     * 
     */
    @TableField(value = "net_amount")
    private Double net_amount;

    /**
     * 
     */
    @TableField(value = "buy_seat")
    private Double buy_seat;

    /**
     * 
     */
    @TableField(value = "sell_seat")
    private Double sell_seat;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CnStockTop other = (CnStockTop) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRanking_times() == null ? other.getRanking_times() == null : this.getRanking_times().equals(other.getRanking_times()))
            && (this.getSum_buy() == null ? other.getSum_buy() == null : this.getSum_buy().equals(other.getSum_buy()))
            && (this.getSum_sell() == null ? other.getSum_sell() == null : this.getSum_sell().equals(other.getSum_sell()))
            && (this.getNet_amount() == null ? other.getNet_amount() == null : this.getNet_amount().equals(other.getNet_amount()))
            && (this.getBuy_seat() == null ? other.getBuy_seat() == null : this.getBuy_seat().equals(other.getBuy_seat()))
            && (this.getSell_seat() == null ? other.getSell_seat() == null : this.getSell_seat().equals(other.getSell_seat()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRanking_times() == null) ? 0 : getRanking_times().hashCode());
        result = prime * result + ((getSum_buy() == null) ? 0 : getSum_buy().hashCode());
        result = prime * result + ((getSum_sell() == null) ? 0 : getSum_sell().hashCode());
        result = prime * result + ((getNet_amount() == null) ? 0 : getNet_amount().hashCode());
        result = prime * result + ((getBuy_seat() == null) ? 0 : getBuy_seat().hashCode());
        result = prime * result + ((getSell_seat() == null) ? 0 : getSell_seat().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", date=").append(date);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", ranking_times=").append(ranking_times);
        sb.append(", sum_buy=").append(sum_buy);
        sb.append(", sum_sell=").append(sum_sell);
        sb.append(", net_amount=").append(net_amount);
        sb.append(", buy_seat=").append(buy_seat);
        sb.append(", sell_seat=").append(sell_seat);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}