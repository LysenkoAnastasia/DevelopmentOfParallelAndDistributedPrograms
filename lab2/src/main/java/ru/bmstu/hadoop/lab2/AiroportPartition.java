package ru.bmstu.hadoop.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AiroportPartition  extends Partitioner<AirportKey, Text> {
    public AiroportPartition() { }

    @Override
    public int getPartition(AirportKey key, Text value, int numPeduceTasks) {
        return (key.getAiroportValue().hashCode() & Integer.MAX_VALUE) % numPeduceTasks;
    }
}
