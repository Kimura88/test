package tsd;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Sample7_5 {
	//オーバーライド対象メソッド
	//IOExceptionをthrowしていることに注意する
	public void someMethod() throws IOException{}
}

class Sample7_5_1 extends Sample7_5{
	//スーパークラスと同じIOExceptionをthrowしているのでOK
	public void someMethod() throws IOException{}
}

class Sample7_5_2 extends Sample7_5{
	//throwsをしていないのでOK
	public void someMethod() {}
}

class Sample7_5_3 extends Sample7_5{
	// EOFExceptionとFileNotFoundExceptionはIOExceptionのサブクラスであるためOK
	public void someMethod() throws EOFException,FileNotFoundException{}
}

class Sample7_5_4 extends Sample7_5{
	
	public void someMethod() throws ClassNotfoundException{}
}

class Sample7_5_5 extends Sample7_5{
	
	public void someMethod() throws Exception{}
}

class Sample7_5_6 extends Sample7_5{
	
	public void someMethod() throws IOException,ClassNotfoundException{}
}

class Sample7_5_7 extends Sample7_5{
	
	public void someMethod() throws RuntimeException{}
}