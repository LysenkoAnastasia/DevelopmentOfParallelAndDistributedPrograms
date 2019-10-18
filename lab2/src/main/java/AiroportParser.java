import javafx.util.Pair;

public class AiroportParser {
    private String airoportID;
    private String airoporName;
    public AiroportParser(String str) {
        String[] words = str.split(",[\"]");
        airoporName = words[1];
        airoportID = words[0];
    }

    public String getAiroportID() {
        return airoportID;
    }

    public String getAiroporName() {
        return airoporName;
    }
}
