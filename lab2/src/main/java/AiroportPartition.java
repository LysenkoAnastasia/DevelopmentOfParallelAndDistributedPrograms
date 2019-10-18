import javafx.scene.text.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AiroportPartition  extends Partitioner< AiroportKey,Text> {


    @Override
    public int getPartition(AiroportKey airoportKey, Text text, int numReduceTasks) {
        return (airoportKey.hashCode() & Integer.MAX_VALUE) & numReduceTasks;
    }
}
