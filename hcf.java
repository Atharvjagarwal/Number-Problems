class HCF {
    public static void main(String[] args) {
        int n = 20;
        int m = 30;
        int hcf = 0;

        for (int i = 1; i <= n; i++){
            if (n%i == 0 && m%i == 0){
                hcf = i;
            }
        }System.out.println(hcf);
    }
}