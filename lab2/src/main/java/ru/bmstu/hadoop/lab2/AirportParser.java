package ru.bmstu.hadoop.lab2;

public class AirportParser {
    private String airportID;
    private String airporName;
    private static int AIRPORPID = 0;
    private static int AIRPORTNAME = 1;
    private static String STRSPLIT = ",[\"]";
    ParserReplace rep = new ParserReplace();

    public AirportParser(String str) {
        String[] words = str.split(STRSPLIT);
        airportID = rep.removeQuotation(words[AIRPORPID]);
        airporName = rep.removeQuotation(words[AIRPORTNAME]);
    }

    public String getAiroportID() {
        return airportID;
    }

    public String getAiroporName() {
        return airporName;
    }
}
