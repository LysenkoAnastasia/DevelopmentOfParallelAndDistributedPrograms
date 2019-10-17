import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.nio.file.Path;

public class JoinJob {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: JoinJob <input path> <input path> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(JoinJob.class);
        job.setJobName("JoinJob sort");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, AiroportMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, FlightMapper.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        job.setPartitionerClass(AiroportPartition.class);
        job.setGroupingComparatorClass(AiroportComparator.class);
        job.setReducerClass(JoinReducer.class);
        job.setMapOutputKeyClass(Text.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        job.setNumReduceTasks(2);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}

