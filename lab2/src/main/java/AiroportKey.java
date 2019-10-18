import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportKey implements WritableComparable<AiroportKey> {
    private Text airoportValue;
    private Text num;

    public AiroportKey() {
        this.airoportValue = new Text();
        this.num = new Text();
    }

    public AiroportKey(String value, String num) {
        this.airoportValue = new Text(value);
        this.num = new Text((num));
    }

    @Override
    public int compareTo(AiroportKey airoportKey) {

        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        airoportValue.write(dataOutput);
        num.write(dataOutput);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        airoportValue.readFields(dataInput);
        num.readFields(dataInput);
    }

    public Text getAiroportValue() {
        return airoportValue;
    }

     public Text getNum() {
        return num;
     }
}
