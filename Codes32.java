interface ServiceRequest{
    void processRequest();
}
class Main{
    public static void main(String[] args){
        ServiceRequest s=new ServiceRequest(){
            public void processRequest(){
                System.out.println("Request Processed by Customer Service");
            }
        };
        s.processRequest();
    }
}