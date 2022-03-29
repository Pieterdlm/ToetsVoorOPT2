import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {
    @Test
    void getisBeheerder() {

        //arrange
        Gebruiker gebruiker = new Gebruiker("Test",1234, true);
        boolean expectedResult = true;
        //act
        boolean actualResult = gebruiker.getisBeheerder();

        //Assert
        assertEquals(expectedResult, actualResult);

    }

}