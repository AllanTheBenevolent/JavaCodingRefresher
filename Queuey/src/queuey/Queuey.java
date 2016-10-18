
package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Allan Wong
 */
public class Queuey {
       
    LinkedList queue = new LinkedList();
    
    //Making a queue instance
    public Queuey(){
    queue = new LinkedList();
    }
    
    //Is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    //returning size of queue
    public int size(){
        return queue.size();
    }
    
    //Enqueing an item
    public void enqueue(int n){
        queue.addLast(n);
    }
    
    //Dequeuing an item(first item)
    public int dequeue(){
        return (int) queue.remove(0);
        
        //Have to cast int for now cuz we didn't use generic
    }
    
    //Peek at the first item.(Doesn't remove it)
    public int peek(){
        return (int) queue.get(0);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
   
        ///Stack and queue is already built in java this is for practice
        Stack<String> stacky = new Stack<>();
        stacky.push("Sexy");
        stacky.push("Keijo");
        System.out.print(stacky.pop() + " ");
        System.out.print(stacky.pop() + "");
        

    }
    
}
