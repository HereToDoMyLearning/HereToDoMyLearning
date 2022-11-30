package oneone;
//HereToDoMyLearning CallByRef
public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] testFeld = new int [10];
		getInit(testFeld);
		// Ein Beispiel für "Call By Reference" -> nicht wirklich, aber funktioniert :)
		CallByRef meinObjekt = new CallByRef();
		
		meinObjekt.getInit(testFeld);
		for (int i = 0; i<testFeld.length; i++) {
			System.out.println(testFeld[i]);
		}
		System.out.println(testFeld);
		

	}
public static void getInit(int[] a) {
	for (int i = 0; i<a.length; i++){
		//wird ausgegeben, obwohl VOID!!!
		a[i] = 999;
		
	}
}
}
