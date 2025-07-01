import java.util.Arrays;
class StringMethods{
    public static void main(String[] args)
    {
        //1.toUpperCase()
        String s1="hello";
        System.out.println(s1.toUpperCase());
        System.out.println();

        //2.toLowerCase()
        String s2="HELLO";
        System.out.println(s2.toLowerCase());
        System.out.println();

        //3.indexOf()
        String s3="Hello";
        System.out.println(s3.indexOf("o"));
        System.out.println(s3.indexOf("l",3));
        System.out.println(s3.lastIndexOf("l"));
        System.out.println(s3.lastIndexOf("l",2));
        System.out.println();
        
    

        //4.charAt()
        String s4="Logeshwari";
        System.out.println(s4.charAt(2));
         System.out.println();

        //5.valueOf()
        String s5="logu";
        System.out.println(String.valueOf(s5));
         System.out.println();

        //6.equals(),equalsIgnoreCase()
        String s6="Logu";
        String s7="logu";
        System.out.println(s6.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
         System.out.println();

        //7.replace()
        String s8="Hi Hi i am Logeshwari";
        System.out.println(s8.replace("Hi","Hello"));
        System.out.println(s8.replace('i','I'));
         System.out.println();

        //8.split()
        String s9="Hi I am Logu";
        String[] s10=s9.split(" ");
        System.out.println(Arrays.toString(s10));
        String[] s11=s9.split("");
        System.out.println(Arrays.toString(s11));
         System.out.println();

        //9.join()
        String s12="I";
        String s13="Love";
        String s14="Java";
        String s15=String.join(" ",s12,s13,s14);
        System.out.println(s15);
         String s16=String.join(" < ",s12,s13,s14);
        System.out.println(s16);
         System.out.println();

        //10.format()
        String s17="Hi %s My Marks is %d";
        System.out.println(String.format(s17,"Logu",100));
        String s18="Logu";
        System.out.println(String.format("%s",s18));
         System.out.println();

        //11.startsWith & endsWith
        String s19="Hello";
        System.out.println(s19.startsWith("H"));
        System.out.println(s19.startsWith("e"));
        System.out.println(s19.endsWith("lo"));
        System.out.println(s19.endsWith("e"));
         System.out.println();

        //12.concat()
        String s20="hi";
        String s21=" Hello";
        System.out.println(s20.concat(s21));
        System.out.println(s20+s21);
         System.out.println();

        //13.length()
        String s22="Logeshwari SenthilKumar";
        System.out.println(s22.length());
         System.out.println();

        //14.char - string
        char[] ch={'J','A','V','A'};
        String s23=new String(ch);
        System.out.println(s23);
        char[] ch1=s23.toCharArray();
        System.out.println(Arrays.toString(ch1));
         System.out.println();

        //15.repeat()
        String s24="hi";
        System.out.println(s24.repeat(4));
         System.out.println();

        //16.heap-scp;
        String s25="hi";
        String s26=new String("hi");
        s26=s26.intern();
        System.out.println(s25==s26);
         System.out.println();

        //17.trim()
        String s27="  Hello  ";
        System.out.println(s27.trim());
         System.out.println();

        //18.isEmpty &isBlank
        String s28="";
        String s29=" ";
        System.out.println(s28.isEmpty());
        System.out.println(s29.isEmpty());
        System.out.println(s28.isBlank());
        System.out.println(s29.isBlank());
         System.out.println();


        // 19.contains()
        String s30="Hi Hello";
        System.out.println(s30.contains("Hi"));
         System.out.println(s30.contains("hie"));
          System.out.println();

        //20.substring()
        String s31="Hello Hi";
         System.out.println(s31.substring(4));
         System.out.println(s31.substring(1,5));

    

    }
}