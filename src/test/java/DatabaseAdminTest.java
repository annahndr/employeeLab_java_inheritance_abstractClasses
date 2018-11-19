import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Ari", "PJ54", 30);
    }

    @Test
    public void canGetName() {
        assertEquals("Ari", databaseAdmin.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30, databaseAdmin.getSalary());
    }

    @Test
    public void canGetNationalInsurance() {
        assertEquals("PJ54", databaseAdmin.getNationalInsurance());
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(0.3, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.4);
        assertEquals(42 , databaseAdmin.getSalary());
    }

}
