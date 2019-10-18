
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AiroportMapper extends Mapper<LongWritable, Text, AiroportKey, Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
     
        String line = value.toString();
        String[] words = line.replaceAll("(?U)[^-\\w\\s]", "").split("\\s+");
        for (String word: words) {
            context.write(new AiroportKey(), new Text("1"));
        }
    }
}
