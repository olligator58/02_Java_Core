package Task0460;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 97;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
