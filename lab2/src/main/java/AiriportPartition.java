import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.apache.hadoop.mapreduce.Partitioner;

import java.security.Key;

public class AiriportPartition  extends Partitioner<Key, Value> {
    public AiriportPartition() { }

    @Override
    public int getPartition(Key key, Value value, int numPeduceTasks) {
        return (key.hashCode() & Integer.MAX_VALUE) % numPeduceTasks;
    }
}
