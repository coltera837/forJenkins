package testproject;

public class Example {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int result = divide(x, y);
        System.out.println("Result: " + result);
    }

    private static int divide(int a, int b) {
        return a / b;
    }

}
