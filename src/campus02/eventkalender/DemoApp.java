package campus02.eventkalender;

import java.util.ArrayList;

public class DemoApp {

    public static void main(String[] args) {

        Event e1 = new Event("Konzert X", "Graz", 45.00);
        Event e2 = new Event("Theater Y", "Graz", 35.00);
        Event e3 = new Event("Kinovorstellung Z", "Graz", 12.00);
        Event e4 = new Event("Fußballspiel A vs. B", "München", 76.00);
        Event e5 = new Event("Tennisspiel C vs. D", "London", 100.00);

        EventKalender ek = new EventKalender();
        ek.add(e1);
        ek.add(e2);
        ek.add(e3);
        ek.add(e4);
        ek.add(e5);

        Event byTitle = ek.getByTitle("Kinovorstellung Z");
        System.out.println(byTitle);
        byTitle = ek.getByTitle("bla blub");
        System.out.println(byTitle);

        ArrayList<Event> byOrt = ek.getByOrt("Graz");
        System.out.println(byOrt);
        byOrt = ek.getByOrt("Wien");
        System.out.println(byOrt);

        ArrayList<Event> byPreis = ek.getByEintrittsPreis(35.0, 76.0);
        System.out.println(byPreis);

        Event mostExpensiveGraz = ek.getMostExpensiveByOrt("Graz");
        System.out.println(mostExpensiveGraz);

        Event mostExpensiveLondon = ek.getMostExpensiveByOrt("London");
        System.out.println(mostExpensiveLondon);

        double avgPreisGraz = ek.getAvgPreisByOrt("Graz");
        System.out.println(avgPreisGraz);

        double avgPreisMuenchen = ek.getAvgPreisByOrt("München");
        System.out.println(avgPreisMuenchen);
    }
}
