class prefix{
    public int[] prefix_array(int [] arr){
        int [] prefix_arr = new int[arr.length];
        
        prefix_arr[0] = arr[0];

        for(int i=1;i<arr.length;i++){
          prefix_arr[i] = prefix_arr[i-1] + arr[i]; 
        }
        return prefix_arr;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        
        prefix rev = new prefix();
        int[] result = rev.prefix_array(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
}
