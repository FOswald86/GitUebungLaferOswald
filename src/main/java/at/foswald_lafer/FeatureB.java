package at.foswald_lafer;

public class FeatureB {
    public static void main(String[] args) {
        System.out.println("Feature B is running!");
        System.out.println(multiplier(2, 2));
    }

    static int multiplier(int a, int b) {
        return a*b;
    }
}
