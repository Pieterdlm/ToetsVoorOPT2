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
        Gebruiker gebruiker1 = new Gebruiker("Test1",0001, true, 2020, 1); // 1 0 0 D
        Gebruiker gebruiker2 = new Gebruiker("Test2",0002, false, 2021, 1);// 0 0 0 D
        Gebruiker gebruiker3 = new Gebruiker("Test3",0003, false, 2012, 2);// 0 1 1 D
        Gebruiker gebruiker4 = new Gebruiker("Test4",0004, false, 2019, 2);// 0 0 1 D
        Gebruiker gebruiker5 = new Gebruiker("Test5",0005, false, 2015, 1);// 0 1 0 D

        assertTrue(gebruiker1.MagProductGroepAanmaken(gebruiker1.getJaarInDienstTreden(),gebruiker1.getFunctieGroep(), gebruiker1.getisBeheerder()));
        assertFalse(gebruiker2.MagProductGroepAanmaken(gebruiker2.getJaarInDienstTreden(),gebruiker2.getFunctieGroep(), gebruiker2.getisBeheerder()));
        assertTrue(gebruiker3.MagProductGroepAanmaken(gebruiker3.getJaarInDienstTreden(),gebruiker3.getFunctieGroep(), gebruiker3.getisBeheerder()));
        assertFalse(gebruiker4.MagProductGroepAanmaken(gebruiker4.getJaarInDienstTreden(),gebruiker4.getFunctieGroep(), gebruiker4.getisBeheerder()));
        assertFalse(gebruiker5.MagProductGroepAanmaken(gebruiker5.getJaarInDienstTreden(),gebruiker5.getFunctieGroep(), gebruiker5.getisBeheerder()));
    }
}