package campus02.pegel;

import java.util.List;

public class DemoWasserstand {

    public static void main(String[] args) {

        Wasserstand w1 = new Wasserstand(1, "Mur", 3.75, 6.0, 100_000);
        System.out.println(w1);
        Wasserstand w2 = new Wasserstand(2, "Mur", 6.15, 6.0, 125_000);
        System.out.println(w2);

        Wasserstand w3 = new Wasserstand(3, "Enns", 2.97, 4.5, 100_000);
        System.out.println(w3);
        Wasserstand w4 = new Wasserstand(4, "Enns", 4.51, 4.5, 150_000);
        System.out.println(w4);

        Wasserstand w5 = new Wasserstand(5, "Donau", 7.00, 7.25, 130_000);
        System.out.println(w5);
        Wasserstand w6 = new Wasserstand(6, "Donau", 5.78, 7.25, 190_000);
        System.out.println(w6);

        WasserstandManager wmgr = new WasserstandManager();
        wmgr.add(w1);
        wmgr.add(w2);
        wmgr.add(w3);
        wmgr.add(w4);
        wmgr.add(w5);
        wmgr.add(w6);

        Wasserstand w = wmgr.findById(2);
        System.out.println("id 2 -> " + w);

        List<Wasserstand> ws = wmgr.findAllByGewaesser("Donau");
        System.out.println("Donau -> " + ws);

        w = wmgr.findNewestWasserstandForGewaesser("Enns");
        System.out.println("newest Enns -> " + w);

        w = wmgr.findOldestWasserstandForGewaesser("Mur");
        System.out.println("oldest Mur -> " + w);

        ws = wmgr.findForAlarmierung();
        System.out.println("alarm -> " + ws);

        ws = wmgr.findByZeitspanne(130_000, 190_000, "Donau");
        System.out.println("Donau innerhalb Zeitraum -> " + ws);

        ws = wmgr.findByZeitspanne(80_000, 90_000, "Mur");
        System.out.println("Mur innerhalb Zeitraum -> " + ws);


    }

}
