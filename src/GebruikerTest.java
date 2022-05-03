import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {
    @Test
    void getisBeheerder() {

        //arrange
        Gebruiker gebruiker = new Gebruiker("Test",1234, true, 2020, 1);
        boolean expectedResult = true;
        //act
        boolean actualResult = gebruiker.getisBeheerder();

        //Assert
        assertEquals(expectedResult, actualResult);

    }
    @Test
    void magProductGroepAanmaken() {
        Gebruiker gebruiker1 = new Gebruiker("Test",1234, true, 2020, 1);
        Gebruiker gebruiker2 = new Gebruiker("Test",1234, false, 2014, 3);
        Gebruiker gebruiker3 = new Gebruiker("Test",1234, false, 2012, 1);
        Gebruiker gebruiker4 = new Gebruiker("Test",1234, false, 2020, 1);

        assertTrue(gebruiker1.MagProductGroepAanmaken(gebruiker1.getJaarInDienstTreden(),gebruiker1.getFunctieGroep(), gebruiker1.getisBeheerder()));
        assertTrue(gebruiker2.MagProductGroepAanmaken(gebruiker2.getJaarInDienstTreden(),gebruiker2.getFunctieGroep(), gebruiker2.getisBeheerder()));
        assertFalse(gebruiker3.MagProductGroepAanmaken(gebruiker3.getJaarInDienstTreden(),gebruiker3.getFunctieGroep(), gebruiker3.getisBeheerder()));
        assertFalse(gebruiker4.MagProductGroepAanmaken(gebruiker4.getJaarInDienstTreden(),gebruiker4.getFunctieGroep(), gebruiker4.getisBeheerder()));
    }
}