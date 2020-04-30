import java.io.*;
import java.util.*;

public class MemoryManager {
    int SIZE;
    int policy;
    int fit;
    static int clock = 0;
    static Queue<Process> que = new LinkedList<>();

    public MemoryManager() throws IOException {
        startMM();
        if(policy == 1) {
            // run VSP class
            inFile();
            incClock();
            printQue();
        } else if(policy == 2) {
            // run PAG class
            inFile();
        } else {
            // run SEG class
            inFile();
        }

    }

    public void startMM() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Memory size: ");
        this.SIZE = sc.nextInt();

        System.out.print("Memory Management Policy (1-VSP, 2-PAG, 3-SEG): " );
        this.policy = sc.nextInt();

        System.out.print("Fit algorithm (1-First-Fit, 2-Best-Fit, 3-Worst-Fit): ");
        this.fit = sc.nextInt();
    }

    /** Read in file, creates processes, and places them into queue **/
    public void inFile() throws IOException {
        File f = new File("C:\\Users\\Gary\\IdeaProjects\\CS4310_Project3\\src\\in1.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        if (f.exists()) {
            System.out.println("File Found");

            String line = null;
            int count = 0;          // ignore first line
            while((line = br.readLine()) != null) {
                if(count != 0) {
                    int id = Integer.parseInt(br.readLine());
                    int mem = Integer.parseInt(br.readLine());
                    Process p = new Process(id, mem);       // create processes with id and mem requirement
                    que.add(p);
                }
                count++;
            }
            br.close();
        }
        else
            System.out.println("File Not Found");
    }

    public void printQue() {
//        while(!que.isEmpty()) {
//            System.out.println(que.peek().id);
//            System.out.println(que.peek().lifetime);
//            System.out.println(que.remove().memREQ);
//            System.out.println();
//        }
        for (Process p : que) {
            System.out.println(p.id);
            System.out.println(p.lifetime);
            System.out.println(p.memREQ);
        }
    }

    public static int getClock() {
        return clock;
    }

    public static void incClock() {
        clock++;
    }
}
