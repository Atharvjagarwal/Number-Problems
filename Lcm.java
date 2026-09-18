class LCM {
    public static void main(String[] args) {
        int n = 8; 
        int m = 12;

        for (int i = 1; ; i++ ){
            
            int prod = i*n;
            if(prod%m == 0){
                System.out.println(prod);
                break;
            }
        }
    }
}