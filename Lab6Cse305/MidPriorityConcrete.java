import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    @Override
    public void setPriority() {
        priority = "Medium";
    }

    @Override
    public void setStatus() {
        status = "Accepted";
    }

    @Override
    public void setExpire() {
        expireDay = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request accept, estimated completion date is " + expireDay);
    }

    @Override
    public String getPriority() {
        return priority;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getExpireDay() {
        return expireDay;
    }
}
