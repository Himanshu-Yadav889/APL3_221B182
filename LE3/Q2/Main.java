class Main extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteTest.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}
