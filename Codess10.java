class Array10{
    public static void main(String[] args){
        int[] arr={1,2,6,7};
        int[] elements={3,4,5};
        int index=2;
        int[] newarr=new int[arr.length+elements.length];
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
        for(int i=0;i<elements.length;i++){
            newarr[index+i]=elements[i];
        }
        for(int i=index;i<arr.length;i++){
            newarr[elements.length+i]=arr[i];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}