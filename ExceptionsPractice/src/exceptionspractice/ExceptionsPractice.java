
package exceptionspractice;

/**
 *
 * @author Allan Wong
 */
public class ExceptionsPractice {

  
    public static void main(String[] args) {
        // TODO code application logic here
    try{
        int[] c = new int[6];
        System.out.println("Element 6 at index 5 = " + c[5]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception thronw" + e);
    }finally{
    System.out.println("No matter what this will happen.");
    }
    
    System.out.println("Finally finished try-catch");
    }
    
}
