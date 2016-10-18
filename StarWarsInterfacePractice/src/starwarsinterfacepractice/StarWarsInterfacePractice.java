
package starwarsinterfacepractice;

import java.util.Random;

/**
 *
 * @author Allan Wong
 */
public class StarWarsInterfacePractice {

   public static Character summonCharacter(){
       Random rand = new Random();
       
       if(Math.abs(rand.nextInt()) % 2 == 0){
           return new Enemy();
       }else{
           return new Hero();
       }
   }
           
    public static void main(String[] args) {
        // TODO code application logic here
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println(darthVader.weapon);
        
        //Random creation of hero or enemy.
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
        
    }
    
}
