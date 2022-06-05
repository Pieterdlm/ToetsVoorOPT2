import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {
    @Test
    void maakProductAL() {

        KassaConnection kassaConnection = new GraanVoorVisch();
        //Arrange
        int expectedResult = 12;

        //Act
        ArrayList<Product> testLijst = kassaConnection.alleProducten();
        int actualResult = testLijst.size();


        //Assert
        assertEquals(expectedResult, actualResult);
    }
}