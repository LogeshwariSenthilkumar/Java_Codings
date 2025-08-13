class Shifting2{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int pos=2;
        for(int i:arr){
            System.out.print(i+" ");
        }
        //storing the elements except the shifting elements
        int[] temp=new int[arr.length-pos];
        for(int i=0;i<arr.length-pos;i++){
            temp[i]=arr[i];
        }
        // replace the shifting elements in the array
        for(int i=arr.length-pos;i<arr.length;i++){
            arr[i-arr.length+pos]=arr[i];
        }
        //replace the temp array elements in the array
        for(int i=0;i<arr.length-pos;i++){
            arr[i+pos]=temp[i];
        }
          System.out.println();
         for(int j:arr){
            System.out.print(j+" ");
        }

    }
}