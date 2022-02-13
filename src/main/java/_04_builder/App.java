package _04_builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan plan = tourDirector.cancunTrip();
        TourPlan plan1 = tourDirector.longBeachTrip();
    }
}
