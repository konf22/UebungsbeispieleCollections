package campus02.eventkalender;

import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> events;

    public EventKalender() {
        this.events = new ArrayList<>();
    }

    /**
     * füge ein übergebenes event der liste der events hinzu
     *
     * @param event das event, das hinzugefügt werden soll
     */
    public void add(Event event) {
        events.add(event);
    }

    /**
     * Suche in der Liste der events nach einem event, dass den gesuchten title hat
     * wenn ein event existiert, retourniere dieses ansonsten null
     *
     * @param title titel des gesuchten events
     * @return      das zum title gehörende event
     */
    public Event getByTitle(String title) {
        for (Event event : events) { // iteriere über jedes event in events
            // wenn der title des events == gesuchter title
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    /**
     * Liefert alle events, welche im übergebenen ort stattfinden, retour
     *
     * @param ort   ort, in dem die events stattfinden
     * @return      Liste aller events, die im übergebenen Ort stattfinden
     */
    public ArrayList<Event> getByOrt(String ort) {
        // Liste zum Aufnehmen aller gefundenen events
        ArrayList<Event> found = new ArrayList<>();
        for (Event event : events) {
            if (event.getOrt().equals(ort)) {
                found.add(event);
            }
        }
        return found;
    }

    /**
     * Liefert alle events, welche zwischen einer angebenen Preisspanne liegen retour
     *
     * @param min   minimaler Eintrittspreis
     * @param max   maximaler Eintrittspreis
     * @return      Liste aller events innerhalb einer übergebenen Preisspanne
     */
    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        // Liste zum Aufnehmen aller gefundenen events
        ArrayList<Event> found = new ArrayList<>();
        for(Event event : events) {
            if(event.getEintrittspreis() >= min
               && event.getEintrittspreis() <= max) {
                found.add(event);
            }
        }
        return found;
    }

    /**
     * Liefert das event mit dem höchsten Eintrittspreis im übergebenen Ort retour
     *
     * @param ort   der ort des events
     * @return      das event mit dem höchsten Eintrittspreis im übergebenen ort
     */
    public Event getMostExpensiveByOrt(String ort) {
        // zwischenspeicher für den maximalen Preis
        double maxPreis = 0.0;
        Event mostExpensive = null;

        for(Event event : events) {
            if(event.getOrt().equals(ort)) {
                if(event.getEintrittspreis() > maxPreis) {
                    maxPreis = event.getEintrittspreis();
                    mostExpensive = event;
                }
            }
        }
        return mostExpensive;
    }

    /**
     * Liefert den durchschnittlichen Eintrittspreis aller events im übergebenen ort
     *
     * @param ort   der ort der events
     * @return      durchschnittlicher Eintrittspreis
     */
    public double getAvgPreisByOrt(String ort) {
        double sum = 0.0;
        int count = 0;
        for(Event event : events) {
            if (event.getOrt().equals(ort)) {
                sum += event.getEintrittspreis();
                count++;
            }
        }

        // auf div by 0 checken
        if (count > 0) {
            return sum / count;
        }

        return 0.0;
    }
}
