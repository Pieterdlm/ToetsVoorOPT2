import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testToString() {
        //Arrange
        Product product = new Product("test", 2.00);
        String expectedResult = "Product: test --- Prijs: 2.0";
        //Act
        String actualResult = product.toString();

        //Assert
        assertEquals(expectedResult, actualResult);
    }
}