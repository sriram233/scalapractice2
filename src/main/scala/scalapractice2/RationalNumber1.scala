package scalapractice2

class RationalNumber1(n:Int,d:Int) {
  val numerator = n
  val denominator = d

  def add(secondRationalNumber: RationalNumber1): RationalNumber1 = {
    new RationalNumber1(numerator * secondRationalNumber.denominator + denominator * secondRationalNumber.numerator, denominator * secondRationalNumber.denominator)
  }

  def sub(secondRationalNumber: RationalNumber1): RationalNumber1 = {
    new RationalNumber1(numerator * secondRationalNumber.denominator - denominator * secondRationalNumber.numerator, denominator * secondRationalNumber.denominator)
  }

  def mul(secondRationalNumber: RationalNumber1): RationalNumber1 = {
    new RationalNumber1(numerator * secondRationalNumber.denominator * denominator * secondRationalNumber.numerator, denominator * secondRationalNumber.denominator)
  }

  def div(secondRationalNumber: RationalNumber1): RationalNumber1 = {
    new RationalNumber1(numerator * secondRationalNumber.denominator / denominator * secondRationalNumber.numerator, denominator * secondRationalNumber.denominator)
  }
    override def toString(): String =
  {
  numerator+"/"+denominator
  }

}