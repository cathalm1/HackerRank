class Prime{
    static void checkPrime(int... n) {
        for(int i: n) {
            if(prime(i)) System.out.print(i+ " ");
        }
        System.out.println();
    }
    static boolean prime(int i){
        if(i==1)return false;
        for(int j=2;j<=i/2;j++){
            if(i%j==0) return false;
        }
        return true;
    }
}
