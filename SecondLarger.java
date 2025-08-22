class Array17{
    public static void main(String[] args){
        int[] arr={2,7,1,9,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
            System.out.print("Second Larger Element : "+arr[arr.length-2]);
    }
}