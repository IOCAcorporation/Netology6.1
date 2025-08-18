public class Main {
    public static void main(String[] args) {
        RestServise count = new RestServise();
        int Month = count.calculate(100_000, 13_000);
        System.out.println(Month);

    }
}
