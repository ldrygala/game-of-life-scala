Stream.continually("").zipWithIndex.map {
  case (s,n) if (n+1)%3==0 => "fizz"
  case (s,n) if (n+1)%5==0 => "buzz"
  case (s,_) => s
}.take(5).force

val s:Stream[String] = "" #:: "" #:: "fizz" #:: s
s.take(5).force
val ii:Stream[Int] = Stream.cons(1, Stream.cons(ii.head + 1, ii.tail))
ii.take(3).force