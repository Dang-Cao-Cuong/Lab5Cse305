public interface RequestProduct {
    void setPriority();
    void setStatus();
    void setExpire();
    void processRequest();

    String getPriority();
    String getStatus();
    String getExpireDay();
}
