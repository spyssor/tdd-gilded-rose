package cn.xpbootcamp.gilded_rose;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommodityTest {

    @Test
    void should_commodity_value_never_less_than_0_when_shelf_life_changed() {
        int shelfLife = 3;
        int quality = 10;
        int days = 8;
        Commodity commodity = new Commodity(shelfLife, quality);
        commodity.save(days);
        assertEquals(0, commodity.getQuality());
    }

    @Test
    void should_decrease_at_double_speed_when_days_beyond_shelf_life() {
        int shelfLife = 0;
        int quality = 10;
        int days = 5;
        Commodity commodity = new Commodity(shelfLife, quality);
        commodity.save(days);
        assertEquals(0, commodity.getQuality());
    }

    @Test
    void should_aged_brie_value_no_more_than_50_when_increasing() {
        int shelfLife = 3;
        int quality = 10;
        int days = 50;
        AgedBrie agedBrie = new AgedBrie(shelfLife, quality);
        agedBrie.save(days);
        assertEquals(50, agedBrie.getQuality());
    }

    @Test
    void should_sulfuras_value_never_changed() {
        int shelfLife = 3;
        int quality = 10;
        int days = 50;
        Sulfuras sulfuras = new Sulfuras(shelfLife, quality);
        sulfuras.save(days);
        assertEquals(10, sulfuras.getQuality());
    }
}
