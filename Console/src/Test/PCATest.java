package Test;

import com.company.PCA;
import com.company.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCATest {
    public void main() {
        Person user1 = new Person("Joel", "22", "Student", "Lord of the rings", "Sci-fi");
        PCA pca = new PCA(user1.getUserVector()); //create pca object using user1 person object

        int [] userVector = user1.getUserVector();
        assertArrayEquals(userVector,new int [] {1,0,0,0,0,0,0});

        user1.setPcaVector(pca.getStandardUser());
        user1.setTopThree(pca.getTopThree());
        String [] top3 = user1.getTopThree();
        //assertArrayEquals();
    }
    @Test
    void testGetDistances() {
        int [] user = new int [] {10,0,0,0,0,0,0};
        int [][] utility = new int[][] {{10,0,0,0,0,0,0},{0,10,1,10,5,2,2},{0,1,1,0,10,10,2},{8,1,1,1,5,4,8}};
        PCA pca = new PCA(user);
        int [] distances = pca.getDistances(user,utility);
        System.out.println(distances[0]);
        assertEquals(0,distances[0]);
    }

    @Test
    void getStandardUser() {
    }

    @Test
    void getTopThree() {
    }
}