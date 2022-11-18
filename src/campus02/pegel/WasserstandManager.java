package campus02.pegel;

import java.util.ArrayList;

public class WasserstandManager {
	
	private ArrayList<Wasserstand> list = new ArrayList<>();
	
	public void add(Wasserstand w) {
		list.add(w);
	}
	
	public Wasserstand findById(int id) {
		for(Wasserstand w : list) {
			if(w.getId()==id) {
				return w;
			}
		}
		return null;
	}
	
	public  ArrayList<Wasserstand> findAllByGewaesser(String name) {
		 ArrayList<Wasserstand> found = new ArrayList<>();
		for(Wasserstand w : list) {
			if(w.getGewaesserName().equals(name)) {
				found.add(w);
			}
		}
		return found;
	}
	
	public Wasserstand findNewestWasserstandForGewaesser(String gewaesserName) {
		int sekunden = 0;
		Wasserstand newest = null;
		for(Wasserstand w : list) {
			if(w.getGewaesserName().equals(gewaesserName)) {
				if(w.getZeitpunkt() > sekunden) {
					newest = w;
					sekunden = w.getZeitpunkt();
				}
			}
		}
		return newest;
	}
	
	public Wasserstand findOldestWasserstandForGewaesser(String gewaesserName) {
		int sekunden = Integer.MAX_VALUE;
		Wasserstand oldest = null;
		for(Wasserstand w : list) {
			if(w.getGewaesserName().equals(gewaesserName)) {
				if(w.getZeitpunkt() < sekunden) {
					oldest = w;
					sekunden = w.getZeitpunkt();
				}
			}
		}
		return oldest;
	}
	
	public  ArrayList<Wasserstand> findForAlarmierung() {
		 ArrayList<Wasserstand> found = new ArrayList<>();
		for(Wasserstand w : list) {
			if(w.getMesswert() >= w.getMesswertAlarm()) {
				found.add(w);
			}
		}
		return found;
	}
	
	public  ArrayList<Wasserstand> findByZeitspanne(int von, int bis, String name) {
		ArrayList<Wasserstand> found = new ArrayList<>();
		for(Wasserstand w : list) {
			if(w.getGewaesserName().equals(name)
					&& (w.getZeitpunkt() >= von && w.getZeitpunkt() <= bis) ) {
				found.add(w);
			}
		}
		return found;
	}
}
