package scalapractice

  object RunRationalNumber {
    def main(args: Array[String]): Unit ={
      val firstRationalNumber = new RationalNumber(1,3)
      val secondRationalNumber = new RationalNumber(1,6)
      val addOfNumber = firstRationalNumber.add(secondRationalNumber)
      val subOfNumbers = firstRationalNumber.sub(secondRationalNumber)
      val mulOfNumbers = firstRationalNumber.mul(secondRationalNumber)
      val divOfNumbers = firstRationalNumber.div(secondRationalNumber)

      println("First Rational Number: "+firstRationalNumber)
      println("Second Rational Number: "+secondRationalNumber)
      println("Addition of two Rational Numbers: "+addOfNumber)
      println("Subtraction of two Rational Numbers: "+subOfNumbers)
      println("Multiplication of two Rational Numbers: "+mulOfNumbers)
      println("Division of two Rational Numbers: "+divOfNumbers)

    }
  }


