class Prime2 {
    public static void main(String[] args) {
        int n = 10;
        int num = 2;


        while(n>0){
            boolean isPrime = true;
            
            for(int j = 2; j<num; j++){
                if(num%j==0){
                    isPrime = false;
                    break;
                }
            }
                if(isPrime){
                    System.out.println(num);
                    n--;
                }
                num++; 
        }
    }
}