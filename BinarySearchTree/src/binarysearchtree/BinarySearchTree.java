package binarysearchtree;

/**
 *
 * @author Allan Wong
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Tester.checkIsEmpty(e);
        Tester.checkIsEmpty(n);
        
         Tester.checkAddMemberCardinality(e, 5);
        Tester.checkAddMemberCardinality(n, 5);
        Tester.checkAddMemberCardinality(n, 6);
        
        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0) {
                t = Tester.rndTree(0);
            } else {
                t = Tester.rndTree(10);
            }
            Tester.checkAddMemberCardinality(t, i);
        }
        
    }
    
}
