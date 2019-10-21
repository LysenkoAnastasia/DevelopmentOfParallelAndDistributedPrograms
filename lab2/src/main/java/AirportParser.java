import javafx.util.Pair;

public class AirportParser {
    private String airoportID;
    private String airoporName;
    public AirportParser(String str) {
        String[] words = str.split(",[\"]");
        airoportID = words[0].replace("\"", "");
        airoporName = words[1].replace("\"", "");
    }

    public String getAiroportID() {
        return airoportID;
    }

    public String getAiroporName() {
        return airoporName;
    }
}
