class Solution {
    public boolean isPowerOfTwo(int n) {
    /*  if(n==0)return false;
        if(n==1)return true;
        if(n%2==1)return false;
        else return isPowerOfTwo(n/2);
        (its time and space commplexity is log n)
    */    
    return n>0 && ((n & (n-1))==0); //O(1) time complexity
    }
}
