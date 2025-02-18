public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("Bheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("Duryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("Vikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
