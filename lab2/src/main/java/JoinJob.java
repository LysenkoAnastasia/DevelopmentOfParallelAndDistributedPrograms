import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class JoinJob {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: JoinJob <input path Airoport>  <input path Flight> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        Configuration conf = new Configuration();
        job.setJarByClass(JoinJob.class);
        job.setJobName("JoinJob sort");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, AirportMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, FlightMapper.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        Path outputPath = new Path(args[2]);

        job.setPartitionerClass(AiroportPartition.class);
        job.setGroupingComparatorClass(AiroportComparator.class);
        job.setReducerClass(AirportReducer.class);
        job.setMapOutputKeyClass(AirportKey.class);
        job.setMapOutputValueClass(Text.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        job.setNumReduceTasks(2);
//        outputPath.getFileSystem(conf).delete(outputPath);
        outputPath.getFileSystem(conf);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}

