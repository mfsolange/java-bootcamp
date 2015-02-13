package Wrapper;

import java.util.ArrayList;
import java.util.List;

public class WordWrapper {
	
	private final int rowLenght;

	public WordWrapper(int rowLenght) {
		this.rowLenght = rowLenght;
	}

	public List<String> wrap(String sentence) {
		String[] words = sentence.split(" ");
		List<String> groups = new ArrayList<String>();
		String currentString = words[0];

		for(int i = 1; i < words.length; i++){
			if((currentString.length() + words[i].length() + 1) < rowLenght){
				currentString += " " + words[1];
			}
			else{
				if(currentString.length() > rowLenght){
					List<String> splittedWord = splitWord(currentString);
					groups.addAll(splittedWord);
				}
				else{
					groups.add(currentString);	
				}
				currentString = words[i];
			}
		}
		if(currentString.length() > rowLenght){
			List<String> splittedWord = splitWord(currentString);
			groups.addAll(splittedWord);
		}
		else
			groups.add(currentString);

		return groups;
	}
	
	private List<String> splitWord(String word){
		List<String> splittedWord = new ArrayList<String>();
		int i;
		for(i = 0; i < (word.length()-rowLenght); i += rowLenght){
			splittedWord.add(word.substring(i, i+rowLenght));
		}
		splittedWord.add(word.substring(i));
		return splittedWord;
	}

}
