import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    private Text result;
    public void reduce(AiroportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        long count = 0;
        Iterator<Text> iter = values.iterator();
        while(iter.hasNext()) {
            iter.next();
            iter.toString();

            count++;
        }
        context.write(key, result);
    }
}
