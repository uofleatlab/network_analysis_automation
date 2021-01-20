package sample;

import com.sun.deploy.util.StringUtils;

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
                String line = getLineFromMap(map, keys);
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

    private static <K, V extends Comparable<? super V>> List<Map.Entry<K, V>>
    findGreatest(Map<K, V> map, int n)
    {
        Comparator<? super Map.Entry<K, V>> comparator = new Comparator<Map.Entry<K, V>>()
        {
            @Override
            public int compare(Map.Entry<K, V> e0, Map.Entry<K, V> e1)
            {
                V v0 = e0.getValue();
                V v1 = e1.getValue();
                return v0.compareTo(v1);
            }
        };
        PriorityQueue<Map.Entry<K, V>> highest =
                new PriorityQueue<Map.Entry<K,V>>(n, comparator);
        for (Map.Entry<K, V> entry : map.entrySet())
        {
            highest.offer(entry);
            while (highest.size() > n)
            {
                highest.poll();
            }
        }

        List<Map.Entry<K, V>> result = new ArrayList<Map.Entry<K,V>>();
        while (highest.size() > 0)
        {
            result.add(highest.poll());
        }
        return result;
    }



    public static String getLineFromMap(Map<String, String> someMap, SortedSet<String> keys) {
        List<String> values = new ArrayList<>();
        for (String key : keys) {
            values.add(someMap.get(key) == null ? " " : someMap.get(key));
        }
        return StringUtils.join(Arrays.asList(new List[]{values}), ",");
    }


}
