import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {
    //Test of de Arraylist met alle producten correct wordt opgehaald.
    @Test
    void maakProductAL() {

        KassaConnection kassaConnection = new GraanVoorVisch();
        //Arrange
        int expectedResult = 9;

        //Act
        ArrayList<Product> testLijst = kassaConnection.alleProducten();
        int actualResult = testLijst.size();


        //Assert
        assertEquals(expectedResult, actualResult);
    }
}