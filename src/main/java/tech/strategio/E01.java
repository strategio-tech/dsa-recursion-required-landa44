package tech.strategio;

import java.util.*;

public class E01 {
    private int[] dp;
    public int getNthFibWrap(int n) {
        if(n==1 || n==2) return (n+1)%2;
        if(dp[n]!=0) return dp[n];

        return dp[n]=getNthFibWrap(n-1) + getNthFibWrap(n-2);
    }
    public int getNthFib(int n) {
        dp = new int[n+1];
        for(int i =0; i <= n; i++) dp[i]=0;

        return getNthFibWrap(n);
    }
}
