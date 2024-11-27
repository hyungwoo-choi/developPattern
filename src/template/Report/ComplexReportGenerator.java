package template.Report;

import java.util.List;

public class ComplexReportGenerator extends RepoertGenerator{
    protected boolean customerReportCondition(Customer customer){
        return customer.getPoint()>=100;
    }
    protected String getReportHeader(List<Customer> customers){
        return String.format("고객수 : %d 명 입니다.", customers.size());
    }
    protected String getReportForCustomer(Customer customers){
        return String.format("%d %s \n", customers.getName(), customers.getPoint());
    }
    protected String getReportFooter(List<Customer> customers){
        int totalPoint = 0;

        for (Customer customer :
                customers) {
            totalPoint += customer.getPoint();
        }
        return String.format("%d", totalPoint);
    }
}
