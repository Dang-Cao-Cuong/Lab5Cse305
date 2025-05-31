public class Main {
    public static void main(String[] args) {
        RequestCreator low = new LowPriorityConcreteCreator();
        low.processRequest();

        RequestCreator mid = new MidPriorityConcreteCreator();
        mid.processRequest();

        RequestCreator high = new HighPriorityConcreteCreator();
        high.processRequest();
    }
}
