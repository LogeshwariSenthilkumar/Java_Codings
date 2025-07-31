class Tshirt {
    int tShirt = 20;
    
    synchronized void orderOfTshirt(int count)
    {
        if(tShirt >= count)
        {
            System.out.println("Order Successfully....");
            tShirt -= count;
            System.out.println("Balance T-Shirt Count : " + tShirt);
            
        }
        else{
            System.out.println("Waiting....");
            try{
            wait();
            }catch(Exception e)
            {
                System.out.println(e);
            }
            orderOfTshirt(count);
        }
    }
        
    synchronized void load(int countOfLoad)
    {
            tShirt += countOfLoad;
            System.out.println("Successfully Loaded!!!");
            System.out.println("Avaiable T-shirt : " + tShirt);
            notify();
    }
}

class Shopping extends Thread{
    Tshirt ob;
    int count;
    Shopping(Tshirt ob,int count)
    {
        this.ob = ob;
        this.count = count;
    }
    public void run()
    {
        ob.orderOfTshirt(count);
    }
}

class TshirtLoad extends Thread{
    Tshirt ob;
    int count;
    TshirtLoad(Tshirt ob,int count)
    {
        this.ob = ob;
        this.count = count;
    }
    public void run()
    {
        ob.load(count);
    }
}
class Main {
    public static void main(String[] args) {
        Tshirt ob = new Tshirt();
        Shopping s = new Shopping(ob,40);
        s.start();
        TshirtLoad t = new TshirtLoad(ob,100);
        t.start();
    }
}