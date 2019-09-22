public class CustomerDao {
    private static CustomerDao instance;
    private final String sqlServerUrl;


    private CustomerDao(String slqServerUrl) {
        this.sqlServerUrl = slqServerUrl;
    }

    public Customer getCustomer(String id) {
        return new Customer("my-id","My Name");
    }

    public static CustomerDao getInstance(String sqlServerUrl){
        if (instance == null){
            instance = new CustomerDao(sqlServerUrl);
        }
        return instance;
    }


}
