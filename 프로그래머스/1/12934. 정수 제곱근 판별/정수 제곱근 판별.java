class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        long x = sqrt * sqrt;

        long answer = 0;
        if(x == n){
            sqrt = sqrt + 1;
            return sqrt * sqrt;
        }else{
            return -1;
        }
        
    }
}