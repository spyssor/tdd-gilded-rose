package cn.xpbootcamp.gilded_rose;


public class AgedBrie extends Commodity{
    public AgedBrie(int shelfLife, int quality) {
        super(shelfLife, quality);
    }

    public void save(int days) {
        int checkedQuality = getQuality() + days;
        setQuality(checkedQuality > 50 ? 50 : checkedQuality);
    }
}
