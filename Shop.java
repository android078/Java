import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Iterator;

public class Shop {
    public static void main(String[] args) {
        NoteBook lap1 = new NoteBook("Pavilion", 1236, "HP");
        lap1.setHDD(512);
        lap1.setOS("Windows");
        lap1.setRAM(8);

        NoteBook lap2 = new NoteBook("ABC30", 6467, "Acer");
        lap2.setHDD(1024);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        NoteBook lap3 = new NoteBook("CX90", 672201, "Dell");
        lap3.setHDD(256);
        lap3.setOS("Windows");
        lap3.setRAM(16);


        HashSet<NoteBook> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3));
        HashSet<NoteBook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print(
                "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n  или 4, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 4) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }

            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n или 4, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    NoteBook lap = (NoteBook) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    NoteBook lap = (NoteBook) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    NoteBook lap = (NoteBook) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }

        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            NoteBook lap = (NoteBook) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
    
}
