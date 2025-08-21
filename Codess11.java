class Array11{
    public static void main(String[] args){
        int[] arr={1,2,5,3,4};
        int index=2;
        int[] newarr=new int[arr.length-1];
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
       
        for(int i=index;i<newarr.length;i++){
            newarr[i]=arr[i+1];
        }
         for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}