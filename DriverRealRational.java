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
      if ( doesIt.getValue() == sixteen.getValue() ) {
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

    System.out.println("Rational Number Tests-");
    if (false) {
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
      if ( doesIt.getValue() == sixteen.getValue() ) {
        System.out.println("add test: SUCCESS");
      } else {
        System.out.println("\t\t\tadd test: FAIL");
      }
    }

    System.out.println("\n---------------------------\n");


  }

}
