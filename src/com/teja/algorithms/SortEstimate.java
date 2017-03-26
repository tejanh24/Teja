package com.teja.algorithms;

public class SortEstimate {
    public double howMany(int c, int time) {
        double lo = 1.0d;
        double hi = 1e+10d;

        for (int repeat = 0; repeat < 100; repeat++) {
            double n = lo + (hi - lo) / 2;

            double log2n = Math.log(n) / Math.log(2);
            if (n * c * log2n > time) {
                hi = n;
            } else {
                lo = n;
            }
        }
        return lo;
    }
    public static void main(String args[]) {
    		double i = new SortEstimate().howMany(1, 16);
    		System.out.println(i);
    }
}
