package MovieMembership;
import java.util.Scanner;
public class GoldMember extends SilverMember implements VIPPrivilege {

    private boolean validCredentials;

    // constructors
    public GoldMember(String memberName) {
        super(memberName,0.25,2.0);
        this.validCredentials = false;
        super.addPoint(50);
    }
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack,0.25,2.0);
        this.validCredentials = false;
        super.addPoint(50);
    }
    
    // overridden abstract methods
    @Override
    public String returnMembershipRank(){
        return "Gold";
    }
    public String getMemberDetails(){
        return super.getMemberDetails() + " Member is entitled to VIP privileges."; 
    }
    @Override
    public void accessVIPLounge() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        int password = input.nextInt();
        if (password == PASSWORD) {
            this.validCredentials = true;
            System.out.println("Access granted!");
        } else {
            System.out.println("Invalid password. You have been denied access.");
        }
        input.close();
    }
    @Override
    public String purchaseAlcohol() {
        if (this.validCredentials) {
            super.setSnack("Alcohol");
            return "Enjoy your beverages.";
        } else {
            return "Beverage cannot be purchased because no valid password has been entered.";
        }
    }
    
}
