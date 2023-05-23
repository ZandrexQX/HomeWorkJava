package HomeWorkGB;

public class Notebook {
    private int ram;
    private int hdd;
    private String system;
    private String videocard;
    private String proc;
    private float rate;

    public Notebook(int ram, int hdd, String system,
                     String videocard, String proc, float rate){
        this.ram = ram;
        this.hdd = hdd;
        this.system = system;
        this.videocard = videocard;
        this.proc = proc;
        this.rate = rate;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getSystem() {
        return system;
    }

    public String getVideo() {
        return videocard;
    }

    public String getProc() {
        return proc;
    }

    public float getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "processor: " + proc + ",\nrate: " + rate + 
                ",\nRAM: " + ram +  ",\nsystem: " + system + 
                ",\nVideo: " + videocard + ",\nHDD: " + hdd;
    }
}
