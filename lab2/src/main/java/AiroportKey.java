import org.apache.hadoop.io.WritableComparable;

public class AiroportKey implements WritableComparable<AiroportKey> {
    public String value;
    public int num;

    public AiroportKey() {
        this.value = value;
        this.num = 0;
    }

    public AiroportKey(String value, int num) {
        this.value = value;
        this.num = num;
    }


    @Override
    public int compareTo(AiroportKey airoportKey) {
        return 0;
    }
}
