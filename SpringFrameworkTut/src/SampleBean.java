
public class SampleBean {
	
	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}
	
	public void readDemoBean( ) {
		System.out.println("INside SampleBean Bean method");
		System.out.println(db);
		db.m1();
	}

}
