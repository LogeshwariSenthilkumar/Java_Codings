class Array7{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,2,1,4,1};
        int[] newarr=new int[arr.length];
        int specified=1;
        int flag=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=specified){
                newarr[j]=arr[i];
                j++;
           }
           else{
            flag=1;
           }
        }
        if(flag==0){
            System.out.println("Not found");
        }
        else{
             for(int i=0;i<j;i++){
            System.out.print(newarr[i]+" ");
        }
        }
       
    }
}