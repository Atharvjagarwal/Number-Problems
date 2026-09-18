class PerfectNum{
    public static void main(String[] args) {
        int n = 6, count = 0;

        for(int i=1; i<=n/2; i++){
            if(n%i==0)
                count += i;
        }if(n==count)
            System.out.println(n + " is Perfect");
         else
            System.out.println(n + " is not Perfect");
    }
}