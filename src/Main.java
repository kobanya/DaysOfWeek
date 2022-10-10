public class Main {   // Save as "PrintNumberInWord.java"
    public static void main(String[] args) {
        int number = 5;  // Set the value of "number" here!

        System.out.println( "The day is / A hét kiválasztott napja az első módszerrel:");

        // Using nested-if
        if (number == 1) {   // Use == for comparison
            System.out.println( "Monday /Hétfő");
        } else if ( number == 2 ) {
            System.out.println( " Tuesday /Kedd");
        } else if ( number == 3 ) {
            System.out.println( "Wednesday /Szerda");
        } else if ( number == 4 ) {
            System.out.println( "Thursday /Csütörtök");
        } else if ( number == 5 ) {
            System.out.println( "Friday/Péntek");
        } else if ( number == 6 ) {
            System.out.println( "Saturday /Szombat");
        } else if ( number == 7 ) {
            System.out.println( "Sunday /Vasárnap");
        }



        else {
            System.out.println( "Not a valid day/ Nincs ilyen nap a hét napjai között");
        }


        // Using switch-case-default

        System.out.println( "The day is / A hét számjeggyel megadott napja a masodik módszerrel:");

        switch(number) {
            case 1:
                System.out.println("Monday /Hétfő"); break;  // Don't forget the "break" after each case!
            case 2:
                System.out.println("Tuesday /Kedd "); break;
            case 3:
                System.out.println("Wednesday /Szerda\""); break;
            case 4:
                System.out.println("Thursday /Csütörtök"); break;
            case 5:
                System.out.println("Friday/Péntek"); break;
            case 6:
                System.out.println("Saturday /Szombat"); break;
            case 7:
                System.out.println("Sunday /Vasárnap"); break;


            default: System.out.println( "Not a valid day/ Nincs ilyen nap a hét napjai között" );
        }
    }
}