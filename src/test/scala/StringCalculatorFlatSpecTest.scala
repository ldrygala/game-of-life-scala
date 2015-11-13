import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ldrygala on 2015-11-12.
 */
class StringCalculatorFlatSpecTest extends FlatSpec with Matchers {
  "StringCalculator" should "return 0 for \"\"" in {
    StringCalculator.sum("") shouldBe 0
  }
  it should "return 1 for \"1\"" in {
    StringCalculator.sum("1") shouldBe 1
  }
}
