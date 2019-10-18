import javafx.util.Pair;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AiroportMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        AiroportParser airoportParser = new AiroportParser(value.toString());

        context.write(new AiroportKey(airoportParser.getAiroportID(), "0"), new Text(airoportParser.getAiroporName()));
    }
}
