public class TravelDirector{
    public TravelPackage constructAllInclusiveTour(TravelPackageBuilder builder, String destination, int days) {
        return builder.reset()
                .setDestination(destination)
                .setDurationDays(days)
                .setHotelCategory("5-Star Luxury")
                .setIncludesFlight(true)
                .setIncludesTransfer(true)
                .setMealPlan("All Inclusive")
                .setIncludesExcursions(true)
                .build();
    }
    public TravelPackage constructBudgetTour(TravelPackageBuilder builder, String destination, int days) {
        return builder.reset()
                .setDestination(destination)
                .setDurationDays(days)
                .setHotelCategory("3-Star Standard")
                .setIncludesFlight(false)
                .setIncludesTransfer(false)
                .setMealPlan("Bed & Breakfast")
                .setIncludesExcursions(false)
                .build();
    }
}