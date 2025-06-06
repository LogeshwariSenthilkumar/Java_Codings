abstract class Course{
    abstract void startCourse();
    abstract void evaluateStudent();
    abstract void issueCertificate();
}
class ProgrammingCourse extends Course{
    void startCourse(){
         System.out.println("Starting ProgrammingCourse..");
    }
    void evaluateStudent(){
         System.out.println("Evaluating ProgrammingCourse Students..");
    }
    void issueCertificate(){
         System.out.println("Issuing Certificates For Progarmming Course Students...");
    }

}
class DesignCourse extends Course{
    void startCourse(){
         System.out.println("Starting DesignCourse..");
    }
    void evaluateStudent(){
         System.out.println("Evaluating DesignCourse Students..");
    }
    void issueCertificate(){
         System.out.println("Issuing Certificates For Design Course Students...");
    }


}
class MarketingCourse extends Course{
     void startCourse(){
         System.out.println("Starting MarketingCourse..");
    }
    void evaluateStudent(){
         System.out.println("Evaluating MarketingCourse Students..");
    }
    void issueCertificate(){
         System.out.println("Issuing Certificates For Marketing Course Students...");
    }



}
class Demo{
    public static void main(String[] args){

     ProgrammingCourse pp=new ProgrammingCourse();
      System.out.println("ProgrammingCourse Class:");
      pp.startCourse();
      pp.evaluateStudent();
      pp.issueCertificate();
     DesignCourse dd=new DesignCourse();
     System.out.println("\nDesignCourse Class:");
     dd.startCourse();
     dd.evaluateStudent();
    dd.issueCertificate();
    MarketingCourse mc=new MarketingCourse();
     System.out.println("\nMarketingCourse Class:");
     mc.startCourse();
     mc.evaluateStudent();
    mc.issueCertificate();
    



    }
}