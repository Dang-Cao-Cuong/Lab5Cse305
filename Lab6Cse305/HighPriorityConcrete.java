import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    @Override
    public void setPriority() {
        priority = "Emergency";
    }

    @Override
    public void setStatus() {
        status = "Accept";
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
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
