/**
 * Created by ldrygala on 2015-11-12.
 */
case class Game(cells: Set[Cell]) {
  def nextGeneration(): Game = {
    val cellsToReborn: Set[Cell] = (cells ++ cells.flatMap(_.possibleNeighbors())).filter(shouldAlive)
    Game(cells.filterNot(shouldDie) ++ cellsToReborn)
  }

  def isAlive(cell: Cell): Boolean = cells.contains(cell)

  private def countNeighbors(c: Cell): Int = c.possibleNeighbors.intersect(cells).size

  private val shouldDie = (c: Cell) => countNeighbors(c) > 3 || countNeighbors(c) < 2
  private val shouldAlive = countNeighbors(_: Cell) == 3
}

object Game {
  def apply(cells:Cell*):Game = Game(cells.toSet)
}