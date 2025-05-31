public abstract class RequestCreator {
    protected RequestProduct request;

    public abstract RequestProduct createRequest();

    public void processRequest() {
        request = createRequest();
        request.processRequest();
    }

    @Override
    public String toString() {
        if (request == null) return "No request created.";
        return "Priority: " + request.getPriority() +
               ", Status: " + request.getStatus() +
               ", Expire Day: " + request.getExpireDay();
    }
}
