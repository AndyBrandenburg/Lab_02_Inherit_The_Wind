import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1, w2, w3;
    @BeforeEach
    void setup()
    {
        w1 = new Worker("000001", "Joe", "Worker1", "Mr.", 1999, 25);
        w2 = new Worker("000002", "Jim", "Worker2", "Mr.", 1989, 35);
        w3 = new Worker("000003", "Jane", "Worker3", "Mrs.", 1995, 30);
    }


    @Test
    void testToString() {
    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(40);
        assertEquals(1000, w1.calculateWeeklyPay(40));
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