public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(10_000);
        System.out.println(miles);
        int miles1 = service.calculate(20_000);
        System.out.println(miles1);
        int miles2 = service.calculate(24_500);
        System.out.println(miles2);
        int miles3 = service.calculate(30_000);
        System.out.println(miles3);
        int miles4 = service.calculate(2_500);
        System.out.println(miles4);
    }
}