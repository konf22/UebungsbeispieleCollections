package campus02.eventkalender;

import java.util.Objects;

public class Event {

    private String title;
    private String ort;
    private double eintrittspreis;

    // Konstruktor -> automatisch generieren über Code - Generate (ALT + Einfg)
    public Event(String title, String ort, double eintrittspreis) {
        this.title = title;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }

    // getter und setter -> automatisch generieren über Code - Generate (ALT + Einfg)

    public String getTitle() {
        return title;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getOrt() {
        return ort;
    }

    public Event setOrt(String ort) {
        this.ort = ort;
        return this;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public Event setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
        return this;
    }

    // equals und hashcode -> automatisch generieren über Code - Generate (ALT + Einfg)
    // Verwendet werden dafür nur title und ort. der preis soll für vergleiche nicht verwendet werden
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Event that = (Event) o;
        return Objects.equals(title, that.title) && Objects.equals(ort, that.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ort);
    }

    // toString für die Ausgabe -> automatisch generieren über Code - Generate (ALT + Einfg)
    @Override
    public String toString() {
        return "EventKalender{" +
               "title='" +
               title +
               '\'' +
               ", ort='" +
               ort +
               '\'' +
               ", eintrittspreis=" +
               eintrittspreis +
               '}';
    }
}
