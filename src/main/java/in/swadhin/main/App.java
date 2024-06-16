package in.swadhin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.swadhin.bean.student;

public class App 
{
    public static void main( String[] args )
    {
    	String path="/in/swadhin/resources/web.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);
        student std=context.getBean(student.class);
        std.display();
    }
}
