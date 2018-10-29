
public class AnthonyBravo_A2_Tortoise {
    private int position;
    private int numOfSquares;

    public AnthonyBravo_A2_Tortoise(int numOfSquares) {
        position = 1;
        this.numOfSquares = numOfSquares;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    //Move types
    public void fastPlod() {
        position += 3;
    }

    public void slowPlod() {
        position += 1;
    }

    public void slip() {
        int new_position = position - 6;
        position = (new_position<=0)? 1:new_position;
    }

    public void nexMove(int tortoise_num) {
        if(tortoise_num >= 1 && tortoise_num <= 5)
            fastPlod();
        else if(tortoise_num >= 6 && tortoise_num <= 7)
            slip();
        else
            slowPlod();
    }

    boolean isWinner() {
        return (position>=numOfSquares);
    }
}
