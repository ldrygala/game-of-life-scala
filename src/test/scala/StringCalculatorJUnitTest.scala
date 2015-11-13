import org.junit.{Assert, Test}

/**
 * Created by ldrygala on 2015-11-12.
 */
class StringCalculatorJUnitTest {

  @Test
  def shouldReturnZeroForEmptyString(): Unit = {
    Assert.assertEquals(0, StringCalculator.sum(""))
  }

  @Test
  def shouldReturnOneForOneString(): Unit = {
    Assert.assertEquals(1, StringCalculator.sum("1"))
  }

}
