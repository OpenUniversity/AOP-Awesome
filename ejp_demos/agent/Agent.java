package agent;

public class Agent {
  CardProcessor cc = new CardProcessor();

  public void createTrip(Person p, Flight f, Hotel h) {
    int level = TranConcern.defaultIsolationLevel();
    TranConcern.enterTrans(level) {
      f.reserveSeat(p);
      h.reserveRoom(p);
      cc.debit();
    };
  }
}
