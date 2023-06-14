/*
Shortest remaining time next(SRTN) is a scheduling algorithm which
serve first the process which having shortest remaining time among all
the process. Write a java program which take N process burst time
and print the scheduling sequence using SRTN.
 */

package Assignment2_B;
import java.util.*;

public class A2Q3 {

    public static void main(String[] args) {

        // Get the number of processes
        int n = Integer.parseInt(args[0]);

        // Create an array of processes
        Process[] processes = new Process[n];

        // Get the burst time of each process
        for (int i = 0; i < n; i++) {
            processes[i] = new Process(i, Integer.parseInt(args[i + 1]));
        }

        // Sort the processes by their burst time
        Arrays.sort(processes, Comparator.comparingInt(p -> p.burstTime));

        // Create a queue to store the processes
        Queue<Process> queue = new LinkedList<>();

        // Add all the processes to the queue
        for (Process process : processes) {
            queue.add(process);
        }

        // Initialize the scheduling sequence
        List<Process> schedulingSequence = new ArrayList<>();

        // Start the scheduling algorithm
        while (!queue.isEmpty()) {

            // Get the process with the shortest remaining time
            Process process = queue.poll();

            // Reduce the burst time of the process by 1
            process.burstTime--;

            // If the process is finished, add it to the scheduling sequence
            if (process.burstTime == 0) {
                schedulingSequence.add(process);
            } else {

                // Otherwise, add it back to the queue
                queue.add(process);
            }
        }

        // Print the scheduling sequence
        for (Process process : schedulingSequence) {
            System.out.println(process.id);
        }
    }
}

class Process {

    int id;
    int burstTime;

    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
    }
}



/*  OUTPUT */
/*
0
1
2
 */


