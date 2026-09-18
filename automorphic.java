class Automorphic {
    public static void main(String[] args) {
        int n = 5;
        int square = n * n;

        int divisor = 1;
        int temp = n;

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        if (square % divisor == n) {
            System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is Not Automorphic");
        }
    }
}