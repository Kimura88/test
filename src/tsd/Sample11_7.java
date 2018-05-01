package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal{
	Animal(){
		System.out.println("Animal()");
	}
}

class Dog extends Animal implements Serializable{
	Dog(){
		System.out.println("Dog()");
	}
}

class Bulldog extends Dog{}

class Sample11_7 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Bulldog obj = new Bulldog();

		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("----- シリアライズ完了");

			fis = new FileInputStream(new File("dog.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog readObj = (Bulldog)ois.readObject();
			System.out.println("----- デシリアライズ完了");

		}catch(ClassNotFoundException e) {
			System.out.println("クラスファイルがありません");
		}catch(FileNotFoundException e) {
			System.out.println("ファイルがありません");
		}catch(IOException e) {
			System.out.println("IO Error");
		}finally {
			try {
			oos.close();
			ois.close();
		}catch(IOException e) {

		}
		}

		
		
	}
}
