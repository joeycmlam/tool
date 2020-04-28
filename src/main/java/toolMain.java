public class toolMain {

    public static void main(String args[]) {
        System.out.println("start");

        toolMain a = new toolMain();
        a.testObject();
        System.out.println("done!");
    }

    private void testObject() {
        B b = new B();

        System.out.format("question 1 [%s]", (b instanceof B));
        System.out.println();
        System.out.format("question 2 [%s]", (b instanceof A));
        System.out.println();
        System.out.format("question 3 [%s]", (b instanceof C));
        System.out.println();

    }
}
