package com.test.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

	private static String FILE_NAME= "C:\\Users\\Harsha\\Desktop\\Paragraph-txt.txt";
	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fileRd = null;
		Map<String, Integer> wordsMap = new HashMap<>();
		try {
			fileRd = new FileReader(FILE_NAME);
			br = new  BufferedReader(fileRd);

			String currentLine;
			int count =0;
			
			while((currentLine = br.readLine()) != null ) {
				
				String[] words = currentLine.split(" ");
				
				for(String s : words) {
					if(wordsMap.get(s) != null) {
						count = wordsMap.get(s).intValue();
					}
					wordsMap.put(s, count + 1);
				}
			}
			
			for (Map.Entry<String, Integer> map : wordsMap.entrySet()) {
				System.out.println(map.getKey() + " : " + map.getValue());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
