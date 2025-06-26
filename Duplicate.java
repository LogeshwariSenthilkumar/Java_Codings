class Duplicate{
    public static void main(String[] args){
        int[] data={10,0,0,3,5,10,30,40,50,40};
        System.out.println("Duplicate Elements are:");
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]==data[j]){
                    System.out.println(data[j]);
                }
            }
        }
    }
}