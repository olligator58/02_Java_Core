package Task0460;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 98;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}