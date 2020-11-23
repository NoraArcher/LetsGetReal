public abstract class Number{


  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    double mid = ( this.getValue() - other.getValue() );
    if (mid == 0.0) return 0;
    double end = ( mid / Math.abs(mid) * (Math.abs(mid) + 1) );
    return (int)end;
  }

  public boolean equals(Number other){
    if (this.getValue() == 0 || other.getValue() == 0) return (this.getValue() == other.getValue());
    if ( percentDiff( this.getValue(), other.getValue() ) <= 0.0001 ) {
      return true;
    }
    return false;
  }

  private double percentDiff(double v1, double v2) {
    double top = Math.abs(v1 - v2) * 50;
    return (top / (v1 + v2));
  }



}
