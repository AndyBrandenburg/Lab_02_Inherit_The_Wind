import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setup()
    {
        p1 = new Person("000001", "Bob", "Tester1", "Mr.", 2007);
        p2 = new Person("000002", "Sally", "Tester2", "Mrs.", 2008);
        p3 = new Person("000003", "Bob", "Tester3", "Mr.", 1972);
        p4 = new Person("000004", "Sally", "Tester4", "Mrs.", 1991);
        p5 = new Person("000005", "Mike", "Tester5", "Mr.", 1984);
        p6 = new Person("000006", "Eric", "Tester6", "Mr.", 2000);
    }

    @Test
    void setId() {
        p1.setId("000001");
        assertEquals("000001", p1.getId());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Bob");
        assertEquals("Bob", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Tester1");
        assertEquals("Tester1", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals("Mr.", p1.getTitle());
    }

    @Test
    void setYearOfBirth() {
        p1.setYearOfBirth(2007);
        assertEquals(2007, p1.getYearOfBirth());
    }

    @Test
    void testToString() {
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