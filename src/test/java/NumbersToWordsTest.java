import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest{

  @Test
  public void putItInWords_numberLessThan20ShouldReturnNumberInWords_fourteen() {
    NumbersToWords numberstowords = new NumbersToWords();
    assertEquals("fourteen", numberstowords.putItInWords(14));
  }

  @Test
  public void putItInWords_numberBetween21And99ShouldReturnNumberInWords_seventyeight() {
    NumbersToWords numberstowords = new NumbersToWords();
    assertEquals("seventyeight", numberstowords.putItInWords(78));
  }

  @Test
  public void putItInWords_numberBetween110And999ShouldReturnNumberInWords_899() {
    NumbersToWords numberstowords = new NumbersToWords();
    assertEquals("eight hundredninetynine", numberstowords.putItInWords(899));
  }

}
