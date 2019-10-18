import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportKey implements WritableComparable<AiroportKey> {
    private String value;
    private int num;

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

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeChars(value);
        dataOutput.writeInt(num);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        value = dataInput.readLine();
        num = dataInput.readInt();
    }
}
