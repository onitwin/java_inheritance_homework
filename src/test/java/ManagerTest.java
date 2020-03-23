import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager joseph;

    @Before
    public void before(){
        joseph= new Manager("Joseph",123456,1000.00,"Store");
    }


    @Test
    public void managerHasName(){
        assertEquals("Joseph",joseph.getName());
    }

    @Test
    public void managerHasNationalInsuranceNo(){
        assertEquals(123456,joseph.getNi());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(1000.00,joseph.getSalary(),0.1);
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("Store",joseph.getDeptName());
    }
    @Test
    public void managerRaiseValue(){
        assertEquals(1100.00,joseph.raiseSalary(1.1),0.1);
    }
    @Test
    public void managerPayBonus(){
        assertEquals(10.00,joseph.payBonus(),0.1);
    }

}
