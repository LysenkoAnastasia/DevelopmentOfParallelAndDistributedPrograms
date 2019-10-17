import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AiroportComparator extends WritableComparator {

    public AiroportComparator() {

    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
