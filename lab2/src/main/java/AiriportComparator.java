import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AiriportComparator extends WritableComparator {

    public AiriportComparator() {

    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
