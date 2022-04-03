package MovieMembership;
public class SilverMember extends MovieMembership{
    private double discountRate;
    private double pointsRate;

    // constructors
    public SilverMember(String memberName){
        super(memberName);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }
    public SilverMember(String memberName, double discountRate, double pointsRate){
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack){
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack, double discountRate, double pointsRate){
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    // getter methods (overrides)
    public String getMemberDetails(){
        return super.getMemberDetails() + "They have "+ returnMembershipRank() + "membership."; 
    }

    // overridden abstract methods
    @Override
    public String returnMembershipRank() {
        return "Silver";
    }
    @Override
    public String printMemberBenefits() {
        return "Discount rate for Silver members is " + discountRate + " and point rate is " + pointsRate;
    }
    @Override
    public void purchaseMovieTicket(Double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinutes, String snack) {
                super.setNextMovie(nextMovie);
                super.setTheatreType(theatreType);
                super.setShowTime(showHour, showMinutes);
                super.setSnack(snack);
                super.addPoint((int) (ticketPrice * pointsRate));

                double priceWithDiscount = ticketPrice * (1 - discountRate);
                System.out.println("");
                System.out.println("The Movie "+ super.getNextMovie() + " has been purchased by " + super.getMemberName() + " for " + priceWithDiscount + "$ and will be showing at" + super.displayShowTime() + " with" + super.getTheatreType() + " screening. They have eared " + super.getPoints() + " points.");
    }
    
}
