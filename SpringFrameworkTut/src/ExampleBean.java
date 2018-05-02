
public class ExampleBean {
	
	private DemoBean db;
	
	
	public void setDb(DemoBean db) {
		this.db = db;
	}


	public void readDemoBean() {
		System.out.println("INside Example Bean method");
		System.out.println(db);
		db.m1();
		
	}
}