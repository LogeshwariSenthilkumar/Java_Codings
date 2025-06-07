class Reverse{
    public static void main(String[] args){
        String str="I Like To Code Java";
        int i;
        String str1="";
        for(i=(str.length()-1);i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}