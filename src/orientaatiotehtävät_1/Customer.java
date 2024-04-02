package orientaatiotehtävät_1;


class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = nextId++;
        this.startTime = startTime;
        this.endTime = 0;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        if (endTime == 0) {
            return 0;
        } else {
            return endTime - startTime;
        }
    }
}
