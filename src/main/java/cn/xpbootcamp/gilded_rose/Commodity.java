package cn.xpbootcamp.gilded_rose;

public class Commodity {

    private int shelfLife;
    private int quality;

    public Commodity(int shelfLife, int quality) {
        this.shelfLife = shelfLife;
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
        if (days <= this.shelfLife) {
            normalReduceValue = days;
        } else {
            normalReduceValue = this.shelfLife;
            doubleReduceValue = (days - this.shelfLife) * 2;
        }

        int checkedQuality = this.quality - normalReduceValue - doubleReduceValue;
        this.quality = checkedQuality < 0 ? 0 : checkedQuality;
    }
}
