package application;


interface Mobile{
	void show();
}
//class MyMobile implements Mobile{
//	public void show() {
//		System.out.println("Hello");
//	}
//}
//public class AnonymousInnerClass{ 
//	public static void main(String[] args) {
//		Mobile mobile=new MyMobile();
//		mobile.show();
//	}
//}

public class AnonymousInnerClass{ 
	public static void main(String[] args) {
		Mobile mobile=new Mobile() {
			public void show() {
				System.out.println("Hello");
			}
		};
		mobile.show();
	}
}


