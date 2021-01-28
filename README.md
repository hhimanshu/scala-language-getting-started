# Scala Language: Getting Started
## Module 02: Installing Scala on Your Machine

The following instructions are for Mac
```sh
brew install openjdk@11
mkdir -p /Library/Java/JavaVirtualMachines/
sudo ln -sfn /usr/local/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk

brew install sbt

# find java home
ls /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home

# create new project
sbt --java-home /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home new scala/scala-seed.g8

# start sbt
sbt --java-home /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home
eval System.getProperty("java.version")
eval System.getProperty("java.home")

# scala REPL
sbt:gs> console
[info] compiling 1 Scala source to /Users/hhimanshu/Downloads/tmp/gs/target/scala-2.13/classes ...
[info] Starting scala interpreter...
Welcome to Scala 2.13.4 (OpenJDK 64-Bit Server VM, Java 11.0.9).
Type in expressions for evaluation. Or try :help.

scala>
```

Verify Scala version works and update to `2.13.4`
```shell
brew install openjdk@11
mkdir -p /Library/Java/JavaVirtualMachines/
sudo ln -sfn /usr/local/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk

brew install sbt

# find java home
ls /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home

# create new project
sbt --java-home /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home new scala/scala-seed.g8

# start sbt
sbt --java-home /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home
eval System.getProperty("java.version")
eval System.getProperty("java.home")

# scala REPL
sbt:gs> console
[info] compiling 1 Scala source to /Users/hhimanshu/Downloads/tmp/gs/target/scala-2.13/classes ...
[info] Starting scala interpreter...
Welcome to Scala 2.13.4 (OpenJDK 64-Bit Server VM, Java 11.0.9).
Type in expressions for evaluation. Or try :help.

scala>
```

## Module 03: Getting Started with REPL
### What is REPL

```
cd ~/Downloads/tmp/getting-started
sbt --java-home /Library/Java/JavaVirtualMachines/openjdk-11.jdk/Contents/Home

console

5
"hello"
5 + 10000
5 * 12355
"Hello" + " World"
:q
```

### How variable assignments work

```
scala> 5
val res0: Int = 5

scala> res0
val res1: Int = 5

scala> res1 * 10
val res2: Int = 50

scala> var num = 5
var num: Int = 5

-- type inference --

scala> 1.9
val res3: Double = 1.9

scala> true
val res4: Boolean = true

scala> "hello"
val res5: String = hello

scala> res5 + 100
val res6: String = hello100
```

### Getting Help and Command Completion

```
:help
:imports
:help load
:help paste
:help save

"hello"<tab>
"hello".<tab>
res3.toUpperCase
res3.length
res3.l<tab>
```

### Running Multiline Scala Code

```
var a1 = 100
var b1 = 200
var c1 = a1 * b1

:paste
var a2 = 1000
var b2 = 2000
var c2 = a2 * b2

:load
var a3 = 99
var b3 = 999
var c3 = a3 * b3
```

```
scala> :load /Users/hhimanshu/Downloads/multi.scala
```

### Replaying, Saving, and Resetting Your Sessions

```
var lunch = 123.45 / 4
var coffee = 50.67 / 4
var photoshoot = 87.76 / 4
var taxis = 77.12 / 4
var totalPerPerson = lunch + coffee + photoshoot + taxis

:replay
:save /Users/hhimanshu/Downloads/expenses.scala
:load /Users/hhimanshu/Downloads/expenses.scala

taxis
:he reset
:reset

taxis
:load /Users/hhimanshu/Downloads/expenses.scala
taxis
```

## Module 04: Working with Variables and Basic Types
### 2. Understanding Variables in Scala

```
scala> var number_1 = 10
var number_1: Int = 10

scala> var number_2:Int = 20
var number_2: Int = 20

scala> number_1 = -30
// mutated number_1

scala> number_1
val res0: Int = -30

scala> val number_3:Int = 45
val number_3: Int = 45

scala> number_3 = 47
                ^
       error: reassignment to val

scala> number_3
val res1: Int = 45 <-- REPL ASSIGNS VAL BY DEFAULT

scala> val number_4 = 56 // this is a number
val number_4: Int = 56

scala> // this is just a comment

scala> :paste
// Entering paste mode (ctrl-D to finish)

/**
 * This is a 
 * multline comment
 * example
 */
val number_5 = 99

// Exiting paste mode, now interpreting.

val number_5: Int = 99

scala> number_5
val res0: Int = 99

scala> var aString: String = "He said"
var aString: String = He said

scala> var aString: String = "He said - "I am good, how are you?""
                                                  ^
       error: ';' expected but ',' found.

scala> var aString: String = "He said - \"I am good, how are you?""
                                                                  ^
       error: unclosed string literal

scala> var aString: String = "He said - \"I am good, how are you?\""
var aString: String = He said - "I am good, how are you?"

scala>
```

### 3. Understanding Fundamental Types in Scala

```
scala> var five: Int = 5
var five: Int = 5

scala> var five: AnyVal = 5
var five: AnyVal = 5

scala> var five: Any = 5
var five: Any = 5

scala> var five: AnyRef = 5
                          ^
       error: the result type of an implicit conversion must be more specific than AnyRef

scala>
```

[Other AnyVals](https://www.scala-lang.org/api/current/scala/AnyVal.html)

```
// Numberic AnyVals
scala> val aDouble = 3.2
val aDouble: Double = 3.2

scala> val aFloat: Float = 3.2f
val aFloat: Float = 3.2

scala> val aLong = 100L
val aLong: Long = 100

scala> val anInt = 22
val anInt: Int = 22

scala> val aChar = 'c'
val aChar: Char = c

scala> val aShort: Short = 120
val aShort: Short = 120

scala> val aByte: Byte = 1
val aByte: Byte = 1

// Non-Numeric Types
scala> val aUnit: () = ()
val aUnit: Unit = ()

scala> val anotherUnit: () = 4
                             ^
       warning: a pure expression does nothing in statement position
val anotherUnit: Unit = ()

scala> val aFalse: Boolean = false
val aFalse: Boolean = false

scala> val aTrue: Boolean = true
val aTrue: Boolean = true
```

#### AnyRef

[Arrays](https://www.scala-lang.org/api/current/scala/Array.html)

[Lists](https://www.scala-lang.org/api/current/scala/collection/immutable/List.html)

```
scala> var arr: Array[Int] = Array(1, 2)
var arr: Array[Int] = Array(1, 2)

scala> var arr: AnyRef = Array(1, 2)
var arr: AnyRef = Array(1, 2)

scala> var arr: AnyVal = Array(1, 2)
                              ^
       error: the result type of an implicit conversion must be more specific than AnyVal

scala> var aList: List[String] = List("a", "b", "c")
var aList: List[String] = List(a, b, c)

scala> var aList: AnyRef = List("a", "b", "c")
var aList: AnyRef = List(a, b, c)

scala> var aList: AnyVal = List("a", "b", "c")
                               ^
       error: type mismatch;
        found   : List[String]
        required: AnyVal
       Note that implicit conversions are not applicable because they are ambiguous:
        both method ArrowAssoc in object Predef of type [A](self: A): ArrowAssoc[A]
        and method Ensuring in object Predef of type [A](self: A): Ensuring[A]
        are possible conversion functions from List[String] to AnyVal

scala>

scala> val aNumber: Int = 10
val aNumber: Int = 10

scala> aNumber
val res1: Int = 10

scala> val numbers: Array[Int] = Array(1, 2, 3, 4)
val numbers: Array[Int] = Array(1, 2, 3, 4)

scala> numbers
val res3: Array[Int] = Array(1, 2, 3, 4)

scala> numbers(2)
val res5: Int = 3

scala> numbers(4)
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
  ... 35 elided

scala>
```

[Null](https://www.scala-lang.org/api/2.9.1/scala/Null.html)

[Nothing](https://www.scala-lang.org/api/2.13.4/scala/Nothing.html)

```
scala> var aNull: Null = null
var aNull: Null = null

scala> var aNull: Null = "null"
                         ^
       error: type mismatch;
        found   : String("null")
        required: Null

scala>
```

[Type Casting](https://docs.scala-lang.org/tour/unified-types.html)

[Ascii table](https://www.ascii-code.com/)

```
scala> val aShort: Short = 128
val aShort: Short = 128

scala> val anInt: Int = aShort
val anInt: Int = 128

scala> val aShortFromInt: Short = anInt
                                  ^
       error: type mismatch;
        found   : Int
        required: Short

scala>

scala> val aFloat: Float = 3.22f
val aFloat: Float = 3.22

scala> val aDouble: Double = aFloat
val aDouble: Double = 3.2200000286102295

scala> val aFloatFromDouble: Float = aDouble
                                     ^
       error: type mismatch;
        found   : Double
        required: Float

scala>

scala> val aChar: Char = '#'
val aChar: Char = #

scala> val anInt: Int = aChar
val anInt: Int = 35

scala> val aCharFromInt: Char = anInt
                                ^
       error: type mismatch;
        found   : Int
        required: Char

scala>
```

### 4. Working with Date and Time in Scala

- [https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/package-summary.html](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/package-summary.html)
- [ZonedDateTime](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/ZoneId.html)

```
scala> LocalDate.now
val res1: java.time.LocalDate = 2021-01-05

scala> val d1 = LocalDate.of(2012, 12, 31)
val d1: java.time.LocalDate = 2012-12-31

scala> d1.isAfter(res1)
val res3: Boolean = false

scala> d1.isBefore(res1)
val res4: Boolean = true

scala> LocalTime.now
val res2: java.time.LocalTime = 18:04:47.657265

scala> val t1 = LocalTime.of(12, 10, 30)
val t1: java.time.LocalTime = 12:10:30

scala> t1.isBefore(res2)
val res4: Boolean = true

scala> res2.isAfter(t1)
val res6: Boolean = true

scala> LocalDateTime.now
val res7: java.time.LocalDateTime = 2021-01-05T18:06:04.395355

scala> val ldt1 = LocalDateTime.of(2012, 02, 01, 10, 10)
val ldt1: java.time.LocalDateTime = 2012-02-01T10:10

scala> ldt1
val ldt1: java.time.LocalDateTime
scala> ldt1.isBefore(res7)
val res11: Boolean = true

scala> res7
val res7: java.time.LocalDateTime
scala> res7.plusDays(10)
val res14: java.time.LocalDateTime = 2021-01-15T18:06:04.395355

scala> ZonedDateTime.now
val res16: java.time.ZonedDateTime = 2021-01-05T18:08:05.693317-08:00[America/Vancouver]

scala> ZoneId.getAvailableZoneIds
val res20: java.util.Set[String] = [Asia/Aden, America/Cuiaba, Etc/GMT+9, Etc/GMT+8, Africa/Nairobi, America/Marigot, Asia/Aqtau, Pacific/Kwajalein, America/El_Salvador, Asia/Pontianak, Africa/Cairo, Pacific/Pago_Pago, Africa/Mbabane, Asia/Kuching, Pacific/Honolulu, Pacific/Rarotonga, America/Guatemala, Australia/Hobart, Europe/London, America/Belize, America/Panama, Asia/Chungking, America/Managua, America/Indiana/Petersburg, Asia/Yerevan, Europe/Brussels, GMT, Europe/Warsaw, America/Chicago, Asia/Kashgar, Chile/Continental, Pacific/Yap, CET, Etc/GMT-1, Etc/GMT-0, Europe/Jersey, America/Tegucigalpa, Etc/GMT-5, Europe/Istanbul, America/Eirunepe, Etc/GMT-4, America/Miquelon, Etc/GMT-3, Europe/Luxembourg, Etc/GMT-2, Etc/GMT-9, America/Argentina/Catamarca, Etc/GMT...

scala> val zdt1 = ZonedDateTime.of(LocalDateTime.now, ZoneId.of("America/Panama"))
val zdt1: java.time.ZonedDateTime = 2021-01-05T18:11:13.809338-05:00[America/Panama]

scala> zdt1.isAfter(res16)
val res23: Boolean = false

scala> zdt1.isBefore(res16)
val res24: Boolean = true

scala> zdt1.getMonth
val res27: java.time.Month = JANUARY

scala> zdt1.plusMonths(12)
val res30: java.time.ZonedDateTime = 2022-01-05T18:11:13.809338-05:00[America/Panama]
```