import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTests {
    @Test
    public void Sum_of_two_numbers()
    {
        // Arrange
        double first = 10;
        double second = 20;
        var calculator = new Calculator();
        // Act
        double result = calculator.Sum(first, second);
        // Assert
        Assertions.assertEquals(30, result);
    }
}
