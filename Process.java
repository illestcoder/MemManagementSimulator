import java.util.Random;

public class Process {
    int id;
    int lifetime;
    int memREQ;
    int arrivalTime;

    public Process(int id, int lifetime) {
        Random r = new Random();
        this.id = id;
        this.lifetime = lifetime;
        this.memREQ = (r.nextInt(10)+1)*1000;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
}
