public class Alphabet {
    private String name = "I'm Alphabet!";

    public class A {
        public void printName() {
            System.out.println(name);       // access Alphabet's private member!
        }
    }
}