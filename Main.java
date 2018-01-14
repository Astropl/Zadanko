package SDA;

import java.util.Scanner;

public class Main {

    private static String brandName;

    public static void main ( String[] args ) {

        Car[] cars = new Car[3];


        Car car = new Car ();
        Car car1 = new Car ();
        Car car2 = new Car ();
        Car car3 = new Car ();
        Car car4 = new Car ();
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        /*public void modify ( String model, String color, long vin, Engine engine ) {*/
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Podaj marke samochodu\n1. Volkswagen.\n2. Toyota" );
        int marka = sc.nextInt ();

                /*vWGroup vWGroup1 = null;
                vWGroup1 = new vWGroup ();
*/

        if (marka == 1)

        {
            /*toyotaGroup toyotaGroup1 = new toyotaGroup ();
            toyotaGroup1.modify (  );*/
            //vWGroup vWGroup1 = new vWGroup ( );

            System.out.println ( car.getColor () );
            System.out.println ( car.getBrandName () );
            System.out.println ( car.getmodel () );
            System.out.println ( car.getVin () );

        } else if (marka == 2) {
            System.out.println ( car.getColor () );
            System.out.println ( car.getBrandName () );
            System.out.println ( car.getmodel () );
            System.out.println ( car.getVin () );
            ;

        }
    }


    //public void modify ( String model, String color, long vin, Engine engine ) {


    //@Override
                /*public void setBrandName () {


                }*/
}

;










