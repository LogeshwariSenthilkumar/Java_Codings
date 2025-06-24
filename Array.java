class BubbleSort{
    public static void main(String[] args){
        int[] data={10,50,30,40,5,0,3};
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int temp=data[j];
                    data[j]=data[i];
                    data[i]=temp;
                }
            }
        }
        for(int val:data){
            System.out.println(val);
        }
    }
}