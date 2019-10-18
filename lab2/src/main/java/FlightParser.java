public class FlightParser {
    private String flightID;
    private String flightName;
    public FlightParser(String str) {
        String[] words = str.split(",");
        flightName = words[1];
        flightID = words[0];
    }

    public String getFlightID() {
        return flightID;
    }

    public String getFlightName() {
        return flightName;
    }
}
