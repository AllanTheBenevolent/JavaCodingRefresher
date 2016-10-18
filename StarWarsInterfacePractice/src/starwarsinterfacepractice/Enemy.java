
package starwarsinterfacepractice;

/**
 *
 * @author Allan Wong
 */
public class Enemy implements Character {
    
    public String weapon = "Lightsaber";
    
    public Enemy(){
    }
    
    public void attack(){
        System.out.println("The enemy attacks YOU!");
    }
    
    public void heal(){
        System.out.println("The enemy heals!");
    }
    
    public void weaponDraw(){
        System.out.println("Draw out weapons");
    }
    
}
