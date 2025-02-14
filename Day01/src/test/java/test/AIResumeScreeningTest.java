import AIDrivenResumeScreeningSystem.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AIResumeScreeningTest {


public DataScientist dataScientist;
    public ProductManager productManager;
    public SoftwareEngineer softwareEngineer;

    @BeforeEach
    void setUp() {
        dataScientist = new DataScientist("Vivek",2);
        productManager= new ProductManager("Shivraj",4);
        softwareEngineer = new SoftwareEngineer("Riya",5);
    }

    @Test
    void testResumeScreening() {

        assertEquals("Vivek",dataScientist.candidateName);
        assertEquals("Shivraj", productManager.candidateName);
        assertEquals("Riya",softwareEngineer.candidateName);
        if(true){
            System.out.println("All tests passed");
        }

    }


    @Test
    void testgeneric() {
        Resume<DataScientist> analyst1=new Resume(dataScientist);
        Resume<ProductManager> analyst2=new Resume(productManager);
        Resume<SoftwareEngineer> analyst3=new Resume(softwareEngineer);

        assertNotNull(analyst1);
        assertNotNull(analyst2);
        assertNotNull(analyst3);
        if(true){
            System.out.println("All tests passed");
        }
    }
}