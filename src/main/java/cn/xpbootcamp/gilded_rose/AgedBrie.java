package cn.xpbootcamp.gilded_rose;


public class AgedBrie extends Commodity{
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public void save(int days) {
        int checkedQuality = getQuality() + days;
        setQuality(checkedQuality > 50 ? 50 : checkedQuality);
    }
}
