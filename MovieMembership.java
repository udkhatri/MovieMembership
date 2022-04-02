package MovieMembership;
public abstract class MovieMembership {
    // instance variables
    private String memberName;
    private String nextMovie;
    private String theatreType;
    private String snack;
    
    private int showHour;
    private int showMinutes;
    private int points;
    
    public MovieMembership(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.snack = snack;
        this.showHour = showHour;
        this.showMinutes = showMinutes;
        this.points = 0;
    }
    public MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "standard";
        this.showHour = 0;
        showMinutes = 0;
        this.snack = "unknown";
        this.points = 0;
    }

    // all getter methods
    public String getMemberName(){
        return memberName;
    }; 
    public String getNextMovie() {
        return nextMovie;
    }
    public int getPoints() {
        return points;
    }
    public String getSnacks() {
        return snack;
    }
    public String getTheatreType() {
        return theatreType;
    }
    public String getMemberDetails() {
        return memberName + "is watching " + nextMovie + "with " + theatreType + "screening at " + displayShowTime() + ". They will have " + snack + "as a snacks and they have " + points + "points.";
    }
    public String displayShowTime() {
        return showHour + ":" + showMinutes;
    }

    // all setter methods
    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }
    public void addPoint(int points) {
        this.points += points;
    }
    public void setSnack(String snack) {
        this.snack = snack;
    }
    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }
    public void setShowTime(int hour, int minutes) {
        this.showHour = hour;
        this.showMinutes = minutes;
    }
    
    // abstract methods
    abstract public String returnMembershipRank();
    abstract public String printMemberBenefits();
    abstract public void purchaseMovieTicket(Double ticketPrice, String nextMovie, String theatreType,int showHour, int showMinutes, String snack);
   
}