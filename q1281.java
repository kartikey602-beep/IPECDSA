class q1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0,product = 1;
        
        while(n!=0){
            int digit = n%10;
            sum = sum + digit;
            product = product * digit;
            n = n/10;
        }
        int result = product - sum;
        return result;
        
    }

public static void main(String[] args){
        q1281 sol = new q1281();

        int x = 123;        // try: 123, -123, 1534236469
        int result = sol.subtractProductAndSum(x);

        System.out.println("subtractproductandsum: " + result);
}
}