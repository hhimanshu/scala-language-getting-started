val aTuple = ("USD", 100)

aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "NZD" => println("USD " + amount * (1/1.50))
}
