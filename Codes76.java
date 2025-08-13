class Duplicate{
    public static void main(String[] args){
        int[] arr={10, 0, 0, 3, 5, 10, 30, 40, 50, 40};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<index;j++){
                if(arr[i]==newarr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}