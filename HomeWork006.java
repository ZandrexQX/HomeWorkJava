package HomeWorkGB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeWork006 {
    public static void main(String[] args) {
        List<Notebook> ln = listNotebooks(10);
        printNotebook(ln);
        printNotebook(sortNotebook(ln, enterSort()));
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

    public static Notebook enterSort() {
        Scanner sc = new Scanner(System.in);
        int ram = 0;
        int hdd = 0;
        String system = "";
        String videocard = "";
        String proc = "";
        float rate = 0;
        System.out.print("Введите параметры сортировки:\n"+
                            "1: ОЗУ\n" + 
                            "2: HDD\n" + 
                            "3: Система (Windows, MacOS, Linux)\n" + 
                            "4: Видеокарта (Nvidia, Radeon)\n" + 
                            "5: Процессор(Intel, Amd)\n" + 
                            "6: Частота\n" +
                            "0: Выход из сортировки\n" + 
                            "Ввод: ");
        int enter = Integer.parseInt(sc.nextLine());
        while(enter != 0){
            switch (enter) {
                case 1:
                    System.out.print("Введите минимальное ОЗУ:");
                    ram = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Введите минимальную емкость ЖД:");
                    hdd = Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Введите операционную систему:");
                    system = sc.nextLine();
                    break;
                case 4:
                    System.out.print("Введите фирму видеокарты:");
                    videocard = sc.nextLine();
                    break;
                case 5:
                    System.out.print("Введите фирму процессора:");
                    proc = sc.nextLine();
                    break;
                case 6:
                    System.out.print("Введите минимальную частоту:");
                    rate = Float.parseFloat(sc.nextLine());
                    break;
                default:
                    break;
            }
            System.out.print("Введите параметры сортировки:\n"+
                            "1: ОЗУ\n" + 
                            "2: HDD\n" + 
                            "3: Система (Windows, MacOS, Linux)\n" + 
                            "4: Видеокарта (Nvidia, Radeon)\n" + 
                            "5: Процессор(Intel, Amd)\n" + 
                            "6: Частота\n" +
                            "0: Выход из сортировки\n" + 
                            "Ввод: ");
            enter = Integer.parseInt(sc.nextLine());
        }
        return new Notebook(ram, hdd, system, videocard, proc, rate);
    }

    public static List<Notebook> sortNotebook(List<Notebook> ln, Notebook sn) {
        List<Notebook> resultList = new ArrayList<>();
        for (Notebook notebook : ln) {
            int count = 0;
            if (notebook.getRam()>= sn.getRam()){
                count++;
            }
            if (notebook.getHdd()>= sn.getHdd()){
                count++;
            }
            if (sn.getSystem().equals("")){
                count++;
            }
            else if (notebook.getSystem().equalsIgnoreCase(sn.getSystem())){
                count++;
            }
            if (sn.getVideo().equals("")){
                count++;
            }
            else if (notebook.getVideo().equalsIgnoreCase(sn.getVideo())){
                count++;
            }
            if (sn.getProc().equals("")){
                count++;
            }
            else if (notebook.getProc().equalsIgnoreCase(sn.getProc())){
                count++;
            }
            if (notebook.getRate()>= sn.getRate()){
                count++;
            }
            if (count == 6){
                resultList.add(notebook);
            }
        }
        System.out.println("Подходит ноутбуков: " + resultList.size());
        return resultList;
    }

    public static void printNotebook(List<Notebook> ln) {
        for (Notebook notebook : ln) {
            System.out.println(notebook);
            System.out.println();
        }
    }
}