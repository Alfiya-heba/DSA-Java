public class gcd {
    private static int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 12, n2 = 8;
        int gcd = findGcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}