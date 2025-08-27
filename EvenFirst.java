class Array52{
    public static void main(String[] args){
        int[] arr={2,3,1,5,6,8};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newarr[index++]=arr[i];
            }
        }
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
}