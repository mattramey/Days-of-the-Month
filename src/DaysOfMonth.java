import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) throws Exception {

       
        //instantiate scanner class
        try (Scanner input = new Scanner(System.in)) {

             // have user enther the year they desire
        System.out.println("Enter the year you want ");

             int year = input.nextInt();

             boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

           // have user enter a number between 1 and 12
        System.out.println("Enter Month as a number 1-12 ");

        int number = input.nextInt();
        // declare switch statement for number of days in each month also concantinate the string
        switch(number){
            case 1:
                System.out.println("Januaray " + year + " had 31 days");
                break;
        /*
         febuary will use the conditional operator ( ? : ) in order to make a descision of 28 or 29 days
          variable x = (expression) ? value if true : value if false
         */
            case 2:
                System.out.println("February " + year +  " had " + ((leapYear) ? " 29 days " : " 28 days "));
                break;
            case 3:
                System.out.println("March " + year + " had 31 days");
                break;
            case 4:
                System.out.println("April " + year + " had 30 days");
                break;
            case 5:
                System.out.println("May " + year + " had 31 days");
                break;
            case 6:
                System.out.println("June " + year + " had 30 days");
                break;
            case 7:
                System.out.println("July " + year + " had 31 days");
                break;


            case 8:
                System.out.println("August " + year + " had 31 days");
                break;
            case 9:
                System.out.println("September " + year + " had 30 days");
                break;
            case 10:
                System.out.println("October " + year + " had 31 days");
                break;
            case 11:
                System.out.println("November " + year + " had 30 days");
                break;
            case 12:
                System.out.println("December " + year + " had 31 days");
                break; 
            default: 
                System.out.println("Error, please enter a number 1 - 12");

                
            }
        }
    }
}