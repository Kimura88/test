package tsd;

public class Sample8_1 {
	public static void main(String[] args) {
		String ext = "From external class";
		//外部クラスのインスタンス化
		MyTopLevel mt = new MyTopLevel();
		//外部クラスのメソッド呼び出し
		mt.createNested();
		//外部クラスが持つネストクラスのインスタンス化
		MyTopLevel.MyInner inner = new MyTopLevel().new MyInner();

		inner.accesInner(ext);
	}
}

class MyTopLevel{
	private String top = "From Top level class";
	MyInner minn = new MyInner();

	public void createNested(){

		minn.accesInner(top);
	}
	class MyInner{
		public void accesInner(String st) {
			System.out.println(st);
		}
	}
}