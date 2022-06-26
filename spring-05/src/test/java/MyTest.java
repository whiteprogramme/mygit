import com.kuang.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) Context.getBean("people");
        people.getCat().shut();
        people.getDog().shut();
    }
    
}
