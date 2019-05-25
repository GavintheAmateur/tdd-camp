package club.istudy.tdd;

public class FizzBuzz {
    public static String getOne(int input) {
        String output = "";
        if (input % 3 == 0) {
            output +="Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (output.isEmpty()) {
            output = String.valueOf(input);
        }
        return output;

    }
}
