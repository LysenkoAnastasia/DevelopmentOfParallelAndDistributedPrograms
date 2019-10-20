import javafx.util.Pair;

public class AirportParser {
    private String airoportID;
    private String airoporName;
    public AirportParser(String str) {
        String[] words = str.split(",[\"]");
        airoportID = words[0];
        airoporName = words[1];
    }

    public String getAiroportID() {
        return airoportID;
    }

    public String getAiroporName() {
        return airoporName;
    }
}
