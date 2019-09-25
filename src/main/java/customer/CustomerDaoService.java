package customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerDaoService {

    public Customer getCustomer(String id) {
        return new Customer("my-id","My Name");
    }

}
