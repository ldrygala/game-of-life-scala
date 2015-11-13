import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by ldrygala on 2015-11-12.
 */
class GameOfLifeTest extends FlatSpec with Matchers {
  "A living cell in next generation" should "die when does not have neighbors" in {
    val cell: Cell = Cell(0, 0)
    val nextGeneration: Game = Game(cell).nextGeneration()
    nextGeneration.isAlive(cell) shouldBe false
  }
  it should "die when have only one neighbor" in {
    val cell = Cell(0,0)
    val neighbor = Cell(0,1)
    val nextGeneration: Game = Game(cell,neighbor).nextGeneration()
    nextGeneration.isAlive(cell) shouldBe false
  }
  it should "alive when have two neighbors" in {
    val cell = Cell(0,0)
    val neighbor1 = Cell(0,1)
    val neighbor2 = Cell(1,0)
    val nextGeneration: Game = Game(cell,neighbor1,neighbor2).nextGeneration()
    nextGeneration.isAlive(cell) shouldBe true
  }

  it should "alive when have three neighbors" in {
    val cell = Cell(0,0)
    val neighbor1 = Cell(0,1)
    val neighbor2 = Cell(1,0)
    val neighbor3 = Cell(1,1)
    val nextGeneration: Game = Game(cell,neighbor1,neighbor2,neighbor3).nextGeneration()
    nextGeneration.isAlive(cell) shouldBe true
  }

  it should "die when have four neighbors" in {
    val neighbor1 = Cell(0,1)
    val neighbor2 = Cell(1,0)
    val neighbor3 = Cell(0,0)
    val neighbor4 = Cell(0,2)
    val cell = Cell(1,1)
    val nextGeneration: Game = Game(cell,neighbor1,neighbor2,neighbor3,neighbor4).nextGeneration()
    nextGeneration.isAlive(cell) shouldBe false
  }

  "A dead cell" should "alive when have three neighbors" in {
    val deadCell = Cell(0,0)
    val neighbor1 = Cell(0,1)
    val neighbor2 = Cell(1,0)
    val neighbor3 = Cell(1,1)
    val nextGeneration: Game = Game(neighbor1,neighbor2,neighbor3).nextGeneration()
    nextGeneration.isAlive(deadCell) shouldBe true

  }
}
