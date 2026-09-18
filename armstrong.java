class Armstrong{
    public static void main(String[] args) {
        int n = 153;
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
            System.out.println("is Armstrong");
        else    
            System.out.println("is not Armstrong");
    }
}