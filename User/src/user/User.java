package user;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Allan Wong
 */
public class User {
    //Blueprint for user
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    //Constructor
    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs){
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set a = new HashSet();
        a.add(1212);
        User allan = new User("AllanTheNG","Yee",22,a);
        
    }
    
}
