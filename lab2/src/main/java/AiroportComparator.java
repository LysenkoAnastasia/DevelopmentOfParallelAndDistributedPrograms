import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AiroportComparator extends WritableComparator {

    public AiroportComparator() {

    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        AiroportKey a1 = (AiroportKey)a;
        AiroportKey b1 = (AiroportKey)b;
        return a1.getAiroportValue().compareTo(b1.getAiroportValue());
    }
}
