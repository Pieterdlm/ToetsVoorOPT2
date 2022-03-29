import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {
    @Test
    void maakProductAL() {

        //Arrange
        Kassa kassa = new Kassa();
        int expectedResult = 12;

        //Act
        ArrayList<Product> testLijst = kassa.maakProductAL();
        int actualResult = testLijst.size();


        //Assert
        assertEquals(expectedResult, actualResult);
    }
}