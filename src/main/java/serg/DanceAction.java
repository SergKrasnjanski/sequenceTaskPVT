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
    
    public void start(){
        int numbers[] = getDanceSequence().sequence();
        if(numbers==null){
            return;
        }
        int length = numbers.length;
        int index = 0;
        int count = 0;
        
        while(currentCoordinates!=0 && count<1000){
            
            if(numbers[index]%2==0){
                if(numbers[index]==0){
                    steps = steps + (currentCoordinates-1);
                    currentCoordinates = 0;
                    continue;
                }
                if((currentCoordinates+numbers[index])>length){
                    steps = steps + (currentCoordinates-1);
                    currentCoordinates = 0;
                    continue;
                }
                steps = steps + numbers[index];
                currentCoordinates = currentCoordinates + numbers[index];
                index = index + numbers[index];
            }
            
            if(numbers[index]%2!=0){
                if((currentCoordinates-numbers[index])<1){
                    steps = steps + (currentCoordinates-1);
                    currentCoordinates = 0;
                    continue;
                }
                steps = steps + numbers[index];
                currentCoordinates = currentCoordinates - numbers[index];
                index = index - numbers[index];
            }
            count++;
            if(count==1000){
                steps = -1;
            }            
        }
        System.out.println("Steps: " + getSteps());
    }
}
