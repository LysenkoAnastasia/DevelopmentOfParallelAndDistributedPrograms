import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    private String result;
    public void reduce(AiroportKey key, Iterable<String> values, Context context) {

        context.write(key, "")
    }

}
