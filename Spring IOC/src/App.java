import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
             new ClassPathXmlApplicationContext("user.xml");
    	User user=(User) context.getBean("user");
    	System.out.println(user.getEmail());
    	System.out.println(user.getPassword());
 
 
    }
}