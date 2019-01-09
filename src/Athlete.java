import java.util.Set;

public class Athlete {

	static int nextBibNumber = 1;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		this.bibNumber = nextBibNumber;
	nextBibNumber += 1;
	}

	public static void main(String[] args) {
		// create two athletes //print their names, bibNumbers, and the location of
		// their race. }
System.out.println(new	Athlete("Bill", 6 ));
System.out.println(new	Athlete("Bob", 7 ));
newRaceLocation("Los Angeles");
System.out.println(new	Athlete("Bill", 6 ));
System.out.println(new	Athlete("Bob", 7 ));
	

	}
	public String toString(){
		return "In "+raceLocation + " athlete "+name + " is running with bib number "  +bibNumber;

	}
public static void newRaceLocation(String raceLocation) {
	Athlete.raceLocation = raceLocation;
	
}
	}



