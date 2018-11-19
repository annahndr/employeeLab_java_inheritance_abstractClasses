import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Helen", "GT56", 100, "Finance", 1000);
    }

    @Test
    public void canGetName() {
        assertEquals("Helen", director.getName());
    }

    @Test
    public void canGetNationalInsurance(){
        assertEquals("GT56", director.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000, director.getBudget());
    }

    @Test
    public void canPay2pcBonus(){
        assertEquals(2, director.payBonus(), 0.01);
    }

}
