/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class goodpairs {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long c = 1, ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    c++;
                } else {
                    ans += (c * (c - 1)) / 2;
                    c = 1;
                }
            }
            System.out.println(ans);
        }
    }

}
