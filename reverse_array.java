class reverse_array{
    public void  Reverse_array(int [] arr){
        int left = 0, right = arr.length -1 ;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
        public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        
        reverse_array rev = new reverse_array();
        rev.Reverse_array(arr);

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}