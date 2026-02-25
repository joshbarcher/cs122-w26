package stacks.stackoverflow;

public class Example {
    public static void main() {
        foo();
    }

    public static void foo() {
        System.out.println("Called foo()");

        foo();
    }
}
