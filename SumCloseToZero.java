class Array40{
    public static void main(String[] args){
        int[] arr={-1,2,1,-2,3,4,-5};
        int minsum=Integer.MAX_VALUE;
        int first=0,second=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]+arr[j])<Math.abs(minsum)){
                    minsum=arr[i]+arr[j];
                    first=arr[i];
                    second=arr[j];
                }
            }
        }
        System.out.println(first+" "+second);
    }
}