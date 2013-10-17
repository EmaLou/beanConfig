import com.tw.test.Client;
import com.tw.test.UserAccount;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class SpringConfigureTest {
    @Test
    public void should_return_psw_when_create_success() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserAccount provider = context.getBean("providerName", UserAccount.class);
        assertThat(provider.getUsername(), is("computer"));
    }

    @Test
    public void should_config_without_set_method() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserAccount provider = context.getBean("providerName", UserAccount.class);
        assertThat(provider.getUsername(), is("computer"));
    }

    @Test
    public void should_config_with_constructor_method() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Client client = context.getBean("clientComputer",Client.class);
        assertThat(client.getUserId(), is("1"));
    }

    @Test
    public void test_user_mock() throws Exception {
        UserAccount provider = mock(UserAccount.class);
        provider.getUsername();
        verify(provider).getUsername();
    }

}
