class Array4{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int avg=sum/nums.length;
        System.out.println("Average of The Array Elements : "+avg);
    }
}