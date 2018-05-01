package question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sam11_6 {

	public static void main(String[] args) {
		File inputFile = new File("C:\\ocjp\\hogehoge.txt");
		File outputFile = new File("C:\\ocjp\\hogehogecopy.txt");
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new PrintWriter(new FileWriter(outputFile));

			String line;
			while((line = in.readLine())!= null) {
				out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
