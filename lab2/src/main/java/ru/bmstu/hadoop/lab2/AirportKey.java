import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey implements WritableComparable<AirportKey> {
    private Text airoportValue;
    private IntWritable num;

    public AirportKey() {
        this.airoportValue = new Text();
        this.num = new IntWritable();
    }

    public AirportKey(String value, int num) {
        this.airoportValue = new Text(value);
        this.num = new IntWritable(num);
    }

    @Override
    public int compareTo(AirportKey airoportKey) {
        int res  = airoportValue.compareTo(airoportKey.airoportValue);
        if (res == 0) {
            return this.num.compareTo(airoportKey.num);
        }
        return res;
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
}
