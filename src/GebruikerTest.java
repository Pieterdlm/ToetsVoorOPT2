import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {
    @Test
    void getisBeheerder() {

        //arrange
        Gebruiker gebruiker = new Gebruiker("Test",1234, true, 2020, 1, false);
        boolean expectedResult = true;
        //act
        boolean actualResult = gebruiker.getisBeheerder();

        //Assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    void magProductGroepAanmaken() {
        Gebruiker gebruiker1 = new Gebruiker("Test1",0001, true, 2020, 1, true);
        Gebruiker gebruiker2 = new Gebruiker("Test2",0002, false, 2015, 1, false);

        Gebruiker gebruiker3 = new Gebruiker("Test3",0003, true, 2015, 2, true);
        Gebruiker gebruiker4 = new Gebruiker("Test4",0004, false, 2020, 2, false);

        Gebruiker gebruiker5 = new Gebruiker("Test5",0005, true, 2020, 3, false);
        Gebruiker gebruiker6 = new Gebruiker("Test5",0006, false, 2015, 3, true);


        assertTrue  (gebruiker1.MagProductGroepAanmaken(gebruiker1.getJaarInDienstTreden(),gebruiker1.getFunctieGroep(), gebruiker1.getisBeheerder(), gebruiker1.getIsTester()));
        assertFalse (gebruiker2.MagProductGroepAanmaken(gebruiker2.getJaarInDienstTreden(),gebruiker2.getFunctieGroep(), gebruiker2.getisBeheerder(), gebruiker2.getIsTester()));
        assertTrue  (gebruiker3.MagProductGroepAanmaken(gebruiker3.getJaarInDienstTreden(),gebruiker3.getFunctieGroep(), gebruiker3.getisBeheerder(), gebruiker3.getIsTester()));
        assertFalse (gebruiker4.MagProductGroepAanmaken(gebruiker4.getJaarInDienstTreden(),gebruiker4.getFunctieGroep(), gebruiker4.getisBeheerder(), gebruiker4.getIsTester()));
        assertTrue  (gebruiker5.MagProductGroepAanmaken(gebruiker5.getJaarInDienstTreden(),gebruiker5.getFunctieGroep(), gebruiker5.getisBeheerder(), gebruiker5.getIsTester()));
        assertTrue  (gebruiker6.MagProductGroepAanmaken(gebruiker6.getJaarInDienstTreden(),gebruiker6.getFunctieGroep(), gebruiker6.getisBeheerder(), gebruiker6.getIsTester()));
    }
}