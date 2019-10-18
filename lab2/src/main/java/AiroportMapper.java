
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AiroportMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
     AiroportParser airoportParser = new AiroportParser(value.toString());

    context.write(new AiroportKey(), new Text());
    }
}
