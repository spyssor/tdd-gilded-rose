package cn.xpbootcamp.gilded_rose;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommodityTest {

    @Test
    void should_commodity_value_never_less_than_0_when_shelf_life_changed() {
        int sellIn = 3;
        int quality = 10;
        int days = 8;
        Commodity commodity = new Commodity(sellIn, quality);
        commodity.save(days);
        assertEquals(0, commodity.getQuality());
    }

    @Test
    void should_decrease_at_double_speed_when_days_beyond_shelf_life() {
        int sellIn = 0;
        int quality = 10;
        int days = 5;
        Commodity commodity = new Commodity(sellIn, quality);
        commodity.save(days);
        assertEquals(0, commodity.getQuality());
    }

    @Test
    void should_aged_brie_value_no_more_than_50_when_increasing() {
        int sellIn = 3;
        int quality = 10;
        int days = 50;
        AgedBrie agedBrie = new AgedBrie(sellIn, quality);
        agedBrie.save(days);
        assertEquals(50, agedBrie.getQuality());
    }

    @Test
    void should_sulfuras_value_never_changed() {
        int sellIn = 3;
        int quality = 10;
        int days = 50;
        Sulfuras sulfuras = new Sulfuras(sellIn, quality);
        sulfuras.save(days);
        assertEquals(10, sulfuras.getQuality());
    }

    @Test
    void should_backstage_pass_value_increase_2_per_day_when_10_days_before_the_show() {
        int sellIn = 15;
        int quality = 10;
        int days = 10;
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.save(days);
        assertEquals(25, backstagePass.getQuality());
    }

    @Test
    void should_backstage_pass_value_increase_3_per_day_when_5_days_before_the_show() {
        int sellIn = 15;
        int quality = 10;
        int days = 15;
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.save(days);
        assertEquals(40, backstagePass.getQuality());
    }

    @Test
    void should_backstage_pass_value_equals_0_when_after_the_show() {
        int sellIn = 15;
        int quality = 10;
        int days = 20;
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.save(days);
        assertEquals(0, backstagePass.getQuality());
    }
}
