package serg;


public class DanceAction {
    private DanceSequence danceSequence;
    private int currentCoordinates;
    private int steps;

    public DanceAction() {
        danceSequence = new DanceSequence();
        currentCoordinates = 1;
        steps = 0;
    }
    

    /**
     * @return the danceSequence
     */
    public DanceSequence getDanceSequence() {
        return danceSequence;
    }

    /**
     * @param danceSequence the danceSequence to set
     */
    public void setDanceSequence(DanceSequence danceSequence) {
        this.danceSequence = danceSequence;
    }

    /**
     * @return the currentCoordinates
     */
    public int getCurrentCoordinates() {
        return currentCoordinates;
    }

    /**
     * @param currentCoordinates the currentCoordinates to set
     */
    public void setCurrentCoordinates(int currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    /**
     * @return the steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }

}
