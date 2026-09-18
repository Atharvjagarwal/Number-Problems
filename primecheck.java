class PrimeCheck{
    public static void main(String[] args) {
        int n = 23;
        int count =0;

        if(n==1){
            System.err.println("1 is not Prime");
        }else{
            for(int i=2; i<n; i++){
                if(n%i == 0)
                    count++;
            }
        }if(count > 0)
            System.out.println(n + " is not Prime");
        else
            System.out.println(n + " is Prime");
    }
}