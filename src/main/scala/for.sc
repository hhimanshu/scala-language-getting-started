val amounts = Array(10, 24, 35, 23, 12)
val currencies = Array("USD", "NZD")

val result: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "NZD" || currency == "USD")
} yield currency + " " + amount


// foreach is a statement
amounts.foreach(amount => println(amount * 1000))
List(1, 2, 3, 4).foreach(num => println(num * 20))
