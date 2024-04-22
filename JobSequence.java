import java.util.ArrayList;
import java.util.Collections;

class Job{
    char id;
    int profit;
    int deadline;
    Job(char id, int profit,int deadline){
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

public  class JobSequence{

    public static void jobsequencing(ArrayList<Job> Jobs){
        Collections.sort(Jobs,(a,b) -> b.profit - a.profit);
        
        int maxDeadline = 0;
        for(Job job : Jobs){
            if(job.deadline > maxDeadline){
                maxDeadline = job.deadline;
            }
        }

        char [] sequence = new char[maxDeadline];

        for(int i=0;i<maxDeadline;i++){
            sequence[i] = ' ';
        }

        for(Job job : Jobs){
            for(int i=job.deadline - 1;i >= 0; i--){
                if(sequence[i] == ' '){
                    sequence[i] = job.id;
                    break;
                }
            }
        }

        for(char id : sequence){
            if(id != ' '){
                System.out.print(id + " ");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Job> Jobs = new ArrayList<>();

        Jobs.add(new Job('J', 60, 2));
        Jobs.add(new Job('A', 100, 1));
        Jobs.add(new Job('B', 20, 3));
        Jobs.add(new Job('C', 40, 2));
        jobsequencing(Jobs);
        
    }
}