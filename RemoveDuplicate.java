class Array16{
    public static void main(String[] args){
        int[] arr={6,5,1,2,3,4,1,2};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
            for(int j=0;j<index;j++){
                if(arr[i]==newarr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}