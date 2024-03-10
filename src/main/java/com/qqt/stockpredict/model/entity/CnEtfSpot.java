package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_etf_spot
 */
@TableName(value ="cn_etf_spot")
@Data
public class CnEtfSpot implements Serializable {
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
    @TableField(value = "ups_downs")
    private Double ups_downs;

    /**
     * 
     */
    @TableField(value = "volume")
    private Long volume;

    /**
     * 
     */
    @TableField(value = "deal_amount")
    private Long deal_amount;

    /**
     * 
     */
    @TableField(value = "open_price")
    private Double open_price;

    /**
     * 
     */
    @TableField(value = "high_price")
    private Double high_price;

    /**
     * 
     */
    @TableField(value = "low_price")
    private Double low_price;

    /**
     * 
     */
    @TableField(value = "pre_close_price")
    private Double pre_close_price;

    /**
     * 
     */
    @TableField(value = "turnoverrate")
    private Double turnoverrate;

    /**
     * 
     */
    @TableField(value = "total_market_cap")
    private Long total_market_cap;

    /**
     * 
     */
    @TableField(value = "free_cap")
    private Long free_cap;

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
        CnEtfSpot other = (CnEtfSpot) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNew_price() == null ? other.getNew_price() == null : this.getNew_price().equals(other.getNew_price()))
            && (this.getChange_rate() == null ? other.getChange_rate() == null : this.getChange_rate().equals(other.getChange_rate()))
            && (this.getUps_downs() == null ? other.getUps_downs() == null : this.getUps_downs().equals(other.getUps_downs()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getDeal_amount() == null ? other.getDeal_amount() == null : this.getDeal_amount().equals(other.getDeal_amount()))
            && (this.getOpen_price() == null ? other.getOpen_price() == null : this.getOpen_price().equals(other.getOpen_price()))
            && (this.getHigh_price() == null ? other.getHigh_price() == null : this.getHigh_price().equals(other.getHigh_price()))
            && (this.getLow_price() == null ? other.getLow_price() == null : this.getLow_price().equals(other.getLow_price()))
            && (this.getPre_close_price() == null ? other.getPre_close_price() == null : this.getPre_close_price().equals(other.getPre_close_price()))
            && (this.getTurnoverrate() == null ? other.getTurnoverrate() == null : this.getTurnoverrate().equals(other.getTurnoverrate()))
            && (this.getTotal_market_cap() == null ? other.getTotal_market_cap() == null : this.getTotal_market_cap().equals(other.getTotal_market_cap()))
            && (this.getFree_cap() == null ? other.getFree_cap() == null : this.getFree_cap().equals(other.getFree_cap()));
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
        result = prime * result + ((getUps_downs() == null) ? 0 : getUps_downs().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getDeal_amount() == null) ? 0 : getDeal_amount().hashCode());
        result = prime * result + ((getOpen_price() == null) ? 0 : getOpen_price().hashCode());
        result = prime * result + ((getHigh_price() == null) ? 0 : getHigh_price().hashCode());
        result = prime * result + ((getLow_price() == null) ? 0 : getLow_price().hashCode());
        result = prime * result + ((getPre_close_price() == null) ? 0 : getPre_close_price().hashCode());
        result = prime * result + ((getTurnoverrate() == null) ? 0 : getTurnoverrate().hashCode());
        result = prime * result + ((getTotal_market_cap() == null) ? 0 : getTotal_market_cap().hashCode());
        result = prime * result + ((getFree_cap() == null) ? 0 : getFree_cap().hashCode());
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
        sb.append(", ups_downs=").append(ups_downs);
        sb.append(", volume=").append(volume);
        sb.append(", deal_amount=").append(deal_amount);
        sb.append(", open_price=").append(open_price);
        sb.append(", high_price=").append(high_price);
        sb.append(", low_price=").append(low_price);
        sb.append(", pre_close_price=").append(pre_close_price);
        sb.append(", turnoverrate=").append(turnoverrate);
        sb.append(", total_market_cap=").append(total_market_cap);
        sb.append(", free_cap=").append(free_cap);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}