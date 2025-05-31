public class Main {
    public static void main(String[] args) {
        RequestCreator low = new LowPriorityConcreteCreator();
        low.processRequest();
        System.out.println(low);

        RequestCreator mid = new MidPriorityConcreteCreator();
        mid.processRequest();
        System.out.println(mid);

        RequestCreator high = new HighPriorityConcreteCreator();
        high.processRequest();
        System.out.println(high);
    }
}
