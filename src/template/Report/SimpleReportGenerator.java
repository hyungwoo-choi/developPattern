package template.Report;

import java.util.List;

public class SimpleReportGenerator extends RepoertGenerator{
    protected boolean customerReportCondition(Customer customer){
        return true;
    }
    protected String getReportHeader(List<Customer> customers){
        return String.format("고객수 : %d \n", customers.size());
    }
    protected String getReportForCustomer(Customer customers){
        return String.format("%d : %d \n", customers.getName(), customers.getPoint());
    }
    protected String getReportFooter(List<Customer> customers){
        return "";
    }
}
