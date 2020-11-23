public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if (value == 0 || other.getValue() == 0) return (value == other.getValue());
    //value * 0.99999 - 99.999% of value
    //99.999 + 0.001 =  100;
    if ( percentDiff( value, other.getValue() ) <= 0.0001 ) {
      return true;
    }
    return false;
  }

  private double percentDiff(double v1, double v2) {
    double top = Math.abs(v1 - v2) * 50;
    return (top / (v1 + v2));
  }
  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    RealNumber ninny = new RealNumber( value + other.getValue() );
    return ninny;
    //other can be ANY RealNumber, including a RationalNumber
    //or other subclasses of RealNumber (that aren't written yet)
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    RealNumber ninny = new RealNumber( value * other.getValue() );
    return ninny;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    RealNumber ninny = new RealNumber( value / other.getValue() );
    return ninny;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber ninny = new RealNumber( value - other.getValue() );
    return ninny;
  }
}
