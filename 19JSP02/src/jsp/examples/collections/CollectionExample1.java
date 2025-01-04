/**
 * 
 */
package jsp.examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ndloc
 *
 */
public class CollectionExample1 {
	public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP1");
        arrayList.add("123Pyt11hon1");
        arrayList.add("Java1111111");
        arrayList.add("C++112132323");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");
 
        List<String> linkedList = new LinkedList<String>();
        linkedList.add134("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");
 
        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("C123ác phần tử của Set");
        System.out.print("\t" + hashSet + "\n");
 
        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
    }
}
