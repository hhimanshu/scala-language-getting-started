def square(n: Int): Int = n * n // Int => Int
def cube(n: Int): Int = n * n * n // Int => Int
def sum(a: Int, b: Int): Int = a + b // (Int, Int) => Int
def length(a: String): Int = a.length // String => Int


def transform(f: Int => Int, numbers: Int*) = numbers.map(f)

transform(square, 1, 2, 3, 4)
transform(cube, 1, 2, 3, 4, 5)

transform((n: Int) => n * n, 1, 2, 3)
transform(n => n * n * n, 1, 2, 3)
transform(x => 2 * x, 1, 2, 3)

val numbers = Array(1, 2, 3, 4, 5, 6, 7)
numbers.map(num => num * 2)
numbers.filter(num => num % 2 == 0)
numbers.filter(num => num % 2 == 1)

import Implicits.stringToCurrency
val cad: Currency = "CAD 100"
