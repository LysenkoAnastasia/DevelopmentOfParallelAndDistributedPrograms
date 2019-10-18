import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.apache.hadoop.mapreduce.Partitioner;
import org.w3c.dom.Text;

import java.security.Key;

public class AiriportPartition  extends Partitioner<AiroportKey, Text> {
    public AiriportPartition() { }

    @Override
    public int getPartition(AiroportKey key, Text value, int numPeduceTasks) {
        return (key.getAiroportValue().hashCode() & Integer.MAX_VALUE) % numPeduceTasks;
    }
}
