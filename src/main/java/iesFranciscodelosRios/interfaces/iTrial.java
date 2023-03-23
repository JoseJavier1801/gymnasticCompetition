package iesFranciscodelosRios.interfaces;
import iesFranciscodelosRios.model.Competition;
import iesFranciscodelosRios.model.Participation;

import java.util.ArrayList;

public interface iTrial {
    ArrayList<ArrayList<Participation>> getWinner();
    boolean addParticipant(Competition c,Participation b);
    boolean score(Integer dorsal,int points);
    Participation searchParticipant(Integer dorsal);
}
