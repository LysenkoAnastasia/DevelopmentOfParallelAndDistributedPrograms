import org.apache.hadoop.mapreduce.Partitioner;

public class AiriportPartition  extends Partitioner<> {
    public AiroportPartition() {

    }


    @Override
    public int getPartition(Object o, Object o2, int i) {
        return 0;
    }
}
