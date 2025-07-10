class Demo{
    public static void main(String[] args){
        int num=20;
        for(int i=1;i<=num;i++){
            if(i%3==0){
                continue;
            }
            if(i==17){
                break;
            }
            System.out.println(i);
        }
    }
}