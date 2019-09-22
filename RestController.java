public class RestController {
    private static RestController instance;
    private CustomerDao customerDao;

    public Customer getCustomer(String id){
        return customerDao.getCustomer(id);
    }

    private RestController(String sqlServerUrl) {
        this.customerDao =  CustomerDao.getInstance(sqlServerUrl);
    }

    public static RestController getInstance(String sqlServerUrl){
        if (instance == null){
            instance = new RestController(sqlServerUrl);
        }
        return instance;
    }
}
