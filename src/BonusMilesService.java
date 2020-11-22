public class BonusMilesService {
    public int calculate(int cost) {
        byte rubles = 20;
        int miles = cost / rubles;
        return miles;
    }
}
