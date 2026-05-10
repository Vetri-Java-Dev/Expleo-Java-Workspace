package problems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class WordFrequency {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>();
		
		String fileName="src/problems/word.txt";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(fileName));
			
			String str="";
			String line;
			
			while((line=reader.readLine())!=null) {
				str+=line+" ";
			}
			
			String[] words=str.split(" ");
			
			for(String word : words) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		catch(Exception e) {
			System.out.print("Error : "+fileName+" not found");
		}
		
		TreeMap<String,Integer> sorted=new TreeMap<>();
		
		for(String word : map.keySet()) {
			sorted.put(word, map.get(word));
		}
		
		for(String word : sorted.keySet()) {
			System.out.println(word+" : "+sorted.get(word));
		}
		
		System.out.print("Unique words : "+sorted.size());
	}
}
