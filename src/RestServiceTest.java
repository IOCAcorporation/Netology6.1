import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
@Test
    void shouldCalculateForRegistredAndOverLimit() {
RestServise servise = new RestServise();
long expected = 9;
int actual = servise.calculate(100_000, 13_000);
    Assertions.assertEquals(expected, actual);

}
}
