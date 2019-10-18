import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportKey extends Text implements WritableComparable<AiroportKey> {
    private String airoportValue;
    private int num;

    public AiroportKey() {
        this.airoportValue = airoportValue;
        this.num = 0;
    }

    public AiroportKey(String value, int num) {
        this.airoportValue = value;
        this.num = num;
    }

    @Override
    public int compareTo(AiroportKey airoportKey) {
        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeChars(airoportValue);
        dataOutput.writeInt(num);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        airoportValue = dataInput.readLine();
        num = dataInput.readInt();
    }

    public String getAiroportValue() {
        return airoportValue;
    }
     public String getNum() {
        return num;
     }
}
