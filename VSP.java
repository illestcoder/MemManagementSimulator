public class VSP {
    // Memory cells: 0 = free, 1 = occupied
    int[] mem;
    int fit;

    public VSP(int SIZE, int fit) {
        // implementing memory as a fixed array
        this.mem = new int[SIZE];
        MemoryManager.incClock();
        this.fit = fit;
        MemoryManager.incClock();
    }

    public void fFit() {
        int counter = 0;
        int req = MemoryManager.que.peek().memREQ;
        for(int i=0; i<mem.length; i++) {
            if(mem[i] == 0);

        }
    }

    public void bFit() {

    }

    public void wFit() {

    }

    public void checkAvailablity() {

    }
}
