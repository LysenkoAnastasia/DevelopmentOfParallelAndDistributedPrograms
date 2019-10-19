public class FlightParser {
    private String flightID;
    private long delayTime = 0;
    public FlightParser(String str) {
        String[] words = str.split(",");
        flightID = words[14].replace("\"", "");
        if (words[18] != "") {
            delayTime = (long)Double.parseDouble(words[18]);

        }
    }

    public String getFlightID() {
        return flightID;
    }

    public long getDelayTime() {
        return delayTime;
    }
}
