import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {
    @Test
    void maakProductAL() {

        //Arrange
        int expectedResult = 12;

        //Act
        ArrayList<Product> testLijst = Kassa.maakProductAL();
        int actualResult = testLijst.size();


        //Assert
        assertEquals(expectedResult, actualResult);
    }
}