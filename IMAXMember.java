package MovieMembership;
public class IMAXMember extends MovieMembership{
    private double discountRate;
    private double pointsRate;

    // constructors
    public IMAXMember(String memberName) {
        super(memberName);
        if(super.getTheatreType() == "IMAX"){
            this.discountRate = 0.5;
            this.pointsRate = 1.3;
        }
        super.addPoint(25);
    }
    public IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack){
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        if(theatreType == "IMAX"){
            this.discountRate = 0.5;
            this.pointsRate = 1.3;
        }
    }

    // getter methods (overrides)
    public String getMemberDetails(){
        return super.getMemberDetails() + "They have "+ returnMembershipRank() + "membership."; 
    }

    // overridden abstract methods
    @Override
    public String returnMembershipRank() {
        return "IMAX";
    }
    @Override
    public String printMemberBenefits() {
        return "Discount rate for IMAX members is " + discountRate + " and point rate is " + pointsRate;
    }
    @Override
    public void purchaseMovieTicket(Double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinutes, String snack) {
               
                super.setNextMovie(nextMovie);
                super.setTheatreType(theatreType);
                super.setShowTime(showHour, showMinutes);
                super.setSnack(snack);
                // will set original price as a discounted price if type is not IMAX
                double priceWithDiscount = ticketPrice;

                if(theatreType == "IMAX"){
                    priceWithDiscount = ticketPrice * (1 - discountRate);
                    super.addPoint((int) (ticketPrice * pointsRate));
                }
                System.out.println(" ");
                System.out.println("The Movie "+ super.getNextMovie() + " has been purchased by " + super.getMemberName() + " for " + priceWithDiscount + "$ and will be showing at" + super.displayShowTime() + " with" + super.getTheatreType() + " screening. They have eared " + super.getPoints() + " points.");
        
    }

    
}
