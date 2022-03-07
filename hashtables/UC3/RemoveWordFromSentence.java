package com.bridgelabz.hashtables.UC3;

public class RemoveWordFromSentence {
	public static void main(String[] args) {
		String str = "Paranoids are not paranoid because \r\n"
				+ "they are paranoid but because \r\n"
				+ "they keep putting themselves deliberately \r\n"
				+ "into paranoid avoidable situations";
		String word = "avoidable";
		removeWord(str, word);
		}
	public static void removeWord(String str, String word) {
		String split[] = str.split(" ");							//Split sentence
		String s = "";
	for (String words : split) {
		if (!words.equals(word)){								//Check word is found or not
			s += words + " "; 									//Concate the word not equal to the given word
			}
		}
		System.out.print(s);
	}
}