import java.util.Locale;
import java.text.NumberFormat;
class Currency{
  public static void main(String[] args){
    double amount=12345.67;

    //India :
    Locale inlocale=new Locale("en","IN");
    NumberFormat informat=NumberFormat.getCurrencyInstance(inlocale);
    System.out.println("INDIA : "+informat.format(amount));

    //USA :
    Locale uslocale=new Locale("en","US");
    NumberFormat usformat=NumberFormat.getCurrencyInstance(uslocale);
    System.out.println("USA : "+usformat.format(amount));

    //China :
    Locale clocale=new Locale("zn","CN");
    NumberFormat cformat=NumberFormat.getCurrencyInstance(clocale);
    System.out.println("CHINA : "+cformat.format(amount));

    //France :
    Locale flocale=new Locale("fr","FR");
    NumberFormat fformat=NumberFormat.getCurrencyInstance(flocale);
    System.out.println("FRANCE : "+fformat.format(amount));



  }
}