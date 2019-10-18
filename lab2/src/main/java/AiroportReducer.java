import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    public void reduce(AiroportKey key, Iterable<> values, Context context) {
        context.write()
    }

}
