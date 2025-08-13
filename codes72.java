class Shifting{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int pos=3;
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //store lefted elements in temp array
        int[] temp=new int[pos];
        for(int i=0;i<pos;i++){
            temp[i]=arr[i];
        }
        //shift remaining elements
        for(int i=pos;i<arr.length;i++){
            arr[i-pos]=arr[i];
        }
        //adding temp array to original array
        for(int i=0;i<pos;i++){
            arr[i+arr.length-pos]=temp[i];
        }
        for(int h:arr){
            System.out.print(h+" ");
        }
    }
}