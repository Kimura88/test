package tsd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {
		System.out.println("CryptEncode(暗号化)");
		System.out.println("------------------------");

		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名 : ");
		String str1 = scn.nextLine();

		File outputFile = new File("C:\\output\\" + str1);//("C:\output", str1)
		System.out.print("データ : ");
		String str2 = scn.nextLine();
		
		System.out.println(".............");
		System.out.println("暗号化が終わりました。");

		FileOutputStream out = null;

		try {
			out = new FileOutputStream(outputFile);

			for(int i = 0; i < str2.length(); i++) {
				int c = str2.charAt(i) + 1;
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out != null) {
					out.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
