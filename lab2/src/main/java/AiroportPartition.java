import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AiroportPartition  extends Partitioner<AiroportKey, Text> {
    public AiroportPartition() { }

    @Override
    public int getPartition(AiroportKey key, Text value, int numPeduceTasks) {
        return (key.getAiroportValue().hashCode() & Integer.MAX_VALUE) % numPeduceTasks;
    }
}
