package rachelmiller.inclassassignment05_rachelm;

import java.io.Serializable;

/**
 * Created by rachelmiller on 2/27/17.
 */

public class Planet implements Serializable {
    private String name;
    private int distance;
    private String comments;
    private boolean canWeLive;

    public Planet(String name, int distance, boolean canWeLive, String comments) {
        this.name = name;
        this.distance = distance;
        this.comments = comments;
        this.canWeLive = canWeLive;
    }


    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isCanWeLive() {
        return canWeLive;
    }

    public String getComments() {
        return comments;
    }
}

