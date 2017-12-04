package scalapractice2

object RunRationalNumber1 {
  def main(args: Array[String]): Unit ={
    val firstRationalNumber = new RationalNumber1(1,3)
    val secondRationalNumber = new RationalNumber1(1,6)
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



