package cc.xpbootcamp.technique.split_temporary_variable;

public class DistantCounter {
    private double primaryForce;
    private double mass;
    private int delay;

    public DistantCounter(double primaryForce, double mass, int delay) {
        this.primaryForce = primaryForce;
        this.mass = mass;
        this.delay = delay;
    }

    double getDistanceTravelled(int time) {
        double result;
        double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;

        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            double acc = (primaryForce + secondaryTime) / mass;
            result = primaryVel * secondaryTime + 0.5 * acc * secondaryTime;
        }
        return result;
    }
}
