package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {3,4,6,1,8,5,2,9,3,6,1,2,8,5,2};
        String [] data2 = {"María","Pepe","María","Pedro","Juan","Paco","Facundo","Pepe"};
        Histogram meta_histogram = new Histogram(data2);
        Map <Integer,Integer> histogram = meta_histogram.getHistogram();
 
        Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext())
        {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ",  value = " + entry.getValue());
        }
    }
    
}
