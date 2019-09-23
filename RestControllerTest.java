import customer.Customer;
import customer.RestControllerService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;

class RestControllerTest {

    @Autowired
    private RestControllerService restControllerService;

    @Test
    public void testAdd() {
        assertThat(restControllerService.getCustomer("5555"), is(notNullValue()));
    }

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test1()  {
        Customer customer = mock(Customer.class);

        when(customer.getName()).thenReturn("My Name");
        when(customer.getId()).thenReturn("my-id");

        assertEquals(customer.getId(), "my-id");
        assertEquals(customer.getName(), "My Name");
    }
}