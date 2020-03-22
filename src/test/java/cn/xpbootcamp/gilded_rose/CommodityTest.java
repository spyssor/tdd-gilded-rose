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
}
