package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName cn_stock_pattern
 */
@TableName(value ="cn_stock_pattern")
@Data
public class CnStockPattern implements Serializable {
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
    @TableField(value = "tow_crows")
    private Integer tow_crows;

    /**
     * 
     */
    @TableField(value = "upside_gap_two_crows")
    private Integer upside_gap_two_crows;

    /**
     * 
     */
    @TableField(value = "three_black_crows")
    private Integer three_black_crows;

    /**
     * 
     */
    @TableField(value = "identical_three_crows")
    private Integer identical_three_crows;

    /**
     * 
     */
    @TableField(value = "three_line_strike")
    private Integer three_line_strike;

    /**
     * 
     */
    @TableField(value = "dark_cloud_cover")
    private Integer dark_cloud_cover;

    /**
     * 
     */
    @TableField(value = "evening_doji_star")
    private Integer evening_doji_star;

    /**
     * 
     */
    @TableField(value = "doji_Star")
    private Integer doji_Star;

    /**
     * 
     */
    @TableField(value = "hanging_man")
    private Integer hanging_man;

    /**
     * 
     */
    @TableField(value = "hikkake_pattern")
    private Integer hikkake_pattern;

    /**
     * 
     */
    @TableField(value = "modified_hikkake_pattern")
    private Integer modified_hikkake_pattern;

    /**
     * 
     */
    @TableField(value = "in_neck_pattern")
    private Integer in_neck_pattern;

    /**
     * 
     */
    @TableField(value = "on_neck_pattern")
    private Integer on_neck_pattern;

    /**
     * 
     */
    @TableField(value = "thrusting_pattern")
    private Integer thrusting_pattern;

    /**
     * 
     */
    @TableField(value = "shooting_star")
    private Integer shooting_star;

    /**
     * 
     */
    @TableField(value = "stalled_pattern")
    private Integer stalled_pattern;

    /**
     * 
     */
    @TableField(value = "advance_block")
    private Integer advance_block;

    /**
     * 
     */
    @TableField(value = "high_wave_candle")
    private Integer high_wave_candle;

    /**
     * 
     */
    @TableField(value = "engulfing_pattern")
    private Integer engulfing_pattern;

    /**
     * 
     */
    @TableField(value = "abandoned_baby")
    private Integer abandoned_baby;

    /**
     * 
     */
    @TableField(value = "closing_marubozu")
    private Integer closing_marubozu;

    /**
     * 
     */
    @TableField(value = "doji")
    private Integer doji;

    /**
     * 
     */
    @TableField(value = "up_down_gap")
    private Integer up_down_gap;

    /**
     * 
     */
    @TableField(value = "long_legged_doji")
    private Integer long_legged_doji;

    /**
     * 
     */
    @TableField(value = "rickshaw_man")
    private Integer rickshaw_man;

    /**
     * 
     */
    @TableField(value = "marubozu")
    private Integer marubozu;

    /**
     * 
     */
    @TableField(value = "three_inside_up_down")
    private Integer three_inside_up_down;

    /**
     * 
     */
    @TableField(value = "three_outside_up_down")
    private Integer three_outside_up_down;

    /**
     * 
     */
    @TableField(value = "three_stars_in_the_south")
    private Integer three_stars_in_the_south;

    /**
     * 
     */
    @TableField(value = "three_white_soldiers")
    private Integer three_white_soldiers;

    /**
     * 
     */
    @TableField(value = "belt_hold")
    private Integer belt_hold;

    /**
     * 
     */
    @TableField(value = "breakaway")
    private Integer breakaway;

    /**
     * 
     */
    @TableField(value = "concealing_baby_swallow")
    private Integer concealing_baby_swallow;

    /**
     * 
     */
    @TableField(value = "counterattack")
    private Integer counterattack;

    /**
     * 
     */
    @TableField(value = "dragonfly_doji")
    private Integer dragonfly_doji;

    /**
     * 
     */
    @TableField(value = "evening_star")
    private Integer evening_star;

    /**
     * 
     */
    @TableField(value = "gravestone_doji")
    private Integer gravestone_doji;

    /**
     * 
     */
    @TableField(value = "hammer")
    private Integer hammer;

    /**
     * 
     */
    @TableField(value = "harami_pattern")
    private Integer harami_pattern;

    /**
     * 
     */
    @TableField(value = "harami_cross_pattern")
    private Integer harami_cross_pattern;

    /**
     * 
     */
    @TableField(value = "homing_pigeon")
    private Integer homing_pigeon;

    /**
     * 
     */
    @TableField(value = "inverted_hammer")
    private Integer inverted_hammer;

    /**
     * 
     */
    @TableField(value = "kicking")
    private Integer kicking;

    /**
     * 
     */
    @TableField(value = "kicking_bull_bear")
    private Integer kicking_bull_bear;

    /**
     * 
     */
    @TableField(value = "ladder_bottom")
    private Integer ladder_bottom;

    /**
     * 
     */
    @TableField(value = "long_line_candle")
    private Integer long_line_candle;

    /**
     * 
     */
    @TableField(value = "matching_low")
    private Integer matching_low;

    /**
     * 
     */
    @TableField(value = "mat_hold")
    private Integer mat_hold;

    /**
     * 
     */
    @TableField(value = "morning_doji_star")
    private Integer morning_doji_star;

    /**
     * 
     */
    @TableField(value = "morning_star")
    private Integer morning_star;

    /**
     * 
     */
    @TableField(value = "piercing_pattern")
    private Integer piercing_pattern;

    /**
     * 
     */
    @TableField(value = "rising_falling_three")
    private Integer rising_falling_three;

    /**
     * 
     */
    @TableField(value = "separating_lines")
    private Integer separating_lines;

    /**
     * 
     */
    @TableField(value = "short_line_candle")
    private Integer short_line_candle;

    /**
     * 
     */
    @TableField(value = "spinning_top")
    private Integer spinning_top;

    /**
     * 
     */
    @TableField(value = "stick_sandwich")
    private Integer stick_sandwich;

    /**
     * 
     */
    @TableField(value = "takuri")
    private Integer takuri;

    /**
     * 
     */
    @TableField(value = "tasuki_gap")
    private Integer tasuki_gap;

    /**
     * 
     */
    @TableField(value = "tristar_pattern")
    private Integer tristar_pattern;

    /**
     * 
     */
    @TableField(value = "unique_3_river")
    private Integer unique_3_river;

    /**
     * 
     */
    @TableField(value = "upside_downside_gap")
    private Integer upside_downside_gap;

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
        CnStockPattern other = (CnStockPattern) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTow_crows() == null ? other.getTow_crows() == null : this.getTow_crows().equals(other.getTow_crows()))
            && (this.getUpside_gap_two_crows() == null ? other.getUpside_gap_two_crows() == null : this.getUpside_gap_two_crows().equals(other.getUpside_gap_two_crows()))
            && (this.getThree_black_crows() == null ? other.getThree_black_crows() == null : this.getThree_black_crows().equals(other.getThree_black_crows()))
            && (this.getIdentical_three_crows() == null ? other.getIdentical_three_crows() == null : this.getIdentical_three_crows().equals(other.getIdentical_three_crows()))
            && (this.getThree_line_strike() == null ? other.getThree_line_strike() == null : this.getThree_line_strike().equals(other.getThree_line_strike()))
            && (this.getDark_cloud_cover() == null ? other.getDark_cloud_cover() == null : this.getDark_cloud_cover().equals(other.getDark_cloud_cover()))
            && (this.getEvening_doji_star() == null ? other.getEvening_doji_star() == null : this.getEvening_doji_star().equals(other.getEvening_doji_star()))
            && (this.getDoji_Star() == null ? other.getDoji_Star() == null : this.getDoji_Star().equals(other.getDoji_Star()))
            && (this.getHanging_man() == null ? other.getHanging_man() == null : this.getHanging_man().equals(other.getHanging_man()))
            && (this.getHikkake_pattern() == null ? other.getHikkake_pattern() == null : this.getHikkake_pattern().equals(other.getHikkake_pattern()))
            && (this.getModified_hikkake_pattern() == null ? other.getModified_hikkake_pattern() == null : this.getModified_hikkake_pattern().equals(other.getModified_hikkake_pattern()))
            && (this.getIn_neck_pattern() == null ? other.getIn_neck_pattern() == null : this.getIn_neck_pattern().equals(other.getIn_neck_pattern()))
            && (this.getOn_neck_pattern() == null ? other.getOn_neck_pattern() == null : this.getOn_neck_pattern().equals(other.getOn_neck_pattern()))
            && (this.getThrusting_pattern() == null ? other.getThrusting_pattern() == null : this.getThrusting_pattern().equals(other.getThrusting_pattern()))
            && (this.getShooting_star() == null ? other.getShooting_star() == null : this.getShooting_star().equals(other.getShooting_star()))
            && (this.getStalled_pattern() == null ? other.getStalled_pattern() == null : this.getStalled_pattern().equals(other.getStalled_pattern()))
            && (this.getAdvance_block() == null ? other.getAdvance_block() == null : this.getAdvance_block().equals(other.getAdvance_block()))
            && (this.getHigh_wave_candle() == null ? other.getHigh_wave_candle() == null : this.getHigh_wave_candle().equals(other.getHigh_wave_candle()))
            && (this.getEngulfing_pattern() == null ? other.getEngulfing_pattern() == null : this.getEngulfing_pattern().equals(other.getEngulfing_pattern()))
            && (this.getAbandoned_baby() == null ? other.getAbandoned_baby() == null : this.getAbandoned_baby().equals(other.getAbandoned_baby()))
            && (this.getClosing_marubozu() == null ? other.getClosing_marubozu() == null : this.getClosing_marubozu().equals(other.getClosing_marubozu()))
            && (this.getDoji() == null ? other.getDoji() == null : this.getDoji().equals(other.getDoji()))
            && (this.getUp_down_gap() == null ? other.getUp_down_gap() == null : this.getUp_down_gap().equals(other.getUp_down_gap()))
            && (this.getLong_legged_doji() == null ? other.getLong_legged_doji() == null : this.getLong_legged_doji().equals(other.getLong_legged_doji()))
            && (this.getRickshaw_man() == null ? other.getRickshaw_man() == null : this.getRickshaw_man().equals(other.getRickshaw_man()))
            && (this.getMarubozu() == null ? other.getMarubozu() == null : this.getMarubozu().equals(other.getMarubozu()))
            && (this.getThree_inside_up_down() == null ? other.getThree_inside_up_down() == null : this.getThree_inside_up_down().equals(other.getThree_inside_up_down()))
            && (this.getThree_outside_up_down() == null ? other.getThree_outside_up_down() == null : this.getThree_outside_up_down().equals(other.getThree_outside_up_down()))
            && (this.getThree_stars_in_the_south() == null ? other.getThree_stars_in_the_south() == null : this.getThree_stars_in_the_south().equals(other.getThree_stars_in_the_south()))
            && (this.getThree_white_soldiers() == null ? other.getThree_white_soldiers() == null : this.getThree_white_soldiers().equals(other.getThree_white_soldiers()))
            && (this.getBelt_hold() == null ? other.getBelt_hold() == null : this.getBelt_hold().equals(other.getBelt_hold()))
            && (this.getBreakaway() == null ? other.getBreakaway() == null : this.getBreakaway().equals(other.getBreakaway()))
            && (this.getConcealing_baby_swallow() == null ? other.getConcealing_baby_swallow() == null : this.getConcealing_baby_swallow().equals(other.getConcealing_baby_swallow()))
            && (this.getCounterattack() == null ? other.getCounterattack() == null : this.getCounterattack().equals(other.getCounterattack()))
            && (this.getDragonfly_doji() == null ? other.getDragonfly_doji() == null : this.getDragonfly_doji().equals(other.getDragonfly_doji()))
            && (this.getEvening_star() == null ? other.getEvening_star() == null : this.getEvening_star().equals(other.getEvening_star()))
            && (this.getGravestone_doji() == null ? other.getGravestone_doji() == null : this.getGravestone_doji().equals(other.getGravestone_doji()))
            && (this.getHammer() == null ? other.getHammer() == null : this.getHammer().equals(other.getHammer()))
            && (this.getHarami_pattern() == null ? other.getHarami_pattern() == null : this.getHarami_pattern().equals(other.getHarami_pattern()))
            && (this.getHarami_cross_pattern() == null ? other.getHarami_cross_pattern() == null : this.getHarami_cross_pattern().equals(other.getHarami_cross_pattern()))
            && (this.getHoming_pigeon() == null ? other.getHoming_pigeon() == null : this.getHoming_pigeon().equals(other.getHoming_pigeon()))
            && (this.getInverted_hammer() == null ? other.getInverted_hammer() == null : this.getInverted_hammer().equals(other.getInverted_hammer()))
            && (this.getKicking() == null ? other.getKicking() == null : this.getKicking().equals(other.getKicking()))
            && (this.getKicking_bull_bear() == null ? other.getKicking_bull_bear() == null : this.getKicking_bull_bear().equals(other.getKicking_bull_bear()))
            && (this.getLadder_bottom() == null ? other.getLadder_bottom() == null : this.getLadder_bottom().equals(other.getLadder_bottom()))
            && (this.getLong_line_candle() == null ? other.getLong_line_candle() == null : this.getLong_line_candle().equals(other.getLong_line_candle()))
            && (this.getMatching_low() == null ? other.getMatching_low() == null : this.getMatching_low().equals(other.getMatching_low()))
            && (this.getMat_hold() == null ? other.getMat_hold() == null : this.getMat_hold().equals(other.getMat_hold()))
            && (this.getMorning_doji_star() == null ? other.getMorning_doji_star() == null : this.getMorning_doji_star().equals(other.getMorning_doji_star()))
            && (this.getMorning_star() == null ? other.getMorning_star() == null : this.getMorning_star().equals(other.getMorning_star()))
            && (this.getPiercing_pattern() == null ? other.getPiercing_pattern() == null : this.getPiercing_pattern().equals(other.getPiercing_pattern()))
            && (this.getRising_falling_three() == null ? other.getRising_falling_three() == null : this.getRising_falling_three().equals(other.getRising_falling_three()))
            && (this.getSeparating_lines() == null ? other.getSeparating_lines() == null : this.getSeparating_lines().equals(other.getSeparating_lines()))
            && (this.getShort_line_candle() == null ? other.getShort_line_candle() == null : this.getShort_line_candle().equals(other.getShort_line_candle()))
            && (this.getSpinning_top() == null ? other.getSpinning_top() == null : this.getSpinning_top().equals(other.getSpinning_top()))
            && (this.getStick_sandwich() == null ? other.getStick_sandwich() == null : this.getStick_sandwich().equals(other.getStick_sandwich()))
            && (this.getTakuri() == null ? other.getTakuri() == null : this.getTakuri().equals(other.getTakuri()))
            && (this.getTasuki_gap() == null ? other.getTasuki_gap() == null : this.getTasuki_gap().equals(other.getTasuki_gap()))
            && (this.getTristar_pattern() == null ? other.getTristar_pattern() == null : this.getTristar_pattern().equals(other.getTristar_pattern()))
            && (this.getUnique_3_river() == null ? other.getUnique_3_river() == null : this.getUnique_3_river().equals(other.getUnique_3_river()))
            && (this.getUpside_downside_gap() == null ? other.getUpside_downside_gap() == null : this.getUpside_downside_gap().equals(other.getUpside_downside_gap()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTow_crows() == null) ? 0 : getTow_crows().hashCode());
        result = prime * result + ((getUpside_gap_two_crows() == null) ? 0 : getUpside_gap_two_crows().hashCode());
        result = prime * result + ((getThree_black_crows() == null) ? 0 : getThree_black_crows().hashCode());
        result = prime * result + ((getIdentical_three_crows() == null) ? 0 : getIdentical_three_crows().hashCode());
        result = prime * result + ((getThree_line_strike() == null) ? 0 : getThree_line_strike().hashCode());
        result = prime * result + ((getDark_cloud_cover() == null) ? 0 : getDark_cloud_cover().hashCode());
        result = prime * result + ((getEvening_doji_star() == null) ? 0 : getEvening_doji_star().hashCode());
        result = prime * result + ((getDoji_Star() == null) ? 0 : getDoji_Star().hashCode());
        result = prime * result + ((getHanging_man() == null) ? 0 : getHanging_man().hashCode());
        result = prime * result + ((getHikkake_pattern() == null) ? 0 : getHikkake_pattern().hashCode());
        result = prime * result + ((getModified_hikkake_pattern() == null) ? 0 : getModified_hikkake_pattern().hashCode());
        result = prime * result + ((getIn_neck_pattern() == null) ? 0 : getIn_neck_pattern().hashCode());
        result = prime * result + ((getOn_neck_pattern() == null) ? 0 : getOn_neck_pattern().hashCode());
        result = prime * result + ((getThrusting_pattern() == null) ? 0 : getThrusting_pattern().hashCode());
        result = prime * result + ((getShooting_star() == null) ? 0 : getShooting_star().hashCode());
        result = prime * result + ((getStalled_pattern() == null) ? 0 : getStalled_pattern().hashCode());
        result = prime * result + ((getAdvance_block() == null) ? 0 : getAdvance_block().hashCode());
        result = prime * result + ((getHigh_wave_candle() == null) ? 0 : getHigh_wave_candle().hashCode());
        result = prime * result + ((getEngulfing_pattern() == null) ? 0 : getEngulfing_pattern().hashCode());
        result = prime * result + ((getAbandoned_baby() == null) ? 0 : getAbandoned_baby().hashCode());
        result = prime * result + ((getClosing_marubozu() == null) ? 0 : getClosing_marubozu().hashCode());
        result = prime * result + ((getDoji() == null) ? 0 : getDoji().hashCode());
        result = prime * result + ((getUp_down_gap() == null) ? 0 : getUp_down_gap().hashCode());
        result = prime * result + ((getLong_legged_doji() == null) ? 0 : getLong_legged_doji().hashCode());
        result = prime * result + ((getRickshaw_man() == null) ? 0 : getRickshaw_man().hashCode());
        result = prime * result + ((getMarubozu() == null) ? 0 : getMarubozu().hashCode());
        result = prime * result + ((getThree_inside_up_down() == null) ? 0 : getThree_inside_up_down().hashCode());
        result = prime * result + ((getThree_outside_up_down() == null) ? 0 : getThree_outside_up_down().hashCode());
        result = prime * result + ((getThree_stars_in_the_south() == null) ? 0 : getThree_stars_in_the_south().hashCode());
        result = prime * result + ((getThree_white_soldiers() == null) ? 0 : getThree_white_soldiers().hashCode());
        result = prime * result + ((getBelt_hold() == null) ? 0 : getBelt_hold().hashCode());
        result = prime * result + ((getBreakaway() == null) ? 0 : getBreakaway().hashCode());
        result = prime * result + ((getConcealing_baby_swallow() == null) ? 0 : getConcealing_baby_swallow().hashCode());
        result = prime * result + ((getCounterattack() == null) ? 0 : getCounterattack().hashCode());
        result = prime * result + ((getDragonfly_doji() == null) ? 0 : getDragonfly_doji().hashCode());
        result = prime * result + ((getEvening_star() == null) ? 0 : getEvening_star().hashCode());
        result = prime * result + ((getGravestone_doji() == null) ? 0 : getGravestone_doji().hashCode());
        result = prime * result + ((getHammer() == null) ? 0 : getHammer().hashCode());
        result = prime * result + ((getHarami_pattern() == null) ? 0 : getHarami_pattern().hashCode());
        result = prime * result + ((getHarami_cross_pattern() == null) ? 0 : getHarami_cross_pattern().hashCode());
        result = prime * result + ((getHoming_pigeon() == null) ? 0 : getHoming_pigeon().hashCode());
        result = prime * result + ((getInverted_hammer() == null) ? 0 : getInverted_hammer().hashCode());
        result = prime * result + ((getKicking() == null) ? 0 : getKicking().hashCode());
        result = prime * result + ((getKicking_bull_bear() == null) ? 0 : getKicking_bull_bear().hashCode());
        result = prime * result + ((getLadder_bottom() == null) ? 0 : getLadder_bottom().hashCode());
        result = prime * result + ((getLong_line_candle() == null) ? 0 : getLong_line_candle().hashCode());
        result = prime * result + ((getMatching_low() == null) ? 0 : getMatching_low().hashCode());
        result = prime * result + ((getMat_hold() == null) ? 0 : getMat_hold().hashCode());
        result = prime * result + ((getMorning_doji_star() == null) ? 0 : getMorning_doji_star().hashCode());
        result = prime * result + ((getMorning_star() == null) ? 0 : getMorning_star().hashCode());
        result = prime * result + ((getPiercing_pattern() == null) ? 0 : getPiercing_pattern().hashCode());
        result = prime * result + ((getRising_falling_three() == null) ? 0 : getRising_falling_three().hashCode());
        result = prime * result + ((getSeparating_lines() == null) ? 0 : getSeparating_lines().hashCode());
        result = prime * result + ((getShort_line_candle() == null) ? 0 : getShort_line_candle().hashCode());
        result = prime * result + ((getSpinning_top() == null) ? 0 : getSpinning_top().hashCode());
        result = prime * result + ((getStick_sandwich() == null) ? 0 : getStick_sandwich().hashCode());
        result = prime * result + ((getTakuri() == null) ? 0 : getTakuri().hashCode());
        result = prime * result + ((getTasuki_gap() == null) ? 0 : getTasuki_gap().hashCode());
        result = prime * result + ((getTristar_pattern() == null) ? 0 : getTristar_pattern().hashCode());
        result = prime * result + ((getUnique_3_river() == null) ? 0 : getUnique_3_river().hashCode());
        result = prime * result + ((getUpside_downside_gap() == null) ? 0 : getUpside_downside_gap().hashCode());
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
        sb.append(", tow_crows=").append(tow_crows);
        sb.append(", upside_gap_two_crows=").append(upside_gap_two_crows);
        sb.append(", three_black_crows=").append(three_black_crows);
        sb.append(", identical_three_crows=").append(identical_three_crows);
        sb.append(", three_line_strike=").append(three_line_strike);
        sb.append(", dark_cloud_cover=").append(dark_cloud_cover);
        sb.append(", evening_doji_star=").append(evening_doji_star);
        sb.append(", doji_Star=").append(doji_Star);
        sb.append(", hanging_man=").append(hanging_man);
        sb.append(", hikkake_pattern=").append(hikkake_pattern);
        sb.append(", modified_hikkake_pattern=").append(modified_hikkake_pattern);
        sb.append(", in_neck_pattern=").append(in_neck_pattern);
        sb.append(", on_neck_pattern=").append(on_neck_pattern);
        sb.append(", thrusting_pattern=").append(thrusting_pattern);
        sb.append(", shooting_star=").append(shooting_star);
        sb.append(", stalled_pattern=").append(stalled_pattern);
        sb.append(", advance_block=").append(advance_block);
        sb.append(", high_wave_candle=").append(high_wave_candle);
        sb.append(", engulfing_pattern=").append(engulfing_pattern);
        sb.append(", abandoned_baby=").append(abandoned_baby);
        sb.append(", closing_marubozu=").append(closing_marubozu);
        sb.append(", doji=").append(doji);
        sb.append(", up_down_gap=").append(up_down_gap);
        sb.append(", long_legged_doji=").append(long_legged_doji);
        sb.append(", rickshaw_man=").append(rickshaw_man);
        sb.append(", marubozu=").append(marubozu);
        sb.append(", three_inside_up_down=").append(three_inside_up_down);
        sb.append(", three_outside_up_down=").append(three_outside_up_down);
        sb.append(", three_stars_in_the_south=").append(three_stars_in_the_south);
        sb.append(", three_white_soldiers=").append(three_white_soldiers);
        sb.append(", belt_hold=").append(belt_hold);
        sb.append(", breakaway=").append(breakaway);
        sb.append(", concealing_baby_swallow=").append(concealing_baby_swallow);
        sb.append(", counterattack=").append(counterattack);
        sb.append(", dragonfly_doji=").append(dragonfly_doji);
        sb.append(", evening_star=").append(evening_star);
        sb.append(", gravestone_doji=").append(gravestone_doji);
        sb.append(", hammer=").append(hammer);
        sb.append(", harami_pattern=").append(harami_pattern);
        sb.append(", harami_cross_pattern=").append(harami_cross_pattern);
        sb.append(", homing_pigeon=").append(homing_pigeon);
        sb.append(", inverted_hammer=").append(inverted_hammer);
        sb.append(", kicking=").append(kicking);
        sb.append(", kicking_bull_bear=").append(kicking_bull_bear);
        sb.append(", ladder_bottom=").append(ladder_bottom);
        sb.append(", long_line_candle=").append(long_line_candle);
        sb.append(", matching_low=").append(matching_low);
        sb.append(", mat_hold=").append(mat_hold);
        sb.append(", morning_doji_star=").append(morning_doji_star);
        sb.append(", morning_star=").append(morning_star);
        sb.append(", piercing_pattern=").append(piercing_pattern);
        sb.append(", rising_falling_three=").append(rising_falling_three);
        sb.append(", separating_lines=").append(separating_lines);
        sb.append(", short_line_candle=").append(short_line_candle);
        sb.append(", spinning_top=").append(spinning_top);
        sb.append(", stick_sandwich=").append(stick_sandwich);
        sb.append(", takuri=").append(takuri);
        sb.append(", tasuki_gap=").append(tasuki_gap);
        sb.append(", tristar_pattern=").append(tristar_pattern);
        sb.append(", unique_3_river=").append(unique_3_river);
        sb.append(", upside_downside_gap=").append(upside_downside_gap);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}