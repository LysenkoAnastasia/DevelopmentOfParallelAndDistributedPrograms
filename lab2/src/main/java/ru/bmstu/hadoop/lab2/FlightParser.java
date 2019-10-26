package ru.bmstu.hadoop.lab2;

public class FlightParser {
    private String flightID;
    private long delayTime = 0;
    private static int FLIGHT = 14;
    private static int DELAYTIME = 18;
    private static String STR_SPLIT = ",";
    ParserReplace rep = new ParserReplace();

    public FlightParser(String str) {
        String[] words = str.split(STR_SPLIT);
        flightID = words[FLIGHT];
        if (!words[DELAYTIME].isEmpty()) {
            delayTime = (long)Double.parseDouble(rep.removeQuotation(words[DELAYTIME]));
        }
    }

    public String getFlightID() {
        return flightID;
    }

    public long getDelayTime() {
        return delayTime;
    }
}
