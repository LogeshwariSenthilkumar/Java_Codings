import java.util.*;
class Array23{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        boolean isequal=true;
        if(arr1.length!=arr2.length){
            isequal=false;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                  isequal=false;
                  break;
                }
            }
        }
      
        if(isequal){
            System.out.println("Both are Equal...");
        }
        else{
             System.out.println("Both are not Equal...");
        }
    }
}