package MovieMembership;
import java.util.Scanner;
public class GoldMember extends SilverMember implements VIPPrivilege {

    private boolean validCredentials;

    public GoldMember(String memberName) {
        super(memberName,0.25,2.0);
        this.validCredentials = false;
    }
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack,0.25,2.0);
        this.validCredentials = false;
    }

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
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
        if (password.equals(PASSWORD)) {
            this.validCredentials = true;
            System.out.println("Access granted!");
        } else {
            System.out.println("Invalid password. You have been denied access.");
        }
    }
    @Override
    public String purchaseAlcohol() {
        return null;
    }
    
}
