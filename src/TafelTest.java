import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TafelTest {

    @Test
    void getGroepKorting() {
        Tafel tafel1 = new Tafel(101, 9);
        Tafel tafel2 = new Tafel(102, 10);
        Tafel tafel3 = new Tafel(103, 19);
        Tafel tafel4 = new Tafel(104, 20);


        assertEquals(0, tafel1.getGroepKorting());
        assertEquals(10, tafel2.getGroepKorting());
        assertEquals(10, tafel3.getGroepKorting());
        assertEquals(20, tafel4.getGroepKorting());

    }
}