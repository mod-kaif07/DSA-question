import java.util.*;

public class job_sequencing_with_profit {
    static class job {
        int deadline;
        int profit;
        int id;

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }

    }

    public static void main(String[] args) {
        int job_info[][] = { { 4, 20 }, { 1, 20 }, { 1, 40 }, { 1, 30 } };
        ArrayList<job> jobs = new ArrayList<>(); // Type: This declares a variable jobs of type ArrayList<job>,
                                                 // meaning that it will hold objects of the job class.
        for (int i = 0; i < job_info.length; i++) {
            jobs.add(new job(i, job_info[i][0], job_info[i][1]));

        }
        /*
         * Object Creation:
         * new job(i, job_info[i][0], job_info[i][1]):
         * This creates a new instance of the job class. The constructor of the job
         * class is called with three parameters:i:
         * The current index, which serves as the job ID.
         * job_info[i][0]: This accesses the first element of the i-th inner array in
         * job_info, representing the deadline of the job.
         * job_info[i][1]: This accesses the second element of the i-th inner array in
         * job_info, representing the profit of the job.
         * Adding to the List: The newly created job object is added to the jobs
         * ArrayList using the add() method
         */
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        // sequence printing
        System.out.println("max jobs =" + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println("work id :- "+seq.get(i) );
        }
        System.out.println();

    }
}
