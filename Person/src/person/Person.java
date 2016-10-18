package person;

;
import static person.HairColor.*;

/**
 *
 * @author Allan Wong
 */
public class Person {

    HairColor hairColor = BLACK;
    
    public Person(){
    
    }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = PINK;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spider Man: " + spiderMan.hairColor);
        
        
    }
    
}
