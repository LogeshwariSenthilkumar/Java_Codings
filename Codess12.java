//Remove Element:
class Array12{
    public static void main(String[] args){
        int[] arr={1,2,5,3,4};
        int element=5;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                index=i;
            }
        }
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