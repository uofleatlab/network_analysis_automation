package sample;

import java.io.*;
import java.util.*;

public class TextFileManager {

    public void writeTextFile(Main mainRef, String path) {

        try (PrintWriter writer = new PrintWriter(new File(path))) {

            StringBuilder sb = new StringBuilder();

            SortedSet<String> keys = mainRef.getKeys();

            List<Map<String, String>> maps = mainRef.getMaps();

            for(String str : keys){
                sb.append(str);
                sb.append(",");
            }

            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");

            for(Map<String, String> map : maps){
                String line = mainRef.getLineFromMap(map, keys);
                line = line.replace("[", "");
                line = line.replace("]", "");
                sb.append(line);
            }

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException ee) {
            System.out.println(ee.getMessage());
        }
    }


    public List<String> readTextFile(String path) {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        System.out.println(records.get(1).get(0));
        System.out.println(records.get(2).get(0));
        System.out.println(records.get(3).get(0));

        List<String> newList = new ArrayList<>();

        newList.add(records.get(1).get(0));
        newList.add(records.get(2).get(0));
        newList.add(records.get(3).get(0));

        return newList;

    }

}
