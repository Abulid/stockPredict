package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_indicators
 */
@TableName(value ="cn_stock_indicators")
@Data
public class CnStockIndicators implements Serializable {
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
    @TableField(value = "close")
    private Double close;

    /**
     * 
     */
    @TableField(value = "macd")
    private Double macd;

    /**
     * 
     */
    @TableField(value = "macds")
    private Double macds;

    /**
     * 
     */
    @TableField(value = "macdh")
    private Double macdh;

    /**
     * 
     */
    @TableField(value = "kdjk")
    private Double kdjk;

    /**
     * 
     */
    @TableField(value = "kdjd")
    private Double kdjd;

    /**
     * 
     */
    @TableField(value = "kdjj")
    private Double kdjj;

    /**
     * 
     */
    @TableField(value = "boll_ub")
    private Double boll_ub;

    /**
     * 
     */
    @TableField(value = "boll")
    private Double boll;

    /**
     * 
     */
    @TableField(value = "boll_lb")
    private Double boll_lb;

    /**
     * 
     */
    @TableField(value = "trix")
    private Double trix;

    /**
     * 
     */
    @TableField(value = "trix_20_sma")
    private Double trix_20_sma;

    /**
     * 
     */
    @TableField(value = "tema")
    private Double tema;

    /**
     * 
     */
    @TableField(value = "cr")
    private Double cr;

    /**
     * 
     */
    @TableField(value = "cr_ma1")
    private Double cr_ma1;

    /**
     * 
     */
    @TableField(value = "cr_ma2")
    private Double cr_ma2;

    /**
     * 
     */
    @TableField(value = "cr_ma3")
    private Double cr_ma3;

    /**
     * 
     */
    @TableField(value = "rsi_6")
    private Double rsi_6;

    /**
     * 
     */
    @TableField(value = "rsi_12")
    private Double rsi_12;

    /**
     * 
     */
    @TableField(value = "rsi")
    private Double rsi;

    /**
     * 
     */
    @TableField(value = "rsi_24")
    private Double rsi_24;

    /**
     * 
     */
    @TableField(value = "vr")
    private Double vr;

    /**
     * 
     */
    @TableField(value = "vr_6_sma")
    private Double vr_6_sma;

    /**
     * 
     */
    @TableField(value = "roc")
    private Double roc;

    /**
     * 
     */
    @TableField(value = "rocma")
    private Double rocma;

    /**
     * 
     */
    @TableField(value = "rocema")
    private Double rocema;

    /**
     * 
     */
    @TableField(value = "pdi")
    private Double pdi;

    /**
     * 
     */
    @TableField(value = "mdi")
    private Double mdi;

    /**
     * 
     */
    @TableField(value = "dx")
    private Double dx;

    /**
     * 
     */
    @TableField(value = "adx")
    private Double adx;

    /**
     * 
     */
    @TableField(value = "adxr")
    private Double adxr;

    /**
     * 
     */
    @TableField(value = "wr_6")
    private Double wr_6;

    /**
     * 
     */
    @TableField(value = "wr_10")
    private Double wr_10;

    /**
     * 
     */
    @TableField(value = "wr_14")
    private Double wr_14;

    /**
     * 
     */
    @TableField(value = "cci")
    private Double cci;

    /**
     * 
     */
    @TableField(value = "cci_84")
    private Double cci_84;

    /**
     * 
     */
    @TableField(value = "tr")
    private Double tr;

    /**
     * 
     */
    @TableField(value = "atr")
    private Double atr;

    /**
     * 
     */
    @TableField(value = "dma")
    private Double dma;

    /**
     * 
     */
    @TableField(value = "dma_10_sma")
    private Double dma_10_sma;

    /**
     * 
     */
    @TableField(value = "obv")
    private Double obv;

    /**
     * 
     */
    @TableField(value = "sar")
    private Double sar;

    /**
     * 
     */
    @TableField(value = "psy")
    private Double psy;

    /**
     * 
     */
    @TableField(value = "psyma")
    private Double psyma;

    /**
     * 
     */
    @TableField(value = "br")
    private Double br;

    /**
     * 
     */
    @TableField(value = "ar")
    private Double ar;

    /**
     * 
     */
    @TableField(value = "emv")
    private Double emv;

    /**
     * 
     */
    @TableField(value = "emva")
    private Double emva;

    /**
     * 
     */
    @TableField(value = "bias")
    private Double bias;

    /**
     * 
     */
    @TableField(value = "mfi")
    private Double mfi;

    /**
     * 
     */
    @TableField(value = "mfisma")
    private Double mfisma;

    /**
     * 
     */
    @TableField(value = "vwma")
    private Double vwma;

    /**
     * 
     */
    @TableField(value = "mvwma")
    private Double mvwma;

    /**
     * 
     */
    @TableField(value = "ppo")
    private Double ppo;

    /**
     * 
     */
    @TableField(value = "ppos")
    private Double ppos;

    /**
     * 
     */
    @TableField(value = "ppoh")
    private Double ppoh;

    /**
     * 
     */
    @TableField(value = "wt1")
    private Double wt1;

    /**
     * 
     */
    @TableField(value = "wt2")
    private Double wt2;

    /**
     * 
     */
    @TableField(value = "supertrend_ub")
    private Double supertrend_ub;

    /**
     * 
     */
    @TableField(value = "supertrend")
    private Double supertrend;

    /**
     * 
     */
    @TableField(value = "supertrend_lb")
    private Double supertrend_lb;

    /**
     * 
     */
    @TableField(value = "dpo")
    private Double dpo;

    /**
     * 
     */
    @TableField(value = "madpo")
    private Double madpo;

    /**
     * 
     */
    @TableField(value = "vhf")
    private Double vhf;

    /**
     * 
     */
    @TableField(value = "rvi")
    private Double rvi;

    /**
     * 
     */
    @TableField(value = "rvis")
    private Double rvis;

    /**
     * 
     */
    @TableField(value = "fi")
    private Double fi;

    /**
     * 
     */
    @TableField(value = "force_2")
    private Double force_2;

    /**
     * 
     */
    @TableField(value = "force_13")
    private Double force_13;

    /**
     * 
     */
    @TableField(value = "ene_ue")
    private Double ene_ue;

    /**
     * 
     */
    @TableField(value = "ene")
    private Double ene;

    /**
     * 
     */
    @TableField(value = "ene_le")
    private Double ene_le;

    /**
     * 
     */
    @TableField(value = "stochrsi_k")
    private Double stochrsi_k;

    /**
     * 
     */
    @TableField(value = "stochrsi_d")
    private Double stochrsi_d;

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
        CnStockIndicators other = (CnStockIndicators) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClose() == null ? other.getClose() == null : this.getClose().equals(other.getClose()))
            && (this.getMacd() == null ? other.getMacd() == null : this.getMacd().equals(other.getMacd()))
            && (this.getMacds() == null ? other.getMacds() == null : this.getMacds().equals(other.getMacds()))
            && (this.getMacdh() == null ? other.getMacdh() == null : this.getMacdh().equals(other.getMacdh()))
            && (this.getKdjk() == null ? other.getKdjk() == null : this.getKdjk().equals(other.getKdjk()))
            && (this.getKdjd() == null ? other.getKdjd() == null : this.getKdjd().equals(other.getKdjd()))
            && (this.getKdjj() == null ? other.getKdjj() == null : this.getKdjj().equals(other.getKdjj()))
            && (this.getBoll_ub() == null ? other.getBoll_ub() == null : this.getBoll_ub().equals(other.getBoll_ub()))
            && (this.getBoll() == null ? other.getBoll() == null : this.getBoll().equals(other.getBoll()))
            && (this.getBoll_lb() == null ? other.getBoll_lb() == null : this.getBoll_lb().equals(other.getBoll_lb()))
            && (this.getTrix() == null ? other.getTrix() == null : this.getTrix().equals(other.getTrix()))
            && (this.getTrix_20_sma() == null ? other.getTrix_20_sma() == null : this.getTrix_20_sma().equals(other.getTrix_20_sma()))
            && (this.getTema() == null ? other.getTema() == null : this.getTema().equals(other.getTema()))
            && (this.getCr() == null ? other.getCr() == null : this.getCr().equals(other.getCr()))
            && (this.getCr_ma1() == null ? other.getCr_ma1() == null : this.getCr_ma1().equals(other.getCr_ma1()))
            && (this.getCr_ma2() == null ? other.getCr_ma2() == null : this.getCr_ma2().equals(other.getCr_ma2()))
            && (this.getCr_ma3() == null ? other.getCr_ma3() == null : this.getCr_ma3().equals(other.getCr_ma3()))
            && (this.getRsi_6() == null ? other.getRsi_6() == null : this.getRsi_6().equals(other.getRsi_6()))
            && (this.getRsi_12() == null ? other.getRsi_12() == null : this.getRsi_12().equals(other.getRsi_12()))
            && (this.getRsi() == null ? other.getRsi() == null : this.getRsi().equals(other.getRsi()))
            && (this.getRsi_24() == null ? other.getRsi_24() == null : this.getRsi_24().equals(other.getRsi_24()))
            && (this.getVr() == null ? other.getVr() == null : this.getVr().equals(other.getVr()))
            && (this.getVr_6_sma() == null ? other.getVr_6_sma() == null : this.getVr_6_sma().equals(other.getVr_6_sma()))
            && (this.getRoc() == null ? other.getRoc() == null : this.getRoc().equals(other.getRoc()))
            && (this.getRocma() == null ? other.getRocma() == null : this.getRocma().equals(other.getRocma()))
            && (this.getRocema() == null ? other.getRocema() == null : this.getRocema().equals(other.getRocema()))
            && (this.getPdi() == null ? other.getPdi() == null : this.getPdi().equals(other.getPdi()))
            && (this.getMdi() == null ? other.getMdi() == null : this.getMdi().equals(other.getMdi()))
            && (this.getDx() == null ? other.getDx() == null : this.getDx().equals(other.getDx()))
            && (this.getAdx() == null ? other.getAdx() == null : this.getAdx().equals(other.getAdx()))
            && (this.getAdxr() == null ? other.getAdxr() == null : this.getAdxr().equals(other.getAdxr()))
            && (this.getWr_6() == null ? other.getWr_6() == null : this.getWr_6().equals(other.getWr_6()))
            && (this.getWr_10() == null ? other.getWr_10() == null : this.getWr_10().equals(other.getWr_10()))
            && (this.getWr_14() == null ? other.getWr_14() == null : this.getWr_14().equals(other.getWr_14()))
            && (this.getCci() == null ? other.getCci() == null : this.getCci().equals(other.getCci()))
            && (this.getCci_84() == null ? other.getCci_84() == null : this.getCci_84().equals(other.getCci_84()))
            && (this.getTr() == null ? other.getTr() == null : this.getTr().equals(other.getTr()))
            && (this.getAtr() == null ? other.getAtr() == null : this.getAtr().equals(other.getAtr()))
            && (this.getDma() == null ? other.getDma() == null : this.getDma().equals(other.getDma()))
            && (this.getDma_10_sma() == null ? other.getDma_10_sma() == null : this.getDma_10_sma().equals(other.getDma_10_sma()))
            && (this.getObv() == null ? other.getObv() == null : this.getObv().equals(other.getObv()))
            && (this.getSar() == null ? other.getSar() == null : this.getSar().equals(other.getSar()))
            && (this.getPsy() == null ? other.getPsy() == null : this.getPsy().equals(other.getPsy()))
            && (this.getPsyma() == null ? other.getPsyma() == null : this.getPsyma().equals(other.getPsyma()))
            && (this.getBr() == null ? other.getBr() == null : this.getBr().equals(other.getBr()))
            && (this.getAr() == null ? other.getAr() == null : this.getAr().equals(other.getAr()))
            && (this.getEmv() == null ? other.getEmv() == null : this.getEmv().equals(other.getEmv()))
            && (this.getEmva() == null ? other.getEmva() == null : this.getEmva().equals(other.getEmva()))
            && (this.getBias() == null ? other.getBias() == null : this.getBias().equals(other.getBias()))
            && (this.getMfi() == null ? other.getMfi() == null : this.getMfi().equals(other.getMfi()))
            && (this.getMfisma() == null ? other.getMfisma() == null : this.getMfisma().equals(other.getMfisma()))
            && (this.getVwma() == null ? other.getVwma() == null : this.getVwma().equals(other.getVwma()))
            && (this.getMvwma() == null ? other.getMvwma() == null : this.getMvwma().equals(other.getMvwma()))
            && (this.getPpo() == null ? other.getPpo() == null : this.getPpo().equals(other.getPpo()))
            && (this.getPpos() == null ? other.getPpos() == null : this.getPpos().equals(other.getPpos()))
            && (this.getPpoh() == null ? other.getPpoh() == null : this.getPpoh().equals(other.getPpoh()))
            && (this.getWt1() == null ? other.getWt1() == null : this.getWt1().equals(other.getWt1()))
            && (this.getWt2() == null ? other.getWt2() == null : this.getWt2().equals(other.getWt2()))
            && (this.getSupertrend_ub() == null ? other.getSupertrend_ub() == null : this.getSupertrend_ub().equals(other.getSupertrend_ub()))
            && (this.getSupertrend() == null ? other.getSupertrend() == null : this.getSupertrend().equals(other.getSupertrend()))
            && (this.getSupertrend_lb() == null ? other.getSupertrend_lb() == null : this.getSupertrend_lb().equals(other.getSupertrend_lb()))
            && (this.getDpo() == null ? other.getDpo() == null : this.getDpo().equals(other.getDpo()))
            && (this.getMadpo() == null ? other.getMadpo() == null : this.getMadpo().equals(other.getMadpo()))
            && (this.getVhf() == null ? other.getVhf() == null : this.getVhf().equals(other.getVhf()))
            && (this.getRvi() == null ? other.getRvi() == null : this.getRvi().equals(other.getRvi()))
            && (this.getRvis() == null ? other.getRvis() == null : this.getRvis().equals(other.getRvis()))
            && (this.getFi() == null ? other.getFi() == null : this.getFi().equals(other.getFi()))
            && (this.getForce_2() == null ? other.getForce_2() == null : this.getForce_2().equals(other.getForce_2()))
            && (this.getForce_13() == null ? other.getForce_13() == null : this.getForce_13().equals(other.getForce_13()))
            && (this.getEne_ue() == null ? other.getEne_ue() == null : this.getEne_ue().equals(other.getEne_ue()))
            && (this.getEne() == null ? other.getEne() == null : this.getEne().equals(other.getEne()))
            && (this.getEne_le() == null ? other.getEne_le() == null : this.getEne_le().equals(other.getEne_le()))
            && (this.getStochrsi_k() == null ? other.getStochrsi_k() == null : this.getStochrsi_k().equals(other.getStochrsi_k()))
            && (this.getStochrsi_d() == null ? other.getStochrsi_d() == null : this.getStochrsi_d().equals(other.getStochrsi_d()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClose() == null) ? 0 : getClose().hashCode());
        result = prime * result + ((getMacd() == null) ? 0 : getMacd().hashCode());
        result = prime * result + ((getMacds() == null) ? 0 : getMacds().hashCode());
        result = prime * result + ((getMacdh() == null) ? 0 : getMacdh().hashCode());
        result = prime * result + ((getKdjk() == null) ? 0 : getKdjk().hashCode());
        result = prime * result + ((getKdjd() == null) ? 0 : getKdjd().hashCode());
        result = prime * result + ((getKdjj() == null) ? 0 : getKdjj().hashCode());
        result = prime * result + ((getBoll_ub() == null) ? 0 : getBoll_ub().hashCode());
        result = prime * result + ((getBoll() == null) ? 0 : getBoll().hashCode());
        result = prime * result + ((getBoll_lb() == null) ? 0 : getBoll_lb().hashCode());
        result = prime * result + ((getTrix() == null) ? 0 : getTrix().hashCode());
        result = prime * result + ((getTrix_20_sma() == null) ? 0 : getTrix_20_sma().hashCode());
        result = prime * result + ((getTema() == null) ? 0 : getTema().hashCode());
        result = prime * result + ((getCr() == null) ? 0 : getCr().hashCode());
        result = prime * result + ((getCr_ma1() == null) ? 0 : getCr_ma1().hashCode());
        result = prime * result + ((getCr_ma2() == null) ? 0 : getCr_ma2().hashCode());
        result = prime * result + ((getCr_ma3() == null) ? 0 : getCr_ma3().hashCode());
        result = prime * result + ((getRsi_6() == null) ? 0 : getRsi_6().hashCode());
        result = prime * result + ((getRsi_12() == null) ? 0 : getRsi_12().hashCode());
        result = prime * result + ((getRsi() == null) ? 0 : getRsi().hashCode());
        result = prime * result + ((getRsi_24() == null) ? 0 : getRsi_24().hashCode());
        result = prime * result + ((getVr() == null) ? 0 : getVr().hashCode());
        result = prime * result + ((getVr_6_sma() == null) ? 0 : getVr_6_sma().hashCode());
        result = prime * result + ((getRoc() == null) ? 0 : getRoc().hashCode());
        result = prime * result + ((getRocma() == null) ? 0 : getRocma().hashCode());
        result = prime * result + ((getRocema() == null) ? 0 : getRocema().hashCode());
        result = prime * result + ((getPdi() == null) ? 0 : getPdi().hashCode());
        result = prime * result + ((getMdi() == null) ? 0 : getMdi().hashCode());
        result = prime * result + ((getDx() == null) ? 0 : getDx().hashCode());
        result = prime * result + ((getAdx() == null) ? 0 : getAdx().hashCode());
        result = prime * result + ((getAdxr() == null) ? 0 : getAdxr().hashCode());
        result = prime * result + ((getWr_6() == null) ? 0 : getWr_6().hashCode());
        result = prime * result + ((getWr_10() == null) ? 0 : getWr_10().hashCode());
        result = prime * result + ((getWr_14() == null) ? 0 : getWr_14().hashCode());
        result = prime * result + ((getCci() == null) ? 0 : getCci().hashCode());
        result = prime * result + ((getCci_84() == null) ? 0 : getCci_84().hashCode());
        result = prime * result + ((getTr() == null) ? 0 : getTr().hashCode());
        result = prime * result + ((getAtr() == null) ? 0 : getAtr().hashCode());
        result = prime * result + ((getDma() == null) ? 0 : getDma().hashCode());
        result = prime * result + ((getDma_10_sma() == null) ? 0 : getDma_10_sma().hashCode());
        result = prime * result + ((getObv() == null) ? 0 : getObv().hashCode());
        result = prime * result + ((getSar() == null) ? 0 : getSar().hashCode());
        result = prime * result + ((getPsy() == null) ? 0 : getPsy().hashCode());
        result = prime * result + ((getPsyma() == null) ? 0 : getPsyma().hashCode());
        result = prime * result + ((getBr() == null) ? 0 : getBr().hashCode());
        result = prime * result + ((getAr() == null) ? 0 : getAr().hashCode());
        result = prime * result + ((getEmv() == null) ? 0 : getEmv().hashCode());
        result = prime * result + ((getEmva() == null) ? 0 : getEmva().hashCode());
        result = prime * result + ((getBias() == null) ? 0 : getBias().hashCode());
        result = prime * result + ((getMfi() == null) ? 0 : getMfi().hashCode());
        result = prime * result + ((getMfisma() == null) ? 0 : getMfisma().hashCode());
        result = prime * result + ((getVwma() == null) ? 0 : getVwma().hashCode());
        result = prime * result + ((getMvwma() == null) ? 0 : getMvwma().hashCode());
        result = prime * result + ((getPpo() == null) ? 0 : getPpo().hashCode());
        result = prime * result + ((getPpos() == null) ? 0 : getPpos().hashCode());
        result = prime * result + ((getPpoh() == null) ? 0 : getPpoh().hashCode());
        result = prime * result + ((getWt1() == null) ? 0 : getWt1().hashCode());
        result = prime * result + ((getWt2() == null) ? 0 : getWt2().hashCode());
        result = prime * result + ((getSupertrend_ub() == null) ? 0 : getSupertrend_ub().hashCode());
        result = prime * result + ((getSupertrend() == null) ? 0 : getSupertrend().hashCode());
        result = prime * result + ((getSupertrend_lb() == null) ? 0 : getSupertrend_lb().hashCode());
        result = prime * result + ((getDpo() == null) ? 0 : getDpo().hashCode());
        result = prime * result + ((getMadpo() == null) ? 0 : getMadpo().hashCode());
        result = prime * result + ((getVhf() == null) ? 0 : getVhf().hashCode());
        result = prime * result + ((getRvi() == null) ? 0 : getRvi().hashCode());
        result = prime * result + ((getRvis() == null) ? 0 : getRvis().hashCode());
        result = prime * result + ((getFi() == null) ? 0 : getFi().hashCode());
        result = prime * result + ((getForce_2() == null) ? 0 : getForce_2().hashCode());
        result = prime * result + ((getForce_13() == null) ? 0 : getForce_13().hashCode());
        result = prime * result + ((getEne_ue() == null) ? 0 : getEne_ue().hashCode());
        result = prime * result + ((getEne() == null) ? 0 : getEne().hashCode());
        result = prime * result + ((getEne_le() == null) ? 0 : getEne_le().hashCode());
        result = prime * result + ((getStochrsi_k() == null) ? 0 : getStochrsi_k().hashCode());
        result = prime * result + ((getStochrsi_d() == null) ? 0 : getStochrsi_d().hashCode());
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
        sb.append(", close=").append(close);
        sb.append(", macd=").append(macd);
        sb.append(", macds=").append(macds);
        sb.append(", macdh=").append(macdh);
        sb.append(", kdjk=").append(kdjk);
        sb.append(", kdjd=").append(kdjd);
        sb.append(", kdjj=").append(kdjj);
        sb.append(", boll_ub=").append(boll_ub);
        sb.append(", boll=").append(boll);
        sb.append(", boll_lb=").append(boll_lb);
        sb.append(", trix=").append(trix);
        sb.append(", trix_20_sma=").append(trix_20_sma);
        sb.append(", tema=").append(tema);
        sb.append(", cr=").append(cr);
        sb.append(", cr_ma1=").append(cr_ma1);
        sb.append(", cr_ma2=").append(cr_ma2);
        sb.append(", cr_ma3=").append(cr_ma3);
        sb.append(", rsi_6=").append(rsi_6);
        sb.append(", rsi_12=").append(rsi_12);
        sb.append(", rsi=").append(rsi);
        sb.append(", rsi_24=").append(rsi_24);
        sb.append(", vr=").append(vr);
        sb.append(", vr_6_sma=").append(vr_6_sma);
        sb.append(", roc=").append(roc);
        sb.append(", rocma=").append(rocma);
        sb.append(", rocema=").append(rocema);
        sb.append(", pdi=").append(pdi);
        sb.append(", mdi=").append(mdi);
        sb.append(", dx=").append(dx);
        sb.append(", adx=").append(adx);
        sb.append(", adxr=").append(adxr);
        sb.append(", wr_6=").append(wr_6);
        sb.append(", wr_10=").append(wr_10);
        sb.append(", wr_14=").append(wr_14);
        sb.append(", cci=").append(cci);
        sb.append(", cci_84=").append(cci_84);
        sb.append(", tr=").append(tr);
        sb.append(", atr=").append(atr);
        sb.append(", dma=").append(dma);
        sb.append(", dma_10_sma=").append(dma_10_sma);
        sb.append(", obv=").append(obv);
        sb.append(", sar=").append(sar);
        sb.append(", psy=").append(psy);
        sb.append(", psyma=").append(psyma);
        sb.append(", br=").append(br);
        sb.append(", ar=").append(ar);
        sb.append(", emv=").append(emv);
        sb.append(", emva=").append(emva);
        sb.append(", bias=").append(bias);
        sb.append(", mfi=").append(mfi);
        sb.append(", mfisma=").append(mfisma);
        sb.append(", vwma=").append(vwma);
        sb.append(", mvwma=").append(mvwma);
        sb.append(", ppo=").append(ppo);
        sb.append(", ppos=").append(ppos);
        sb.append(", ppoh=").append(ppoh);
        sb.append(", wt1=").append(wt1);
        sb.append(", wt2=").append(wt2);
        sb.append(", supertrend_ub=").append(supertrend_ub);
        sb.append(", supertrend=").append(supertrend);
        sb.append(", supertrend_lb=").append(supertrend_lb);
        sb.append(", dpo=").append(dpo);
        sb.append(", madpo=").append(madpo);
        sb.append(", vhf=").append(vhf);
        sb.append(", rvi=").append(rvi);
        sb.append(", rvis=").append(rvis);
        sb.append(", fi=").append(fi);
        sb.append(", force_2=").append(force_2);
        sb.append(", force_13=").append(force_13);
        sb.append(", ene_ue=").append(ene_ue);
        sb.append(", ene=").append(ene);
        sb.append(", ene_le=").append(ene_le);
        sb.append(", stochrsi_k=").append(stochrsi_k);
        sb.append(", stochrsi_d=").append(stochrsi_d);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}