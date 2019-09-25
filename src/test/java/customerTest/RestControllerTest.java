package customerTest;

import customer.Customer;
import customer.CustomerDaoService;
import customer.RestControllerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class RestControllerTest {

    @Mock
    private CustomerDaoService customerDaoServiceMock;

    @InjectMocks
    private RestControllerService restControllerService;

    @Test
    public void shouldReturnCustomerById() {
        //given
        when(customerDaoServiceMock.getCustomer("my-id")).thenReturn(new Customer("my-id","my-name"));

        //when
        Customer result = restControllerService.getCustomer("my-id");

        //then
        Assert.assertEquals("my-name", result.getName());
    }



//    @Test
//    public void test1()  {
//        Customer customer = mock(Customer.class);
//
//        when(customer.getName()).thenReturn("My Name");
//        when(customer.getId()).thenReturn("my-id");
//
//        assertEquals(customer.getId(), "my-id");
//        assertEquals(customer.getName(), "My Name");
//    }
}