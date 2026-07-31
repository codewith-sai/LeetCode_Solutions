class Solution {
    public boolean validDigit(int n, int x) {
       boolean i=false;
       while(n>9){
        if(n%10==x){
           i=true;
        }
        n/=10;
       }
       
       return i && n!=x;
    }
}