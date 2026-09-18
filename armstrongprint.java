class ArmstrongPrint {
    public static void main(String[] args) {
        int num = 153;

        for(int n=1; n<=num; n++){
            int temp = n;
            int temp2 = 0;
            int count = 0;

            while(temp >0){
                temp /= 10;
                count++;
            }temp=n;

            while(temp > 0){
                temp2 += Math.pow((temp%10), count); 
                temp /=10;
            }if(temp2==n)
                System.out.println(n);
        }
    }
}