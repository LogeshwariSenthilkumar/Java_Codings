import java.util.Arrays;
class ArrayMethods{
    public static void main(String[] args)
    {
        // 1.Arrays.toString(name)
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
         System.out.println();

        //2.Arrays.sort(name)
        int[] arr1={10,3,4,6,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr1));
         System.out.println();

        //3.Arrays.sort(name,s,e);
        int[] arr2={3,4,6,2,1,4,10};
        Arrays.sort(arr2,1,4);
        System.out.println(Arrays.toString(arr2));
         System.out.println();

        //4.Arrays.equals(name1,name2)
        int[] arr3={1,2,3};
        int[] arr4={1,2,3,4};
        System.out.println(Arrays.equals(arr3,arr4));
         System.out.println();

        //5.Arrays.compare(name1,name2)
        int[] arr5={1,2,3,4};
        int[] arr6={1,2,3,4,5};
        System.out.println(Arrays.compare(arr5,arr6));
         System.out.println();

        //6.Arrays.mismatch(nam1,name2)
        int[] arr7={1,2,3,4};
        int[] arr8={1,2,3};
        System.out.println(Arrays.mismatch(arr7,arr8));
         System.out.println();

        //7.Arrays.copyOf(name)
        int[] arr9={1,2,3};
        int[] arr10=Arrays.copyOf(arr9,arr9.length);
        System.out.println(Arrays.toString(arr10));
         System.out.println();

        //8.Arrays.copyOfRange(name)
        int[] arr11={1,2,3,4,5};
        int[] arr12=Arrays.copyOfRange(arr11,1,4);
        System.out.println(Arrays.toString(arr12));
         System.out.println();

        //9.Arrays.fill(name)
        int[] arr13={1,2,3,4,5};
        Arrays.fill(arr13,2,4,100);
        System.out.println(Arrays.toString(arr13));
         System.out.println();

        //10.Arrays.binarySearch(name,value)
        int[] arr14={10,6,3,2,0,1};
        Arrays.sort(arr14);
        System.out.println(Arrays.toString(arr14));
        System.out.println(Arrays.binarySearch(arr14,6));

    }
}