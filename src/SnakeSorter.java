/*
Class to help sort the snakes in the generation
So that we can delete snakes from memory
 */
public class SnakeSorter implements Comparable {
    int genNum;
    int genID;
    double score;
    public SnakeSorter(int gN, int gI, double s){
        genNum = gN;
        genID = gI;
        score = s;
    }

    public SnakeSorter(GameEngineVariableTickRate in){
        genNum = in.genNum;
        genID = in.genID;
        score = in.scoreTracker.getFitness();
    }

    @Override
    public int compareTo(Object o) {
        if(this.score < ((SnakeSorter)o).score)
            return 1;
        else if(this.score > ((SnakeSorter)o).score)
            return -1;
        else
            return 0;
    }

    public String toString(){
        return String.format("Snek #%d: score = %f", genID, score);
    }
}