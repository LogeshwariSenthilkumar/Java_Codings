import java.util.*;
class Array34{
    public static void main(String[] args){
        int[] arr={49, 1, 3, 200, 2, 4, 70, 5};
        Arrays.sort(arr);
        int longest=1,consecutive=1;
        for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]+1){
            consecutive++;
          }
          else if(arr[i]!=arr[i-1]){
            consecutive=1;
          }
           longest=Math.max(longest,consecutive);
        }
       
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nLength : "+longest);
    }
}