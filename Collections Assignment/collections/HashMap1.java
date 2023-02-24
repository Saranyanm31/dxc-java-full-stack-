package collections;
import java.util.*;

public class HashMap1 {
	public static List<String> sortSales(Map<String, Integer> sales) {
		List<Map.Entry<String, Integer>> sortedSales = new ArrayList<>(sales.entrySet());
        Collections.sort(sortedSales, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });
        List<String> sortedNames = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedSales) {
            sortedNames.add(entry.getKey());
        }
        return sortedNames;
    }

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}



