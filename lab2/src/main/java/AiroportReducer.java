import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Reducer;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    private AiroportKey result;
    public void reduce(AiroportKey key, WritableComparable<AiroportKey> values, Context context) {

        context.write(key, result);
    }

}
