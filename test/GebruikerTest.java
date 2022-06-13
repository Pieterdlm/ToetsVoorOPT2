import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {
    //Test of de gebruiker daadwerkelijk een beheerder is.
    @Test
    void getisBeheerder() {

        //arrange
        WerkInfo werkInfo = new WerkInfo(true, 2020, 1 , false);
        Gebruiker gebruiker = new Gebruiker("Test",1234, werkInfo);
        boolean expectedResult = true;
        //act
        boolean actualResult = gebruiker.werkInfo.isBeheerder();

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    //Test of de gebruiker een productgroep mag aanmaken
    @Test
    void magProductGroepAanmaken() {
        WerkInfo werkinfogebruiker1 = new WerkInfo(true, 2020, 1, true);
        Gebruiker gebruiker1 = new Gebruiker("Test1",0001,werkinfogebruiker1);

        WerkInfo werkinfogebruiker2 = new WerkInfo(false, 2015, 1, false);
        Gebruiker gebruiker2 = new Gebruiker("Test2",0002, werkinfogebruiker2);

        WerkInfo werkinfogebruiker3 = new WerkInfo(true, 2015, 2, true);
        Gebruiker gebruiker3 = new Gebruiker("Test3",0003,werkinfogebruiker3 );

        WerkInfo werkinfogebruiker4 = new WerkInfo(false, 2020, 2, false);
        Gebruiker gebruiker4 = new Gebruiker("Test4",0004,werkinfogebruiker4 );

        WerkInfo werkinfogebruiker5 = new WerkInfo(true, 2020, 3, false);
        Gebruiker gebruiker5 = new Gebruiker("Test5",0005, werkinfogebruiker5);

        WerkInfo werkinfogebruiker6 = new WerkInfo(false, 2015, 3, true);
        Gebruiker gebruiker6 = new Gebruiker("Test5",0006,werkinfogebruiker6 );


        assertTrue  (gebruiker1.werkInfo.MagProductGroepAanmaken(gebruiker1));
        assertFalse (gebruiker2.werkInfo.MagProductGroepAanmaken(gebruiker2));
        assertTrue  (gebruiker3.werkInfo.MagProductGroepAanmaken(gebruiker3));
        assertFalse (gebruiker4.werkInfo.MagProductGroepAanmaken(gebruiker4));
        assertTrue  (gebruiker5.werkInfo.MagProductGroepAanmaken(gebruiker5));
        assertTrue  (gebruiker6.werkInfo.MagProductGroepAanmaken(gebruiker6));
    }
}