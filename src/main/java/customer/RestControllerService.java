package customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestControllerService {

    private final CustomerDaoService customerDao;

    public RestControllerService( @Autowired CustomerDaoService customerDao) {
        this.customerDao = customerDao;
    }


    public Customer getCustomer(String id){
        return customerDao.getCustomer(id);
    }

}
