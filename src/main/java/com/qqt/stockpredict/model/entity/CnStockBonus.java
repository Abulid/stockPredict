package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_bonus
 */
@TableName(value ="cn_stock_bonus")
@Data
public class CnStockBonus implements Serializable {
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
    @TableField(value = "convertible_total_rate")
    private Double convertible_total_rate;

    /**
     * 
     */
    @TableField(value = "convertible_rate")
    private Double convertible_rate;

    /**
     * 
     */
    @TableField(value = "convertible_transfer_rate")
    private Double convertible_transfer_rate;

    /**
     * 
     */
    @TableField(value = "bonusaward_rate")
    private Double bonusaward_rate;

    /**
     * 
     */
    @TableField(value = "bonusaward_yield")
    private Double bonusaward_yield;

    /**
     * 
     */
    @TableField(value = "basic_eps")
    private Double basic_eps;

    /**
     * 
     */
    @TableField(value = "bvps")
    private Double bvps;

    /**
     * 
     */
    @TableField(value = "per_capital_reserve")
    private Double per_capital_reserve;

    /**
     * 
     */
    @TableField(value = "per_unassign_profit")
    private Double per_unassign_profit;

    /**
     * 
     */
    @TableField(value = "netprofit_yoy_ratio")
    private Double netprofit_yoy_ratio;

    /**
     * 
     */
    @TableField(value = "total_shares")
    private Long total_shares;

    /**
     * 
     */
    @TableField(value = "plan_date")
    private LocalDate plan_date;

    /**
     * 
     */
    @TableField(value = "record_date")
    private LocalDate record_date;

    /**
     * 
     */
    @TableField(value = "ex_dividend_date")
    private LocalDate ex_dividend_date;

    /**
     * 
     */
    @TableField(value = "progress")
    private String progress;

    /**
     * 
     */
    @TableField(value = "report_date")
    private LocalDate report_date;

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
        CnStockBonus other = (CnStockBonus) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getConvertible_total_rate() == null ? other.getConvertible_total_rate() == null : this.getConvertible_total_rate().equals(other.getConvertible_total_rate()))
            && (this.getConvertible_rate() == null ? other.getConvertible_rate() == null : this.getConvertible_rate().equals(other.getConvertible_rate()))
            && (this.getConvertible_transfer_rate() == null ? other.getConvertible_transfer_rate() == null : this.getConvertible_transfer_rate().equals(other.getConvertible_transfer_rate()))
            && (this.getBonusaward_rate() == null ? other.getBonusaward_rate() == null : this.getBonusaward_rate().equals(other.getBonusaward_rate()))
            && (this.getBonusaward_yield() == null ? other.getBonusaward_yield() == null : this.getBonusaward_yield().equals(other.getBonusaward_yield()))
            && (this.getBasic_eps() == null ? other.getBasic_eps() == null : this.getBasic_eps().equals(other.getBasic_eps()))
            && (this.getBvps() == null ? other.getBvps() == null : this.getBvps().equals(other.getBvps()))
            && (this.getPer_capital_reserve() == null ? other.getPer_capital_reserve() == null : this.getPer_capital_reserve().equals(other.getPer_capital_reserve()))
            && (this.getPer_unassign_profit() == null ? other.getPer_unassign_profit() == null : this.getPer_unassign_profit().equals(other.getPer_unassign_profit()))
            && (this.getNetprofit_yoy_ratio() == null ? other.getNetprofit_yoy_ratio() == null : this.getNetprofit_yoy_ratio().equals(other.getNetprofit_yoy_ratio()))
            && (this.getTotal_shares() == null ? other.getTotal_shares() == null : this.getTotal_shares().equals(other.getTotal_shares()))
            && (this.getPlan_date() == null ? other.getPlan_date() == null : this.getPlan_date().equals(other.getPlan_date()))
            && (this.getRecord_date() == null ? other.getRecord_date() == null : this.getRecord_date().equals(other.getRecord_date()))
            && (this.getEx_dividend_date() == null ? other.getEx_dividend_date() == null : this.getEx_dividend_date().equals(other.getEx_dividend_date()))
            && (this.getProgress() == null ? other.getProgress() == null : this.getProgress().equals(other.getProgress()))
            && (this.getReport_date() == null ? other.getReport_date() == null : this.getReport_date().equals(other.getReport_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getConvertible_total_rate() == null) ? 0 : getConvertible_total_rate().hashCode());
        result = prime * result + ((getConvertible_rate() == null) ? 0 : getConvertible_rate().hashCode());
        result = prime * result + ((getConvertible_transfer_rate() == null) ? 0 : getConvertible_transfer_rate().hashCode());
        result = prime * result + ((getBonusaward_rate() == null) ? 0 : getBonusaward_rate().hashCode());
        result = prime * result + ((getBonusaward_yield() == null) ? 0 : getBonusaward_yield().hashCode());
        result = prime * result + ((getBasic_eps() == null) ? 0 : getBasic_eps().hashCode());
        result = prime * result + ((getBvps() == null) ? 0 : getBvps().hashCode());
        result = prime * result + ((getPer_capital_reserve() == null) ? 0 : getPer_capital_reserve().hashCode());
        result = prime * result + ((getPer_unassign_profit() == null) ? 0 : getPer_unassign_profit().hashCode());
        result = prime * result + ((getNetprofit_yoy_ratio() == null) ? 0 : getNetprofit_yoy_ratio().hashCode());
        result = prime * result + ((getTotal_shares() == null) ? 0 : getTotal_shares().hashCode());
        result = prime * result + ((getPlan_date() == null) ? 0 : getPlan_date().hashCode());
        result = prime * result + ((getRecord_date() == null) ? 0 : getRecord_date().hashCode());
        result = prime * result + ((getEx_dividend_date() == null) ? 0 : getEx_dividend_date().hashCode());
        result = prime * result + ((getProgress() == null) ? 0 : getProgress().hashCode());
        result = prime * result + ((getReport_date() == null) ? 0 : getReport_date().hashCode());
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
        sb.append(", convertible_total_rate=").append(convertible_total_rate);
        sb.append(", convertible_rate=").append(convertible_rate);
        sb.append(", convertible_transfer_rate=").append(convertible_transfer_rate);
        sb.append(", bonusaward_rate=").append(bonusaward_rate);
        sb.append(", bonusaward_yield=").append(bonusaward_yield);
        sb.append(", basic_eps=").append(basic_eps);
        sb.append(", bvps=").append(bvps);
        sb.append(", per_capital_reserve=").append(per_capital_reserve);
        sb.append(", per_unassign_profit=").append(per_unassign_profit);
        sb.append(", netprofit_yoy_ratio=").append(netprofit_yoy_ratio);
        sb.append(", total_shares=").append(total_shares);
        sb.append(", plan_date=").append(plan_date);
        sb.append(", record_date=").append(record_date);
        sb.append(", ex_dividend_date=").append(ex_dividend_date);
        sb.append(", progress=").append(progress);
        sb.append(", report_date=").append(report_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}