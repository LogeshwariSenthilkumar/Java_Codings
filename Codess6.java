class Array6{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int specified=4;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==specified){
                System.out.println("Index : "+i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not Found");
        }
    }
}