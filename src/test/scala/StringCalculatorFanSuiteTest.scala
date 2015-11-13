import org.scalatest.{FunSuite, MustMatchers}

/**
 * Created by ldrygala on 2015-11-12.
 */
class StringCalculatorFanSuiteTest extends FunSuite with MustMatchers {
  test("StringCalculator should return zero for \"\"") {
    StringCalculator.sum("") mustBe 0
  }
  test("StringCalculator should return one for \"1\"") {
    StringCalculator.sum("1") mustBe 1
  }
}
