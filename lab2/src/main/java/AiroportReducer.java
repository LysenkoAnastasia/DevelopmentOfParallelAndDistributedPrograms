import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AiroportReducer extends Reducer<AiroportKey, Text, Text, Text> {
    private Text result;
    public void reduce(AiroportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        long count = 0;
        Double time, minT = Double.MAX_VALUE, maxT = Double.MIN_VALUE, averageT = 0.0;
        Iterator<Text> iter = values.iterator();
        while(iter.hasNext()) {
            result = iter.next();
            String strTime  = iter.toString();
            time = new Double(strTime);
            maxT = Math.max(maxT, time);
            minT  = Math.min(minT, time);
            count++;
        }
        if (count > 0) {
            averageT = averageT / count;
        }
        context.write(result, new Text(" Average time = " + averageT + " Max time = " + maxT + " Min time = " + minT));
    }
}
