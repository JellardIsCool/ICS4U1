package testing;

import java.util.HashMap;

public class HashMapStuff {

	public static void main(String[] args) {

		HashMap <String, Double> bankInfo = new HashMap<String, Double>();

		bankInfo.put("Bank Account", (double) 83967236);
		bankInfo.put("SIN", (double) 2103966104);
		bankInfo.put("Weight", (double) 573966104);
		bankInfo.put("Balance", (double) 11467.97);
		bankInfo.put("Height", (double) 2.45);

		System.out.println(bankInfo);

		while(true) {

			String s = "";
			for (String i : bankInfo.keySet()) {

				if (bankInfo.get(i) < 1000000) {
					s = i;
					break;
				}
			}
			if (s.length() > 0) {
				bankInfo.remove(s);
			} else break;
		}
		System.out.println(bankInfo);
		
	}

}
