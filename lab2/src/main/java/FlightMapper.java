import javafx.util.Pair;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get()  == 0) return;
        FlightParser flightParser = new FlightParser(value.toString());

        Double delTime = flightParser.getDelayTime();

        if (delTime >  0) {
        context.write(new AiroportKey(flightParser.getFlightID(), "1"), new Text(delTime.toString()));
        }
    }
}