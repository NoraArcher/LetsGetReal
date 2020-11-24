public class DriverRealRational {
  public static void main(String[] args) {


    System.out.println("\nReal Number Tests-");
    if (true) {
      RealNumber ten = new RealNumber(10.145799);
      RealNumber notTen = new RealNumber(10.145798);
      if ( ten.equals(notTen) ) {
        System.out.println("equals test: SUCCESS");
      } else {
        System.out.println("\t\t\tequals test: FAIL");
      }
      RealNumber six = new RealNumber(6.3);
      RealNumber sixteen = new RealNumber(16.445799);
      RealNumber doesIt = ten.add(six);
      if ( doesIt.equals(sixteen) ) {
        System.out.println("add test: SUCCESS");
      } else {
        System.out.println("\t\t\tadd test: FAIL");
      }
      RealNumber seven = new RealNumber(7.1);
      RealNumber two = new RealNumber(2.5);
      if ( seven.multiply(two).getValue() == 17.75 ) {
        System.out.println("multiply test: SUCCESS");
      } else {
        System.out.println("\t\t\tmultiply test: FAIL");
      }
      RealNumber seventeen = new RealNumber(17.75);
      if ( seventeen.divide(two).getValue() == 7.1 ) {
        System.out.println("divide test: SUCCESS");
      } else {
        System.out.println("\t\t\tdivide test: FAIL");
      }
      if ( sixteen.subtract(ten).equals(six) ) {
        System.out.println("subract test: SUCCESS");
      } else {
        System.out.println("\t\t\tsubtract test: FAIL");
      }

    }

    System.out.println("\n---------------------------\n");

    System.out.println("Rational Number Tests (Basics) -");
    if (true) {
      RationalNumber nowpos = new RationalNumber(-5, -3);
      if ( nowpos.toString().equals("5/3") ) {
        System.out.println("constructor test: SUCCESS");
      } else {
        System.out.println("\t\t\tConstructor test: FAIL");
      }
      RationalNumber negneg = new RationalNumber(5, -3);
      if ( negneg.toString().equals("-5/3") ) {
        System.out.println("constructor test: SUCCESS");
      } else {
        System.out.println("\t\t\tConstructor test: FAIL");
      }
      RationalNumber Thrquarter = new RationalNumber(3, 4);
      if ( Thrquarter.getValue() == 0.75 ) {
        System.out.println("getValue test: SUCCESS");
      } else {
        System.out.println( "\t\t\tgetValue test: FAIL, value = " + Thrquarter.getValue() );
      }
      if ( Thrquarter.getNumerator() == 3 && Thrquarter.getDenominator() ==  4) {
        System.out.println("get components test: SUCCESS");
      } else {
        System.out.println("\t\t\tget components test: FAIL");
      }
      System.out.println();
      if ( Thrquarter.reciprocal().getNumerator() == 4 && Thrquarter.reciprocal().getDenominator() ==  3) {
        System.out.println("reciprocal test: SUCCESS");
      } else {
        System.out.println("\t\t\treciprocal test: FAIL");
      }
      RationalNumber dreiViertel = new RationalNumber(3, 4);
      RationalNumber Thrquint = new RationalNumber(3, 5);
      if (  Thrquarter.equals(dreiViertel) && !( Thrquarter.equals(Thrquint) )  ) {
        System.out.println("equals test: SUCCESS");
      } else {
        System.out.println("\t\t\tequals test: FAIL");
      }
      if ( Thrquint.toString().equals("3/5") ) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("\t\t\toString test: FAIL");
      }
      RationalNumber vierr = new RationalNumber(4, 1);
      if ( vierr.toString().equals("4") ) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("\t\t\toString test: FAIL");
      }
      RationalNumber messy = new RationalNumber(6, 0);
      if ( messy.toString().equals("0") ) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("\t\t\toString test: FAIL");
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Rational Number Tests (Level 2) -");
    if (true) {

      RationalNumber complex = new RationalNumber(21, 14);
      if ( complex.getNumerator() == 3 && complex.getDenominator() ==  2) {
        System.out.println("reduce test: SUCCESS");
      } else {
        System.out.println("\t\t\treduce test: FAIL");
      }
      RationalNumber DreiFuenf = new RationalNumber(3, 5);
      RationalNumber ZweiSieben = new RationalNumber(2, 7);
      RationalNumber SweetSum = new RationalNumber(31, 35);
      if ( DreiFuenf.add(ZweiSieben).equals(SweetSum) ) {
        System.out.println("add test: SUCCESS");
      } else {
        System.out.println("\t\t\tadd test: FAIL");
      }
      RationalNumber DreizehnFuenf = new RationalNumber(13, 5);
      RationalNumber FuenfzehnSieben = new RationalNumber(15, 7);
      RationalNumber DiddlingDifference = new RationalNumber(16, 35);
      if ( DreizehnFuenf.subtract(FuenfzehnSieben).equals(DiddlingDifference) ) {
        System.out.println("subtract test: SUCCESS");
      } else {
        System.out.println("\t\t\tsubtract test: FAIL");
      }
      RationalNumber zweiDrei = new RationalNumber(2, 3);
      RationalNumber SechsFuenf = new RationalNumber(6, 5);
      if ( zweiDrei.divide(SechsFuenf).getNumerator() == 5 ) {
        System.out.println("divide test: SUCCESS");
      } else {
        System.out.println("\t\t\tdivide test: FAIL");
      }
      if ( zweiDrei.multiply(SechsFuenf).getNumerator() == 4 ) {
        System.out.println("multiply test: SUCCESS");
      } else {
        System.out.println("\t\t\tmultiply test: FAIL");
      }

    }

    System.out.println("\n---------------------------\n");

    System.out.println("Abstract Number Tests  -");
    if (true) {

      RealNumber mia = new RealNumber(7.5);
      RationalNumber moi = new RationalNumber(15, 2);
      if (mia.compareTo(moi) == 0) {
        System.out.println("compareTo test: SUCCESS");
      } else {
        System.out.println("\t\t\tcompareTo test: FAIL");
      }
      RealNumber fia = new RealNumber(7.2);
      if (fia.compareTo(mia) < 0) {
        System.out.println("compareTo test: SUCCESS");
      } else {
        System.out.println("\t\t\tcompareTo test: FAIL");
      }
      RealNumber foi = new RationalNumber(10, 3);
      if (mia.compareTo(foi) > 0) {
        System.out.println("compareTo test: SUCCESS");
      } else {
        System.out.println("\t\t\tcompareTo test: FAIL");
      }
      RealNumber moif = new RealNumber(7.5000004);
      if (mia.compareTo(moif) == 0) {
        System.out.println("compareTo test: SUCCESS");
      } else {
        System.out.println("\t\t\tcompareTo test: FAIL");
      }

      //System.out.println( "\n"+mia+" compared to "+foi+" outputs "+mia.compareTo(foi) );

    }

    System.out.println("\n---------------------------\n");



  }
}
