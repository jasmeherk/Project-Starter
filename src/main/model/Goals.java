package model;
//Stores users goals

public class Goals {
    static final int hydrationGoal = 2300; // Since it is between 2200-2400 the average is taken (2300)
    double desiredWeight;
    int desiredSleep;
    int desiredGymRigour;

    public Goals(double desiredWeight, int desiredSleep, int desiredGymRigour) {
        this.desiredWeight = desiredWeight;
        this.desiredSleep = desiredSleep;
        this.desiredGymRigour = desiredGymRigour;
    }

    public double getDesiredWeight() {
        return desiredWeight;
    }

    public int getDesiredGymRigour() {
        return desiredGymRigour;
    }

    public int getDesiredSleep() {
        return desiredSleep;
    }

    public static int getHydrationGoal() {
        return hydrationGoal;
    }
}
