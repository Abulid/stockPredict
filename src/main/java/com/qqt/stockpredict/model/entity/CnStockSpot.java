package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_spot
 */
@TableName(value ="cn_stock_spot")
@Data
public class CnStockSpot implements Serializable {
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
    @TableField(value = "amplitude")
    private Double amplitude;

    /**
     * 
     */
    @TableField(value = "volume_ratio")
    private Double volume_ratio;

    /**
     * 
     */
    @TableField(value = "turnoverrate")
    private Double turnoverrate;

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
    @TableField(value = "speed_increase")
    private Double speed_increase;

    /**
     * 
     */
    @TableField(value = "speed_increase_5")
    private Double speed_increase_5;

    /**
     * 
     */
    @TableField(value = "speed_increase_60")
    private Double speed_increase_60;

    /**
     * 
     */
    @TableField(value = "speed_increase_all")
    private Double speed_increase_all;

    /**
     * 
     */
    @TableField(value = "dtsyl")
    private Double dtsyl;

    /**
     * 
     */
    @TableField(value = "pe9")
    private Double pe9;

    /**
     * 
     */
    @TableField(value = "pe")
    private Double pe;

    /**
     * 
     */
    @TableField(value = "pbnewmrq")
    private Double pbnewmrq;

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
    @TableField(value = "roe_weight")
    private Double roe_weight;

    /**
     * 
     */
    @TableField(value = "sale_gpr")
    private Double sale_gpr;

    /**
     * 
     */
    @TableField(value = "debt_asset_ratio")
    private Double debt_asset_ratio;

    /**
     * 
     */
    @TableField(value = "total_operate_income")
    private Long total_operate_income;

    /**
     * 
     */
    @TableField(value = "toi_yoy_ratio")
    private Double toi_yoy_ratio;

    /**
     * 
     */
    @TableField(value = "parent_netprofit")
    private Long parent_netprofit;

    /**
     * 
     */
    @TableField(value = "netprofit_yoy_ratio")
    private Double netprofit_yoy_ratio;

    /**
     * 
     */
    @TableField(value = "report_date")
    private LocalDate report_date;

    /**
     * 
     */
    @TableField(value = "total_shares")
    private Long total_shares;

    /**
     * 
     */
    @TableField(value = "free_shares")
    private Long free_shares;

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

    /**
     * 
     */
    @TableField(value = "industry")
    private String industry;

    /**
     * 
     */
    @TableField(value = "listing_date")
    private LocalDate listing_date;

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
        CnStockSpot other = (CnStockSpot) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNew_price() == null ? other.getNew_price() == null : this.getNew_price().equals(other.getNew_price()))
            && (this.getChange_rate() == null ? other.getChange_rate() == null : this.getChange_rate().equals(other.getChange_rate()))
            && (this.getUps_downs() == null ? other.getUps_downs() == null : this.getUps_downs().equals(other.getUps_downs()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getDeal_amount() == null ? other.getDeal_amount() == null : this.getDeal_amount().equals(other.getDeal_amount()))
            && (this.getAmplitude() == null ? other.getAmplitude() == null : this.getAmplitude().equals(other.getAmplitude()))
            && (this.getVolume_ratio() == null ? other.getVolume_ratio() == null : this.getVolume_ratio().equals(other.getVolume_ratio()))
            && (this.getTurnoverrate() == null ? other.getTurnoverrate() == null : this.getTurnoverrate().equals(other.getTurnoverrate()))
            && (this.getOpen_price() == null ? other.getOpen_price() == null : this.getOpen_price().equals(other.getOpen_price()))
            && (this.getHigh_price() == null ? other.getHigh_price() == null : this.getHigh_price().equals(other.getHigh_price()))
            && (this.getLow_price() == null ? other.getLow_price() == null : this.getLow_price().equals(other.getLow_price()))
            && (this.getPre_close_price() == null ? other.getPre_close_price() == null : this.getPre_close_price().equals(other.getPre_close_price()))
            && (this.getSpeed_increase() == null ? other.getSpeed_increase() == null : this.getSpeed_increase().equals(other.getSpeed_increase()))
            && (this.getSpeed_increase_5() == null ? other.getSpeed_increase_5() == null : this.getSpeed_increase_5().equals(other.getSpeed_increase_5()))
            && (this.getSpeed_increase_60() == null ? other.getSpeed_increase_60() == null : this.getSpeed_increase_60().equals(other.getSpeed_increase_60()))
            && (this.getSpeed_increase_all() == null ? other.getSpeed_increase_all() == null : this.getSpeed_increase_all().equals(other.getSpeed_increase_all()))
            && (this.getDtsyl() == null ? other.getDtsyl() == null : this.getDtsyl().equals(other.getDtsyl()))
            && (this.getPe9() == null ? other.getPe9() == null : this.getPe9().equals(other.getPe9()))
            && (this.getPe() == null ? other.getPe() == null : this.getPe().equals(other.getPe()))
            && (this.getPbnewmrq() == null ? other.getPbnewmrq() == null : this.getPbnewmrq().equals(other.getPbnewmrq()))
            && (this.getBasic_eps() == null ? other.getBasic_eps() == null : this.getBasic_eps().equals(other.getBasic_eps()))
            && (this.getBvps() == null ? other.getBvps() == null : this.getBvps().equals(other.getBvps()))
            && (this.getPer_capital_reserve() == null ? other.getPer_capital_reserve() == null : this.getPer_capital_reserve().equals(other.getPer_capital_reserve()))
            && (this.getPer_unassign_profit() == null ? other.getPer_unassign_profit() == null : this.getPer_unassign_profit().equals(other.getPer_unassign_profit()))
            && (this.getRoe_weight() == null ? other.getRoe_weight() == null : this.getRoe_weight().equals(other.getRoe_weight()))
            && (this.getSale_gpr() == null ? other.getSale_gpr() == null : this.getSale_gpr().equals(other.getSale_gpr()))
            && (this.getDebt_asset_ratio() == null ? other.getDebt_asset_ratio() == null : this.getDebt_asset_ratio().equals(other.getDebt_asset_ratio()))
            && (this.getTotal_operate_income() == null ? other.getTotal_operate_income() == null : this.getTotal_operate_income().equals(other.getTotal_operate_income()))
            && (this.getToi_yoy_ratio() == null ? other.getToi_yoy_ratio() == null : this.getToi_yoy_ratio().equals(other.getToi_yoy_ratio()))
            && (this.getParent_netprofit() == null ? other.getParent_netprofit() == null : this.getParent_netprofit().equals(other.getParent_netprofit()))
            && (this.getNetprofit_yoy_ratio() == null ? other.getNetprofit_yoy_ratio() == null : this.getNetprofit_yoy_ratio().equals(other.getNetprofit_yoy_ratio()))
            && (this.getReport_date() == null ? other.getReport_date() == null : this.getReport_date().equals(other.getReport_date()))
            && (this.getTotal_shares() == null ? other.getTotal_shares() == null : this.getTotal_shares().equals(other.getTotal_shares()))
            && (this.getFree_shares() == null ? other.getFree_shares() == null : this.getFree_shares().equals(other.getFree_shares()))
            && (this.getTotal_market_cap() == null ? other.getTotal_market_cap() == null : this.getTotal_market_cap().equals(other.getTotal_market_cap()))
            && (this.getFree_cap() == null ? other.getFree_cap() == null : this.getFree_cap().equals(other.getFree_cap()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getListing_date() == null ? other.getListing_date() == null : this.getListing_date().equals(other.getListing_date()));
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
        result = prime * result + ((getAmplitude() == null) ? 0 : getAmplitude().hashCode());
        result = prime * result + ((getVolume_ratio() == null) ? 0 : getVolume_ratio().hashCode());
        result = prime * result + ((getTurnoverrate() == null) ? 0 : getTurnoverrate().hashCode());
        result = prime * result + ((getOpen_price() == null) ? 0 : getOpen_price().hashCode());
        result = prime * result + ((getHigh_price() == null) ? 0 : getHigh_price().hashCode());
        result = prime * result + ((getLow_price() == null) ? 0 : getLow_price().hashCode());
        result = prime * result + ((getPre_close_price() == null) ? 0 : getPre_close_price().hashCode());
        result = prime * result + ((getSpeed_increase() == null) ? 0 : getSpeed_increase().hashCode());
        result = prime * result + ((getSpeed_increase_5() == null) ? 0 : getSpeed_increase_5().hashCode());
        result = prime * result + ((getSpeed_increase_60() == null) ? 0 : getSpeed_increase_60().hashCode());
        result = prime * result + ((getSpeed_increase_all() == null) ? 0 : getSpeed_increase_all().hashCode());
        result = prime * result + ((getDtsyl() == null) ? 0 : getDtsyl().hashCode());
        result = prime * result + ((getPe9() == null) ? 0 : getPe9().hashCode());
        result = prime * result + ((getPe() == null) ? 0 : getPe().hashCode());
        result = prime * result + ((getPbnewmrq() == null) ? 0 : getPbnewmrq().hashCode());
        result = prime * result + ((getBasic_eps() == null) ? 0 : getBasic_eps().hashCode());
        result = prime * result + ((getBvps() == null) ? 0 : getBvps().hashCode());
        result = prime * result + ((getPer_capital_reserve() == null) ? 0 : getPer_capital_reserve().hashCode());
        result = prime * result + ((getPer_unassign_profit() == null) ? 0 : getPer_unassign_profit().hashCode());
        result = prime * result + ((getRoe_weight() == null) ? 0 : getRoe_weight().hashCode());
        result = prime * result + ((getSale_gpr() == null) ? 0 : getSale_gpr().hashCode());
        result = prime * result + ((getDebt_asset_ratio() == null) ? 0 : getDebt_asset_ratio().hashCode());
        result = prime * result + ((getTotal_operate_income() == null) ? 0 : getTotal_operate_income().hashCode());
        result = prime * result + ((getToi_yoy_ratio() == null) ? 0 : getToi_yoy_ratio().hashCode());
        result = prime * result + ((getParent_netprofit() == null) ? 0 : getParent_netprofit().hashCode());
        result = prime * result + ((getNetprofit_yoy_ratio() == null) ? 0 : getNetprofit_yoy_ratio().hashCode());
        result = prime * result + ((getReport_date() == null) ? 0 : getReport_date().hashCode());
        result = prime * result + ((getTotal_shares() == null) ? 0 : getTotal_shares().hashCode());
        result = prime * result + ((getFree_shares() == null) ? 0 : getFree_shares().hashCode());
        result = prime * result + ((getTotal_market_cap() == null) ? 0 : getTotal_market_cap().hashCode());
        result = prime * result + ((getFree_cap() == null) ? 0 : getFree_cap().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getListing_date() == null) ? 0 : getListing_date().hashCode());
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
        sb.append(", amplitude=").append(amplitude);
        sb.append(", volume_ratio=").append(volume_ratio);
        sb.append(", turnoverrate=").append(turnoverrate);
        sb.append(", open_price=").append(open_price);
        sb.append(", high_price=").append(high_price);
        sb.append(", low_price=").append(low_price);
        sb.append(", pre_close_price=").append(pre_close_price);
        sb.append(", speed_increase=").append(speed_increase);
        sb.append(", speed_increase_5=").append(speed_increase_5);
        sb.append(", speed_increase_60=").append(speed_increase_60);
        sb.append(", speed_increase_all=").append(speed_increase_all);
        sb.append(", dtsyl=").append(dtsyl);
        sb.append(", pe9=").append(pe9);
        sb.append(", pe=").append(pe);
        sb.append(", pbnewmrq=").append(pbnewmrq);
        sb.append(", basic_eps=").append(basic_eps);
        sb.append(", bvps=").append(bvps);
        sb.append(", per_capital_reserve=").append(per_capital_reserve);
        sb.append(", per_unassign_profit=").append(per_unassign_profit);
        sb.append(", roe_weight=").append(roe_weight);
        sb.append(", sale_gpr=").append(sale_gpr);
        sb.append(", debt_asset_ratio=").append(debt_asset_ratio);
        sb.append(", total_operate_income=").append(total_operate_income);
        sb.append(", toi_yoy_ratio=").append(toi_yoy_ratio);
        sb.append(", parent_netprofit=").append(parent_netprofit);
        sb.append(", netprofit_yoy_ratio=").append(netprofit_yoy_ratio);
        sb.append(", report_date=").append(report_date);
        sb.append(", total_shares=").append(total_shares);
        sb.append(", free_shares=").append(free_shares);
        sb.append(", total_market_cap=").append(total_market_cap);
        sb.append(", free_cap=").append(free_cap);
        sb.append(", industry=").append(industry);
        sb.append(", listing_date=").append(listing_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}