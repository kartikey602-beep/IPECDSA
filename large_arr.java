class large_arr {
    int large_arr1(int [] arr){
        int size = arr.length;
        int large = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        
        large_arr rev = new large_arr();
        int result = rev.large_arr1(arr);

        System.out.println("largearr: " + result);
    }
}