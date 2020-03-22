package cn.xpbootcamp.gilded_rose;

public class Commodity {

    private int sellIn;
    private int quality;

    public Commodity(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void save(int days) {
        int normalReduceValue;
        int doubleReduceValue = 0;
        if (days <= this.sellIn) {
            normalReduceValue = days;
        } else {
            normalReduceValue = this.sellIn;
            doubleReduceValue = (days - this.sellIn) * 2;
        }

        int checkedQuality = this.quality - normalReduceValue - doubleReduceValue;
        this.quality = checkedQuality < 0 ? 0 : checkedQuality;
    }
}
