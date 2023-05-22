package HomeWorkGB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HomeWork006 {
    public static void main(String[] args) {
        listNotebooks(10);
        for (Notebook notebook : listNotebooks(10)) {
            System.out.println(notebook);
        }
    }

    public static Notebook createNotebook() {
        Random r = new Random();
        
        List<Integer> listRam = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32, 64, 128));
        List<Integer> listHdd = new ArrayList<>(Arrays.asList(100, 200, 500, 1000, 2000));
        List<String> listSystem = new ArrayList<>(Arrays.asList("MacOS", "Windows", "Linux"));
        List<String> listVideo = new ArrayList<>(Arrays.asList("Nvidia", "Radeon"));
        List<String> listProc = new ArrayList<>(Arrays.asList("Intel", "Amd"));
        List<Float> listRate = new ArrayList<>(Arrays.asList(2.0f, 2.4f, 3.2f, 3.6f, 4.0f, 4.8f, 5.0f));
        
        int ram = listRam.get(r.nextInt(listRam.size()));
        int hdd = listHdd.get(r.nextInt(listHdd.size()));
        String system = listSystem.get(r.nextInt(listSystem.size()));
        String videocard = listVideo.get(r.nextInt(listVideo.size()));
        String proc = listProc.get(r.nextInt(listProc.size()));
        float rate = listRate.get(r.nextInt(listRate.size()));

        return new Notebook(ram, hdd, system, videocard, proc, rate);
    }

    public static List<Notebook> listNotebooks(int count) {
        List<Notebook> listNotebooks = new ArrayList<>();

        while(count>0){
            listNotebooks.add(createNotebook());
            count--;
        }

        return listNotebooks;
    }
}
