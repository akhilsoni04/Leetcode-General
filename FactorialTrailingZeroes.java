class Solution {
    public int trailingZeroes(int n) {
        return help(n);
    }
    private int help(int n ){
        if(n<5) return 0;
        return (n/5) + help(n/5);
    }
}
