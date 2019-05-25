package club.istudy.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,'1'",
            "2,'2'",
            "3,'Fizz'",
            "5,'Buzz'",
            "15,'FizzBuzz'"
    })
     public void test(int input, String output) {
        assertEquals(output,FizzBuzz.getOne(input));
    }
}