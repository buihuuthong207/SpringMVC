import dungSi.*;
import nhiemVu.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
	            new ClassPathXmlApplicationContext("DungSi.xml");
	        DungSi dungsi = (DungSi) context.getBean("dungsi");
	        DungSi dungsi1 = (DungSi) context.getBean("dungsi1");
	        dungsi1.thucHienNV();
	        dungsi.thucHienNV();
	        context.close();
	}

}
