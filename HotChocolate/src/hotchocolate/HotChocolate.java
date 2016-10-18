
package hotchocolate;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Allan Wong
 */
public class HotChocolate {
    
    public static final double tooHot = 185;
    public static final double tooCold = 160;
    
    
    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,TooColdException{
        if(cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if(cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        double currentCocoaTemp = 170;
        boolean wrongTemp = true;
        while (wrongTemp){
        try{ 
         drinkHotChocolate(currentCocoaTemp);
         System.out.println("Great temperature cocao!");
         wrongTemp = false;
        }catch(TooHotException e1){
            System.out.println("AHH THAT'S TOO HOT! FIRE!");
            currentCocoaTemp = currentCocoaTemp - 5;
        }catch(TooColdException e2){
            System.out.println("Brrrr, heat that cocao up!");
            currentCocoaTemp = currentCocoaTemp + 5;
        }
        TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone");
    }
    
}
