package com.bridgelabz.hashtables.UC1;
import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
	public static void main(String[] args) {
		String sentence = "To be or not to be";
		String[] split = sentence.split(" ");
			Map<String, Integer> myMapNode = new HashMap<String, Integer>();		
	for(String print : split) {
		String word = print.toLowerCase();
			if(myMapNode.containsKey(word)) {
				int count = myMapNode.get(word);
				myMapNode.put(word, count + 1);
			}else {
				myMapNode.put(word, 1);
			}
		}		
	for (Map.Entry<String, Integer> display : myMapNode.entrySet()) {
		String result = display.getKey() + ":" + display.getValue();
			System.out.println(result);
		}
	}
}