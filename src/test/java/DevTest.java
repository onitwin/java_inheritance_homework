import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DevTest {

    Developer niall;

    @Before
    public void before(){
        niall= new Developer("Niall",7891011,2000.00);
    }


    @Test
    public void developerHasName(){
        assertEquals("Niall",niall.getName());
    }

    @Test
    public void developerHasNationalInsuranceNo(){
        assertEquals(7891011,niall.getNi());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(2000.00,niall.getSalary(),0.1);
    }

    @Test
    public void developerChangeName(){
        niall.setName("Jordan");
        assertEquals("Jordan",niall.getName());
    }

}
