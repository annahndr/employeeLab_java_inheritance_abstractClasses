import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mina", "JJ34", 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Mina", developer.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50, developer.getSalary());
    }

    @Test
    public void cangetNationalInsurance() {
        assertEquals("JJ34", developer.getNationalInsurance());
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(0.5, developer.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.4);
        assertEquals(70 , developer.getSalary());
    }

}
