public class Main {
    public static void main(String[] args) {
        TravelPackageBuilder builder = new ConcreteTravelPackageBuilder();
        TravelDirector director = new TravelDirector();

        TravelPackage luxuryTour = director.constructAllInclusiveTour(builder, "Maldives", 7);
        System.out.println("Luxury Tour: " + luxuryTour);

        TravelPackage budgetTour = director.constructBudgetTour(builder, "Rome", 4);
        System.out.println("Budget Tour: " + budgetTour);

        TravelPackage customTour = builder.reset()
                .setDestination("Tokyo")
                .setDurationDays(10)
                .setHotelCategory("4-Star Premium")
                .setIncludesFlight(true)
                .setMealPlan("Half Board")
                .setIncludesExcursions(true)
                .build();

        System.out.println("Custom Tour: " + customTour);
    }
}