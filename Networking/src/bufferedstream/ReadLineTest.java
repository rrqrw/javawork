package bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReadLineTest {

	public static void main(String[] args) {
		//
		try {
			Reader reader = new FileReader("word.txt");
			BufferedReader br = new  BufferedReader(reader);
			String[] word = null;
		while(true) {
			String data = br.readLine();
			if(data == null)break;
			//System.out.println(data);
			word=data.split(" ");
		}
		System.out.println(Arrays.toString(word));
		//랜덤출력
		//int dice= (int)(Math.random()*6+1);
		//System.out.println(dice);
			br.close();
			//System.out.println(word.length);
			int rnd = (int)(Math.random()*word.length);
			System.out.println(rnd);
			System.out.println(word[rnd]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
