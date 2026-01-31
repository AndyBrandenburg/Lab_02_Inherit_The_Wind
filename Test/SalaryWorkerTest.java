import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1, sw2, sw3;
    @BeforeEach
    void setup()
    {
        sw1 = new SalaryWorker("000001", "Joe", "Worker1", "Mr.", 1999, 100000);
        sw2 = new SalaryWorker("000002", "Jim", "Worker2", "Mr.", 1989, 150000);
        sw3 = new SalaryWorker("000003", "Jane", "Worker3", "Mrs.", 1995, 125000 );
    }


    @Test
    void testToString() {
    }

    @Test
    void calculateWeeklyPay() {
        sw1.calculateWeeklyPay(40);
        assertEquals(1923.076923076923, sw1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
    }

    @Test
    void toCSVDataString() {
    }

    @Test
    void toXmlDataString() {
    }

    @Test
    void toJSONDataString() {
    }
}