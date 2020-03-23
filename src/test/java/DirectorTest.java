import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director stephen;
    @Before
    public void before(){
        stephen= new Director("Stephen",121314,2000.00,"Head Office",20000.00);
    }
    @Test
    public void directorHasName(){
        assertEquals("Stephen",stephen.getName());
    }
    @Test
    public void directorHasNationalInsuranceNo(){
        assertEquals(121314,stephen.getNi());
    }
    @Test
    public void directorHasSalary(){
        assertEquals(2000.00,stephen.getSalary(),0.1);
    }
    @Test
    public void directorHasDepartment(){
        assertEquals("Head Office",stephen.getDeptName());
    }
    @Test
    public void directorRaiseValue(){
        assertEquals(2200.00,stephen.raiseSalary(1.1),0.1);
    }
    @Test
    public void directorHasBudget(){
        assertEquals(20000.00,stephen.getBudget(),0.1);
    }
    @Test
    public void directorPayBonus(){
        assertEquals(20.00, stephen.payBonus(),0.1);
    }

}
