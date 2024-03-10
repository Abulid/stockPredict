package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_fund_flow_concept
 */
@TableName(value ="cn_stock_fund_flow_concept")
@Data
public class CnStockFundFlowConcept implements Serializable {
    /**
     * 
     */
    @TableId(value = "date")
    private LocalDate date;

    /**
     * 
     */
    @TableId(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "change_rate")
    private Double change_rate;

    /**
     * 
     */
    @TableField(value = "fund_amount")
    private Long fund_amount;

    /**
     * 
     */
    @TableField(value = "fund_rate")
    private Double fund_rate;

    /**
     * 
     */
    @TableField(value = "fund_amount_super")
    private Long fund_amount_super;

    /**
     * 
     */
    @TableField(value = "fund_rate_super")
    private Double fund_rate_super;

    /**
     * 
     */
    @TableField(value = "fund_amount_large")
    private Long fund_amount_large;

    /**
     * 
     */
    @TableField(value = "fund_rate_large")
    private Double fund_rate_large;

    /**
     * 
     */
    @TableField(value = "fund_amount_medium")
    private Long fund_amount_medium;

    /**
     * 
     */
    @TableField(value = "fund_rate_medium")
    private Double fund_rate_medium;

    /**
     * 
     */
    @TableField(value = "fund_amount_small")
    private Long fund_amount_small;

    /**
     * 
     */
    @TableField(value = "fund_rate_small")
    private Double fund_rate_small;

    /**
     * 
     */
    @TableField(value = "stock_name")
    private String stock_name;

    /**
     * 
     */
    @TableField(value = "change_rate_5")
    private Double change_rate_5;

    /**
     * 
     */
    @TableField(value = "fund_amount_5")
    private Long fund_amount_5;

    /**
     * 
     */
    @TableField(value = "fund_rate_5")
    private Double fund_rate_5;

    /**
     * 
     */
    @TableField(value = "fund_amount_super_5")
    private Long fund_amount_super_5;

    /**
     * 
     */
    @TableField(value = "fund_rate_super_5")
    private Double fund_rate_super_5;

    /**
     * 
     */
    @TableField(value = "fund_amount_large_5")
    private Long fund_amount_large_5;

    /**
     * 
     */
    @TableField(value = "fund_rate_large_5")
    private Double fund_rate_large_5;

    /**
     * 
     */
    @TableField(value = "fund_amount_medium_5")
    private Long fund_amount_medium_5;

    /**
     * 
     */
    @TableField(value = "fund_rate_medium_5")
    private Double fund_rate_medium_5;

    /**
     * 
     */
    @TableField(value = "fund_amount_small_5")
    private Long fund_amount_small_5;

    /**
     * 
     */
    @TableField(value = "fund_rate_small_5")
    private Double fund_rate_small_5;

    /**
     * 
     */
    @TableField(value = "stock_name_5")
    private String stock_name_5;

    /**
     * 
     */
    @TableField(value = "change_rate_10")
    private Double change_rate_10;

    /**
     * 
     */
    @TableField(value = "fund_amount_10")
    private Long fund_amount_10;

    /**
     * 
     */
    @TableField(value = "fund_rate_10")
    private Double fund_rate_10;

    /**
     * 
     */
    @TableField(value = "fund_amount_super_10")
    private Long fund_amount_super_10;

    /**
     * 
     */
    @TableField(value = "fund_rate_super_10")
    private Double fund_rate_super_10;

    /**
     * 
     */
    @TableField(value = "fund_amount_large_10")
    private Long fund_amount_large_10;

    /**
     * 
     */
    @TableField(value = "fund_rate_large_10")
    private Double fund_rate_large_10;

    /**
     * 
     */
    @TableField(value = "fund_amount_medium_10")
    private Long fund_amount_medium_10;

    /**
     * 
     */
    @TableField(value = "fund_rate_medium_10")
    private Double fund_rate_medium_10;

    /**
     * 
     */
    @TableField(value = "fund_amount_small_10")
    private Long fund_amount_small_10;

    /**
     * 
     */
    @TableField(value = "fund_rate_small_10")
    private Double fund_rate_small_10;

    /**
     * 
     */
    @TableField(value = "stock_name_10")
    private String stock_name_10;

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
        CnStockFundFlowConcept other = (CnStockFundFlowConcept) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getChange_rate() == null ? other.getChange_rate() == null : this.getChange_rate().equals(other.getChange_rate()))
            && (this.getFund_amount() == null ? other.getFund_amount() == null : this.getFund_amount().equals(other.getFund_amount()))
            && (this.getFund_rate() == null ? other.getFund_rate() == null : this.getFund_rate().equals(other.getFund_rate()))
            && (this.getFund_amount_super() == null ? other.getFund_amount_super() == null : this.getFund_amount_super().equals(other.getFund_amount_super()))
            && (this.getFund_rate_super() == null ? other.getFund_rate_super() == null : this.getFund_rate_super().equals(other.getFund_rate_super()))
            && (this.getFund_amount_large() == null ? other.getFund_amount_large() == null : this.getFund_amount_large().equals(other.getFund_amount_large()))
            && (this.getFund_rate_large() == null ? other.getFund_rate_large() == null : this.getFund_rate_large().equals(other.getFund_rate_large()))
            && (this.getFund_amount_medium() == null ? other.getFund_amount_medium() == null : this.getFund_amount_medium().equals(other.getFund_amount_medium()))
            && (this.getFund_rate_medium() == null ? other.getFund_rate_medium() == null : this.getFund_rate_medium().equals(other.getFund_rate_medium()))
            && (this.getFund_amount_small() == null ? other.getFund_amount_small() == null : this.getFund_amount_small().equals(other.getFund_amount_small()))
            && (this.getFund_rate_small() == null ? other.getFund_rate_small() == null : this.getFund_rate_small().equals(other.getFund_rate_small()))
            && (this.getStock_name() == null ? other.getStock_name() == null : this.getStock_name().equals(other.getStock_name()))
            && (this.getChange_rate_5() == null ? other.getChange_rate_5() == null : this.getChange_rate_5().equals(other.getChange_rate_5()))
            && (this.getFund_amount_5() == null ? other.getFund_amount_5() == null : this.getFund_amount_5().equals(other.getFund_amount_5()))
            && (this.getFund_rate_5() == null ? other.getFund_rate_5() == null : this.getFund_rate_5().equals(other.getFund_rate_5()))
            && (this.getFund_amount_super_5() == null ? other.getFund_amount_super_5() == null : this.getFund_amount_super_5().equals(other.getFund_amount_super_5()))
            && (this.getFund_rate_super_5() == null ? other.getFund_rate_super_5() == null : this.getFund_rate_super_5().equals(other.getFund_rate_super_5()))
            && (this.getFund_amount_large_5() == null ? other.getFund_amount_large_5() == null : this.getFund_amount_large_5().equals(other.getFund_amount_large_5()))
            && (this.getFund_rate_large_5() == null ? other.getFund_rate_large_5() == null : this.getFund_rate_large_5().equals(other.getFund_rate_large_5()))
            && (this.getFund_amount_medium_5() == null ? other.getFund_amount_medium_5() == null : this.getFund_amount_medium_5().equals(other.getFund_amount_medium_5()))
            && (this.getFund_rate_medium_5() == null ? other.getFund_rate_medium_5() == null : this.getFund_rate_medium_5().equals(other.getFund_rate_medium_5()))
            && (this.getFund_amount_small_5() == null ? other.getFund_amount_small_5() == null : this.getFund_amount_small_5().equals(other.getFund_amount_small_5()))
            && (this.getFund_rate_small_5() == null ? other.getFund_rate_small_5() == null : this.getFund_rate_small_5().equals(other.getFund_rate_small_5()))
            && (this.getStock_name_5() == null ? other.getStock_name_5() == null : this.getStock_name_5().equals(other.getStock_name_5()))
            && (this.getChange_rate_10() == null ? other.getChange_rate_10() == null : this.getChange_rate_10().equals(other.getChange_rate_10()))
            && (this.getFund_amount_10() == null ? other.getFund_amount_10() == null : this.getFund_amount_10().equals(other.getFund_amount_10()))
            && (this.getFund_rate_10() == null ? other.getFund_rate_10() == null : this.getFund_rate_10().equals(other.getFund_rate_10()))
            && (this.getFund_amount_super_10() == null ? other.getFund_amount_super_10() == null : this.getFund_amount_super_10().equals(other.getFund_amount_super_10()))
            && (this.getFund_rate_super_10() == null ? other.getFund_rate_super_10() == null : this.getFund_rate_super_10().equals(other.getFund_rate_super_10()))
            && (this.getFund_amount_large_10() == null ? other.getFund_amount_large_10() == null : this.getFund_amount_large_10().equals(other.getFund_amount_large_10()))
            && (this.getFund_rate_large_10() == null ? other.getFund_rate_large_10() == null : this.getFund_rate_large_10().equals(other.getFund_rate_large_10()))
            && (this.getFund_amount_medium_10() == null ? other.getFund_amount_medium_10() == null : this.getFund_amount_medium_10().equals(other.getFund_amount_medium_10()))
            && (this.getFund_rate_medium_10() == null ? other.getFund_rate_medium_10() == null : this.getFund_rate_medium_10().equals(other.getFund_rate_medium_10()))
            && (this.getFund_amount_small_10() == null ? other.getFund_amount_small_10() == null : this.getFund_amount_small_10().equals(other.getFund_amount_small_10()))
            && (this.getFund_rate_small_10() == null ? other.getFund_rate_small_10() == null : this.getFund_rate_small_10().equals(other.getFund_rate_small_10()))
            && (this.getStock_name_10() == null ? other.getStock_name_10() == null : this.getStock_name_10().equals(other.getStock_name_10()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getChange_rate() == null) ? 0 : getChange_rate().hashCode());
        result = prime * result + ((getFund_amount() == null) ? 0 : getFund_amount().hashCode());
        result = prime * result + ((getFund_rate() == null) ? 0 : getFund_rate().hashCode());
        result = prime * result + ((getFund_amount_super() == null) ? 0 : getFund_amount_super().hashCode());
        result = prime * result + ((getFund_rate_super() == null) ? 0 : getFund_rate_super().hashCode());
        result = prime * result + ((getFund_amount_large() == null) ? 0 : getFund_amount_large().hashCode());
        result = prime * result + ((getFund_rate_large() == null) ? 0 : getFund_rate_large().hashCode());
        result = prime * result + ((getFund_amount_medium() == null) ? 0 : getFund_amount_medium().hashCode());
        result = prime * result + ((getFund_rate_medium() == null) ? 0 : getFund_rate_medium().hashCode());
        result = prime * result + ((getFund_amount_small() == null) ? 0 : getFund_amount_small().hashCode());
        result = prime * result + ((getFund_rate_small() == null) ? 0 : getFund_rate_small().hashCode());
        result = prime * result + ((getStock_name() == null) ? 0 : getStock_name().hashCode());
        result = prime * result + ((getChange_rate_5() == null) ? 0 : getChange_rate_5().hashCode());
        result = prime * result + ((getFund_amount_5() == null) ? 0 : getFund_amount_5().hashCode());
        result = prime * result + ((getFund_rate_5() == null) ? 0 : getFund_rate_5().hashCode());
        result = prime * result + ((getFund_amount_super_5() == null) ? 0 : getFund_amount_super_5().hashCode());
        result = prime * result + ((getFund_rate_super_5() == null) ? 0 : getFund_rate_super_5().hashCode());
        result = prime * result + ((getFund_amount_large_5() == null) ? 0 : getFund_amount_large_5().hashCode());
        result = prime * result + ((getFund_rate_large_5() == null) ? 0 : getFund_rate_large_5().hashCode());
        result = prime * result + ((getFund_amount_medium_5() == null) ? 0 : getFund_amount_medium_5().hashCode());
        result = prime * result + ((getFund_rate_medium_5() == null) ? 0 : getFund_rate_medium_5().hashCode());
        result = prime * result + ((getFund_amount_small_5() == null) ? 0 : getFund_amount_small_5().hashCode());
        result = prime * result + ((getFund_rate_small_5() == null) ? 0 : getFund_rate_small_5().hashCode());
        result = prime * result + ((getStock_name_5() == null) ? 0 : getStock_name_5().hashCode());
        result = prime * result + ((getChange_rate_10() == null) ? 0 : getChange_rate_10().hashCode());
        result = prime * result + ((getFund_amount_10() == null) ? 0 : getFund_amount_10().hashCode());
        result = prime * result + ((getFund_rate_10() == null) ? 0 : getFund_rate_10().hashCode());
        result = prime * result + ((getFund_amount_super_10() == null) ? 0 : getFund_amount_super_10().hashCode());
        result = prime * result + ((getFund_rate_super_10() == null) ? 0 : getFund_rate_super_10().hashCode());
        result = prime * result + ((getFund_amount_large_10() == null) ? 0 : getFund_amount_large_10().hashCode());
        result = prime * result + ((getFund_rate_large_10() == null) ? 0 : getFund_rate_large_10().hashCode());
        result = prime * result + ((getFund_amount_medium_10() == null) ? 0 : getFund_amount_medium_10().hashCode());
        result = prime * result + ((getFund_rate_medium_10() == null) ? 0 : getFund_rate_medium_10().hashCode());
        result = prime * result + ((getFund_amount_small_10() == null) ? 0 : getFund_amount_small_10().hashCode());
        result = prime * result + ((getFund_rate_small_10() == null) ? 0 : getFund_rate_small_10().hashCode());
        result = prime * result + ((getStock_name_10() == null) ? 0 : getStock_name_10().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", date=").append(date);
        sb.append(", name=").append(name);
        sb.append(", change_rate=").append(change_rate);
        sb.append(", fund_amount=").append(fund_amount);
        sb.append(", fund_rate=").append(fund_rate);
        sb.append(", fund_amount_super=").append(fund_amount_super);
        sb.append(", fund_rate_super=").append(fund_rate_super);
        sb.append(", fund_amount_large=").append(fund_amount_large);
        sb.append(", fund_rate_large=").append(fund_rate_large);
        sb.append(", fund_amount_medium=").append(fund_amount_medium);
        sb.append(", fund_rate_medium=").append(fund_rate_medium);
        sb.append(", fund_amount_small=").append(fund_amount_small);
        sb.append(", fund_rate_small=").append(fund_rate_small);
        sb.append(", stock_name=").append(stock_name);
        sb.append(", change_rate_5=").append(change_rate_5);
        sb.append(", fund_amount_5=").append(fund_amount_5);
        sb.append(", fund_rate_5=").append(fund_rate_5);
        sb.append(", fund_amount_super_5=").append(fund_amount_super_5);
        sb.append(", fund_rate_super_5=").append(fund_rate_super_5);
        sb.append(", fund_amount_large_5=").append(fund_amount_large_5);
        sb.append(", fund_rate_large_5=").append(fund_rate_large_5);
        sb.append(", fund_amount_medium_5=").append(fund_amount_medium_5);
        sb.append(", fund_rate_medium_5=").append(fund_rate_medium_5);
        sb.append(", fund_amount_small_5=").append(fund_amount_small_5);
        sb.append(", fund_rate_small_5=").append(fund_rate_small_5);
        sb.append(", stock_name_5=").append(stock_name_5);
        sb.append(", change_rate_10=").append(change_rate_10);
        sb.append(", fund_amount_10=").append(fund_amount_10);
        sb.append(", fund_rate_10=").append(fund_rate_10);
        sb.append(", fund_amount_super_10=").append(fund_amount_super_10);
        sb.append(", fund_rate_super_10=").append(fund_rate_super_10);
        sb.append(", fund_amount_large_10=").append(fund_amount_large_10);
        sb.append(", fund_rate_large_10=").append(fund_rate_large_10);
        sb.append(", fund_amount_medium_10=").append(fund_amount_medium_10);
        sb.append(", fund_rate_medium_10=").append(fund_rate_medium_10);
        sb.append(", fund_amount_small_10=").append(fund_amount_small_10);
        sb.append(", fund_rate_small_10=").append(fund_rate_small_10);
        sb.append(", stock_name_10=").append(stock_name_10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}