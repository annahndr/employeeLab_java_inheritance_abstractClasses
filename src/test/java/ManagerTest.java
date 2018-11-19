import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    
    Manager manager;
    
    @Before
    public void before(){
        manager = new Manager("Jane", "PD1234D", 40, "IT");
    }

    @Test
    public void canGetName() {
        assertEquals("Jane", manager.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40, manager.getSalary());
    }

    @Test
    public void cangetNationalInsurance() {
        assertEquals("PD1234D", manager.getNationalInsurance());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(0.4, manager.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.4);
        assertEquals(56 , manager.getSalary());
    }

    @Test
    public void cantRaiseSalary__negativeRaise(){
        manager.raiseSalary(-0.2);
        assertEquals(40, manager.getSalary());
    }

    @Test
    public void canChangeEmployeeName(){
        manager.setName("Lou");
        assertEquals("Lou", manager.getName());
    }

    @Test
    public void cantChangeName__ifVoid(){
        manager.setName(null);
        assertEquals("Jane", manager.getName());
    }

}
