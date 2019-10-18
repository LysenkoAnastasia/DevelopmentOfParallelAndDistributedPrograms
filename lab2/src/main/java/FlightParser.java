public class FlightParser {
    private String flightID;
    private Double delayTime = 0.0;
    public FlightParser(String str) {
        String[] words = str.split(",");
        flightID = words[14];
        if (words[18] != "") {
            delayTime = new Double(words[18]);

        }
    }

    public String getFlightID() {
        return flightID;
    }

    public Double getDelayTime() {
        return delayTime;
    }
}
