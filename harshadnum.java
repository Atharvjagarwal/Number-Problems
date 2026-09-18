class HarshadNum {
    public static void main(String[] args) {
        int n = 18;
        int temp = n;
        int sum = 0;

        while(temp >0){
            sum += temp%10;
            temp /= 10;

        }if(n % sum == 0){
            System.out.println(n + " is Harshad");
        }else{
            System.out.println(n + " is Not Harshad");
        }

        
    }
}