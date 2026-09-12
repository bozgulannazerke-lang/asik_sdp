public interface TravelPackageBuilder {
    TravelPackageBuilder reset();
    TravelPackageBuilder setDestination(String destination);
    TravelPackageBuilder setDurationDays(int durationDays);
    TravelPackageBuilder setHotelCategory(String hotelCategory);
    TravelPackageBuilder setIncludesFlight(boolean includesFlight);
    TravelPackageBuilder setIncludesTransfer(boolean includesTransfer);
    TravelPackageBuilder setMealPlan(String mealPlan);
    TravelPackageBuilder setIncludesExcursions(boolean includesExcursions);
    TravelPackage build();
}