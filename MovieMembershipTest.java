/*
    Name of programmer: Uday Khatri
    Name of Program: MovieMembershipTest.java
    Purpose of program: To test the MovieMembership classes.
    Date: 02/04/2022
*/

package MovieMembership;

public class MovieMembershipTest {
    public static void main(String[] args) {
        // Objects of respective classes
        SilverMember mySilver = new SilverMember("Uday Khatri", "Dr. Strange", "IMAX", 12, 30, "Popcorn");
        GoldMember myGold = new GoldMember("Shivam Khanna", "Batman", "standard", 12, 30, "Samosa");
        IMAXMember myIMAX = new IMAXMember("Drashti Bhavsar", "Red Turn", "IMAX", 12, 30, "French fries");

        //  array of type MovieMembership 
        MovieMembership[] movieMembershipArray = { mySilver, myGold, myIMAX };

        //  loop that will traverse through every element of the movieMembershipArray
            for (MovieMembership movieMembership : movieMembershipArray) {
                System.out.println("Member name: " + movieMembership.getMemberName());
                System.out.println("Member Rank: " + movieMembership.returnMembershipRank());
                System.out.println("Next Movie: " + movieMembership.getNextMovie());
                System.out.println("Showtime: " + movieMembership.displayShowTime());
                System.out.println("Theatre type: " + movieMembership.getTheatreType());
                System.out.println("Points: " + movieMembership.getPoints());
                System.out.println("Snack: " + movieMembership.getSnacks());
                System.out.println("");
                System.out.println(movieMembership.getMemberDetails());
                System.out.println(movieMembership.printMemberBenefits());
                System.out.println("");
                System.out.println("=================================================================");
                System.out.println("");
            }

        //  loop that will traverse through every element of the movieMembershipArray
        for (MovieMembership movieMembership : movieMembershipArray) {
            movieMembership.purchaseMovieTicket(6.99, "The Matrix 4", "standard", 11, 25, "Popcorn");
            movieMembership.setSnack("Sour Keys");
        }

        //  Invoke accessVIPLounge() method for the myGold object to prompt the user to enter their password.
        myGold.accessVIPLounge();

        //  Invoke purchaseAlcohol() method for myGold and output if the purchase was successful
        System.out.println(myGold.purchaseAlcohol());

        // Call the getMemberDetails () method for myGold and print the information to the screen
        System.out.println("");
        System.out.println(myGold.getMemberDetails());

        // Purchase a movie ticket for mySilver and enter the information
        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "standard", 14, 25, "Smarties");

        // Purchase a movie ticket for myGold and enter the information
        myGold.purchaseMovieTicket(15.98, "The Big Shot", "standard", 12, 50, "Kitkat");

        // Purchase a movie ticket for IMAX and enter the information
         myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");

        //  Call getMemberDetails() for all three objects and print the returned values to the screen
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("\b"+mySilver.getMemberDetails());
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("\b"+myGold.getMemberDetails());
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("\b"+myIMAX.getMemberDetails());
    }
   
}
