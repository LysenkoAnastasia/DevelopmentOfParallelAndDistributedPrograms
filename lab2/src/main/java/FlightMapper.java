import javafx.util.Pair;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        AiroportParser airoportParser = new AiroportParser(value.toString());
        Pair<String, String> pair = airoportParser.getClass(); //??
        context.write(new AiroportKey(pair.getKey(), 1), new Text(pair.getValue()));
    }
}