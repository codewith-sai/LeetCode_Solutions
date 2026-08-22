class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }
        int total=sum+product;
        if(n%total==0){
            return true;
        }
        return false;
    }
}