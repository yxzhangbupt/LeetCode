package leetCode;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int x = 1;
        int sum =0;
        for(int i=0;i<32;i++)
        {
            if((n&x)!=0) sum++;
            x=x<<1;
        }
        return sum;
    }
}