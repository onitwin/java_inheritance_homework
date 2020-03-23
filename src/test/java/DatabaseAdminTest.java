import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin michelle;

    @Before
    public void before(){
        michelle= new DatabaseAdmin("Michelle",230581,2000.00);
    }


    @Test
    public void developerHasName(){
        assertEquals("Michelle",michelle.getName());
    }

    @Test
    public void developerHasNationalInsuranceNo(){
        assertEquals(230581,michelle.getNi());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(2000.00,michelle.getSalary(),0.1);
    }
}
