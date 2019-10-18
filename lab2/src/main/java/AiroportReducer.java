import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    private Text result;
    public void reduce(AiroportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        
        context.write(key, result);
    }
}
