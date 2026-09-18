class StrongNum {
    public static void main(String[] args) {
        int n = 145;
        int m = n;
        int sum = 0;

        while(n>0){
            int temp = n%10;
            int factorial = 1;
            for(int i=1; i<=temp; i++){
                factorial *= i ;
            }sum += factorial;
            n /=10;
        }
         if(m==sum)
            System.out.println(m + " is Strong Number");
    }
}