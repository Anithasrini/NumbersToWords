import java.util.HashMap;

public class NumbersToWords {
    public static void main(String[] args) {}

  public String putItInWords(Integer userInput) {

    HashMap<Integer, String> numbers = new HashMap<Integer, String>();

    numbers.put(0, "zero");
    numbers.put(1, "one");
    numbers.put(2, "two");
    numbers.put(3, "three");
    numbers.put(4, "four");
    numbers.put(5, "five");
    numbers.put(6, "six");
    numbers.put(7, "seven");
    numbers.put(8, "eight");
    numbers.put(9, "nine");
    numbers.put(10, "ten");
    numbers.put(11, "eleven");
    numbers.put(12, "twelve");
    numbers.put(13, "thirteen");
    numbers.put(14, "fourteen");
    numbers.put(15, "fifteen");
    numbers.put(16, "sixteen");
    numbers.put(17, "seventeen");
    numbers.put(18, "eighteen");
    numbers.put(19, "nineteen");
    numbers.put(20, "twenty");
    numbers.put(30, "thirty");
    numbers.put(40, "forty");
    numbers.put(50, "fifty");
    numbers.put(60, "sixty");
    numbers.put(70, "seventy");
    numbers.put(80, "eighty");
    numbers.put(90, "ninety");

    String result = "";

    Integer divisor = 0;
    Integer remainder = 0;
    Integer remainderOfRemainder = 0;

    if( userInput < 1000 && userInput > 109 ) {
        divisor = 100;
        remainder = userInput % divisor;
        result += numbers.get((userInput / divisor)) + " hundred";
        if (remainder < 110 && remainder > 20) {
          divisor = 10;
          remainderOfRemainder = remainder % divisor;
          result += numbers.get(remainder - remainderOfRemainder);
          if ( remainderOfRemainder > 0 )
              result += numbers.get(remainderOfRemainder);
        }

    } else if( userInput < 110 && userInput > 20 ) {
        divisor = 10;
        remainder = userInput % divisor;
        result += numbers.get(userInput - remainder);
        if ( remainder > 0 )
            result += numbers.get(remainder);

    } else if( userInput < 21 && userInput >= 0 ) {
        result += numbers.get( userInput );
    }

    return result;
  }
}
