package ru.bmstu.hadoop.lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AiroportComparator extends WritableComparator {

    public AiroportComparator() {

        super(AirportKey.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        AirportKey a1 = (AirportKey)a;
        AirportKey b1 = (AirportKey)b;
        return a1.getAiroportValue().compareTo(b1.getAiroportValue());
    }
}
