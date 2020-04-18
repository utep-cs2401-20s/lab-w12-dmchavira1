import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class myBinarySearchTreeTester {
    // this test is to see if my code / insert method is working and function
    // Passed
    @Test
    public void BSTT1(){
        int [] testArr = {1, 2, 3, 4, 5};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        sol.insert(5);
        assertEquals(5, sol.size());
    }
    // this test is to see if i were to insert more variables into the tree
    //PASSED
    @Test
    public void BSTT2(){
        int [] testArr = {1, 2, 3, 4, 5};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        sol.insert(1);
        sol.insert(1);
        sol.insert(7);
        sol.insert(1);
        sol.insert(6);
        assertEquals(7, sol.size());
    }
    //this test was to see if the depth method works the way its supposed too
    //Passed
    @Test
    void BSTT3(){
        int[] testArr = {2,4,6,8,10};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(2, sol.depth(6));
    }
    // this test was to see if size works and i wanted to put just odd numeber to throw it off to see if it would fail.
    //Passed
    @Test
    void BSTT4(){
        int[] testArr = {1,3,5,7,9,11};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(6, sol.size());
    }
    // this test was to test the size of the array if i were to put just one variable in the array
    //Passed
    @Test
    void BSTT5(){
        int[] testArr = {1};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(1, sol.size());
    }

}
