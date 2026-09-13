public class ConcreteTravelPackageBuilder implements TravelPackageBuilder {
    private String destination;
    private int durationDays;
    private String hotelCategory;
    private boolean includesFlight;
    private boolean includesTransfer;
    private String mealPlan;
    private boolean includesExcursions;

    public ConcreteTravelPackageBuilder() {
        reset();
    }
    @Override
    public TravelPackageBuilder reset() {
        this.destination = "";
        this.durationDays = 0;
        this.hotelCategory = "Standard";
        this.includesFlight = false;
        this.includesTransfer = false;
        this.mealPlan = "Bed & Breakfast";
        this.includesExcursions = false;
        return this;
    }
    @Override
    public TravelPackageBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    @Override
    public TravelPackageBuilder setDurationDays(int durationDays) {
        this.durationDays = durationDays;
        return this;
    }
    @Override
    public TravelPackageBuilder setHotelCategory(String hotelCategory) {
        this.hotelCategory = hotelCategory;
        return this;
    }
    @Override
    public TravelPackageBuilder setIncludesFlight(boolean includesFlight) {
        this.includesFlight = includesFlight;
        return this;
    }
    @Override
    public TravelPackageBuilder setIncludesTransfer(boolean includesTransfer) {
        this.includesTransfer = includesTransfer;
        return this;
    }
    @Override
    public TravelPackageBuilder setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }
    @Override
    public TravelPackageBuilder setIncludesExcursions(boolean includesExcursions) {
        this.includesExcursions = includesExcursions;
        return this;
    }
    @Override
    public TravelPackage build() {
        if (destination == null || destination.isEmpty()) {
            throw new IllegalStateException("Destination cannot be empty");
        }
        if (durationDays <= 0) {
            throw new IllegalStateException("Duration must be more than 0 days");
        }
        return new TravelPackage(
                destination,
                durationDays,
                hotelCategory,
                includesFlight,
                includesTransfer,
                mealPlan,
                includesExcursions
        );
    }
}