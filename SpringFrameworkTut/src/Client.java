import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Client {
	
	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("NewFile.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean) o;
		wb.show();
		
		Object o1 = factory.getBean("id2");
		SampleBean sb = (SampleBean) o1;
		sb.readDemoBean();
		
		
		Object o2 = factory.getBean("id3");
		ExampleBean eb = (ExampleBean)o2;
		eb.readDemoBean();
		
		
		System.out.println("Sydne".compareTo("Melbourne"));
		
		
	}

}
