/**
 * Created by ldrygala on 2015-11-12.
 */
case class Cell(x: Int, y: Int) {
  def possibleNeighbors(): Set[Cell] = (for {
    i <- x - 1 to x + 1
    j <- y - 1 to y + 1
  } yield Cell(i, j)).diff(Seq(this)).toSet
}

