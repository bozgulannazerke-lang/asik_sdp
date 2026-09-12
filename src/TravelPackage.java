public class TravelPackage {
    private String destination;
    private int durationDays;
    private String hotelCategory;
    private boolean includesFlight;
    private boolean includesTransfer;
    private String mealPlan;
    private boolean includesExcursions;

    public TravelPackage(String destination, int durationDays, String hotelCategory,
                         boolean includesFlight, boolean includesTransfer,
                         String mealPlan, boolean includesExcursions) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.hotelCategory = hotelCategory;
        this.includesFlight = includesFlight;
        this.includesTransfer = includesTransfer;
        this.mealPlan = mealPlan;
        this.includesExcursions = includesExcursions;
    }
    public String getDestination() {
        return destination;
    }
    public int getDurationDays() {
        return durationDays;
    }
    public String getHotelCategory() {
        return hotelCategory;
    }
    public boolean isIncludesFlight() {
        return includesFlight;
    }
    public boolean isIncludesTransfer() {
        return includesTransfer;
    }
    public String getMealPlan() {
        return mealPlan;
    }
    public boolean isIncludesExcursions() {
        return includesExcursions;
    }
    @Override
    public String toString() {
        return "TravelPackage{" +
                "destination='" + destination + '\'' +
                ", durationDays=" + durationDays +
                ", hotelCategory='" + hotelCategory + '\'' +
                ", includesFlight=" + includesFlight +
                ", includesTransfer=" + includesTransfer +
                ", mealPlan='" + mealPlan + '\'' +
                ", includesExcursions=" + includesExcursions +
                '}';
    }
}