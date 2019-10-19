import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer<AirportKey, Text, Text, Text> {
    public void reduce(AirportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        long count = 0;
        long time, minT = Long.MAX_VALUE, maxT = Long.MIN_VALUE;
        Iterator<Text> iter = values.iterator();
        String airportName = iter.next().toString();
        //System.out.println(iter.next().toString());
        //String airportName = key.getAiroportValue().toString();
        long averageT = 0;
        while(iter.hasNext()) {
            String strTime  = iter.next().toString();
            time = Long.parseLong(strTime);
            maxT = Math.max(maxT, time);
            minT  = Math.min(minT, time);
            count++;
            averageT += time;
        }

        if (count > 0) {
            averageT = averageT / count;
        } else if (count == 0) {
            return;
        }
        context.write(new Text(airportName), new Text(" Average time = " + averageT + " Max time = " + maxT + " Min time = " + minT));
    }
}
