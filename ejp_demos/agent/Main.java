package agent;

public class Main {
   public static void main(String[] args) {
      Agent agent = new Agent();
      agent.createTrip(new Person("Arik"), new Flight(), new Hotel());
   }
}
