package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_blocktrade
 */
@TableName(value ="cn_stock_blocktrade")
@Data
public class CnStockBlocktrade implements Serializable {
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
    @TableField(value = "new_price")
    private Double new_price;

    /**
     * 
     */
    @TableField(value = "change_rate")
    private Double change_rate;

    /**
     * 
     */
    @TableField(value = "average_price")
    private Double average_price;

    /**
     * 
     */
    @TableField(value = "overflow_rate")
    private Double overflow_rate;

    /**
     * 
     */
    @TableField(value = "trade_number")
    private Double trade_number;

    /**
     * 
     */
    @TableField(value = "sum_volume")
    private Double sum_volume;

    /**
     * 
     */
    @TableField(value = "sum_turnover")
    private Double sum_turnover;

    /**
     * 
     */
    @TableField(value = "turnover_market_rate")
    private Double turnover_market_rate;

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
        CnStockBlocktrade other = (CnStockBlocktrade) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNew_price() == null ? other.getNew_price() == null : this.getNew_price().equals(other.getNew_price()))
            && (this.getChange_rate() == null ? other.getChange_rate() == null : this.getChange_rate().equals(other.getChange_rate()))
            && (this.getAverage_price() == null ? other.getAverage_price() == null : this.getAverage_price().equals(other.getAverage_price()))
            && (this.getOverflow_rate() == null ? other.getOverflow_rate() == null : this.getOverflow_rate().equals(other.getOverflow_rate()))
            && (this.getTrade_number() == null ? other.getTrade_number() == null : this.getTrade_number().equals(other.getTrade_number()))
            && (this.getSum_volume() == null ? other.getSum_volume() == null : this.getSum_volume().equals(other.getSum_volume()))
            && (this.getSum_turnover() == null ? other.getSum_turnover() == null : this.getSum_turnover().equals(other.getSum_turnover()))
            && (this.getTurnover_market_rate() == null ? other.getTurnover_market_rate() == null : this.getTurnover_market_rate().equals(other.getTurnover_market_rate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNew_price() == null) ? 0 : getNew_price().hashCode());
        result = prime * result + ((getChange_rate() == null) ? 0 : getChange_rate().hashCode());
        result = prime * result + ((getAverage_price() == null) ? 0 : getAverage_price().hashCode());
        result = prime * result + ((getOverflow_rate() == null) ? 0 : getOverflow_rate().hashCode());
        result = prime * result + ((getTrade_number() == null) ? 0 : getTrade_number().hashCode());
        result = prime * result + ((getSum_volume() == null) ? 0 : getSum_volume().hashCode());
        result = prime * result + ((getSum_turnover() == null) ? 0 : getSum_turnover().hashCode());
        result = prime * result + ((getTurnover_market_rate() == null) ? 0 : getTurnover_market_rate().hashCode());
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
        sb.append(", new_price=").append(new_price);
        sb.append(", change_rate=").append(change_rate);
        sb.append(", average_price=").append(average_price);
        sb.append(", overflow_rate=").append(overflow_rate);
        sb.append(", trade_number=").append(trade_number);
        sb.append(", sum_volume=").append(sum_volume);
        sb.append(", sum_turnover=").append(sum_turnover);
        sb.append(", turnover_market_rate=").append(turnover_market_rate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}