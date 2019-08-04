package com.softserve.elementary.task9;

public class App9 {

    public static void main(String[] args) {
        System.out.println(pow(5,5));
        System.out.println(binpow(5,5));

      //  System.out.println(powBinary(5,5,100));
    }

    public static int pow(int p, int n) {
        int result = 1;

        for(int i = 1; i <= n; i++) {
            result = result*p;
        }
        return result;
    }

    public static int binpow (int p, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return binpow (p, n-1) * p;
        }
        else {
            int b = binpow (p, n/2);
            return b * b;
        }
    }

  /*  public static int powBinary(int x, int n, int mod) {
        int res = 1;
        for (long p = x; n > 0; n >>= 1, p = (p * p) % mod) {
            if ((n & 1) != 0) {
                res = (int) (res * p % mod);
            }
        }
        return res;
    }*/

}
