class StringDemo1{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Logeshwari");
        //1.append(value)
        // sb.append(" Senthilkumar");
        // System.out.println(sb);

        //2.insert(index,value)
        // sb.insert(0,"Senthilkumar ");
        // System.out.println(sb);

        //3.delete(s,e)
        // sb.delete(6,11);
        // System.out.println(sb);

        //4.deleteCharAt(index)
        // sb.deleteCharAt(5);
        // System.out.println(sb);

        //5.replace(s,e,value)
        // sb.replace(0,5,"Senthi");
        // System.out.println(sb);

        //6.reverse()
        sb.reverse();
        System.out.println(sb);
    }
}