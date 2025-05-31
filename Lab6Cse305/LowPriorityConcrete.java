import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    @Override
    public void setPriority() {
        priority = "Ignore";
    }

    @Override
    public void setStatus() {
        status = "Done";
    }

    @Override
    public void setExpire() {
        expireDay = LocalDate.now().toString();
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request denied");
    }
}
