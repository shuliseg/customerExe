package customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestControllerService {

    @Autowired
    private CustomerDaoService customerDao;

    public Customer getCustomer(String id){
        return customerDao.getCustomer(id);
    }

}
