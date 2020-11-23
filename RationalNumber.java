public class RationalNumber extends RealNumber {

  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      denominator = 1;
      numerator = deno;
    } else {
      numerator = nume;
      denominator = deno;
    }
    this.reduce();
  }

  public double getValue() {
    return ( (double)numerator ) / ( (double)denominator );
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return ( numerator == other.getNumerator() && denominator == other.getDenominator() );
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integer
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    if (a < b) {
      int temp = a;
      a = b;
      b = temp;
    }
    while (a % b != 0) {
      int teme = a % b;
      a = b;
      b = teme;
    }
    /*use euclids method or a better one*/
    /*http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html*/
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int div = gcd(numerator, denominator);
    numerator = numerator / div;
    denominator = denominator / div;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber( numerator * other.getNumerator(),
                                                 denominator * other.getDenominator() );
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber( numerator * other.getDenominator(),
                                                  denominator * other.getNumerator() );
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int top = ( numerator * other.getDenominator() ) + ( denominator * other.getNumerator() );
    RationalNumber sum = new RationalNumber( top, denominator * other.getDenominator() );
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int top = ( numerator * other.getDenominator() ) - ( denominator * other.getNumerator() );
    RationalNumber sum = new RationalNumber( top, denominator * other.getDenominator() );
    return sum;
  }

}
