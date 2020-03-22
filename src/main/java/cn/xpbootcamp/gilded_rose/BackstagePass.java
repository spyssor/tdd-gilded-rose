package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Commodity{

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public void save(int days) {
        int sellIn = getSellIn();
        int tripleIncreaseValue = 0;
        int doubleIncreaseValue = 0;
        int normalIncreaseValue;

        int remainDays = sellIn - days;
        if (remainDays < 0) {
            setQuality(0);
            return;
        }
        if (remainDays < 5) {
            tripleIncreaseValue = (5 - remainDays) * 3;
            doubleIncreaseValue = 10;
            normalIncreaseValue = days - 10;
        } else if (remainDays < 10) {
            doubleIncreaseValue = (10 - remainDays) * 2;
            normalIncreaseValue = days - 5;
        } else {
            normalIncreaseValue = days;
        }

        int checkedQuality = getQuality() + normalIncreaseValue + doubleIncreaseValue + tripleIncreaseValue;
        setQuality(checkedQuality > 50 ? 50 : checkedQuality);
    }
}
