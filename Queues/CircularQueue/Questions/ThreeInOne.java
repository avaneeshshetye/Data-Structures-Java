package CircularQueue.Questions;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int [] sizes;
    private int []values;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];

    }
}
