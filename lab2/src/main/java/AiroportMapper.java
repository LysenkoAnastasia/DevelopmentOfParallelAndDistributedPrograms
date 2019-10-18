import javafx.util.Pair;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.Optional;

public class AiroportMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
     AiroportParser airoportParser = new AiroportParser(value.toString());
        Optional<Long> airoportKey = airoportParser;
        Optional<String> airoportValue = airoportParser;
    context.write(new AiroportKey(airoportKey, 0), new Text(pair.getValue()));
    }
}
