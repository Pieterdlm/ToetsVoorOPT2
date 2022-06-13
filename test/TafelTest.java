import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TafelTest {

    //Test of de tafels de correcte korting afgeven bij een bepaald aantal personen aan tafel.
    @Test
    void getGroepKorting() {
        Tafel tafel1 = new Tafel(101);
        tafel1.setaantalPersonen(9);
        Tafel tafel2 = new Tafel(102);
        tafel2.setaantalPersonen(10);
        Tafel tafel3 = new Tafel(103);
        tafel3.setaantalPersonen(19);
        Tafel tafel4 = new Tafel(104);
        tafel4.setaantalPersonen(28);


        assertEquals(0, tafel1.getGroepKorting());
        assertEquals(10, tafel2.getGroepKorting());
        assertEquals(10, tafel3.getGroepKorting());
        assertEquals(20, tafel4.getGroepKorting());

    }
}