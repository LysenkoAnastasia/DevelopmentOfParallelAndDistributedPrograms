import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        AirportParser airoportParser = new AirportParser(value.toString());

        context.write(new AirportKey(airoportParser.getAiroportID(), 0), new Text(airoportParser.getAiroporName()));
    }
}
