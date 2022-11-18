package campus02.pegel;

import java.util.Objects;

public class Wasserstand {
	
	private int id;
	private String gewaesserName;
	private double messwert;
	private double messwertAlarm;
	private int zeitpunkt;

	public Wasserstand(int id, String gewaesserName, double messwert, double messwertAlarm, int zeitpunkt) {
		this.id = id;
		this.gewaesserName = gewaesserName;
		this.messwert = messwert;
		this.messwertAlarm = messwertAlarm;
		this.zeitpunkt = zeitpunkt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGewaesserName() {
		return gewaesserName;
	}

	public void setGewaesserName(String gewaesserName) {
		this.gewaesserName = gewaesserName;
	}

	public double getMesswert() {
		return messwert;
	}

	public void setMesswert(double messwert) {
		this.messwert = messwert;
	}

	public double getMesswertAlarm() {
		return messwertAlarm;
	}

	public void setMesswertAlarm(double messwertAlarm) {
		this.messwertAlarm = messwertAlarm;
	}

	public int getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(int zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Wasserstand that = (Wasserstand) o;
		return id == that.id &&
			   Double.compare(that.messwert, messwert) == 0 &&
			   Double.compare(that.messwertAlarm, messwertAlarm) == 0 &&
			   zeitpunkt == that.zeitpunkt &&
			   Objects.equals(gewaesserName, that.gewaesserName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, gewaesserName, messwert, messwertAlarm, zeitpunkt);
	}

	@Override
	public String toString() {
		return "Wasserstand{" +
			   "id=" +
			   id +
			   ", gewaesserName='" +
			   gewaesserName +
			   '\'' +
			   ", messwert=" +
			   messwert +
			   ", messwertAlarm=" +
			   messwertAlarm +
			   ", zeitpunkt=" +
			   zeitpunkt +
			   '}';
	}
}
