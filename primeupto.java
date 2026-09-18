class FirstPrime {
    public static void main(String[] args) {
        int n = 10;
        int number = 2;

        while (n > 0) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
                n--;
            }

            number++;
        }
    }
}