import com.tw.test.Property;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class propertyTest {
    @Test
    public void should_return_psw_when_create_success() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dom.xml");
        Property provider  = context.getBean("providerName", Property.class);
        assertThat(provider.getUsername(), is("computer"));
    }
}
