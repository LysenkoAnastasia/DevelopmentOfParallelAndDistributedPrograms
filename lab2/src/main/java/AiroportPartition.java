import javafx.scene.text.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AiroportPartition  extends Partitioner< AiroportKey,Text> {


    @Override
    public int getPartition(AiroportKey airoportKey, Text text, int i) {
        return 0;
    }
}
