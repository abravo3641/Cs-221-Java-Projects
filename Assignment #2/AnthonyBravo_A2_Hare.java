public class AnthonyBravo_A2_Hare {
    private int position;
    private int numOfSquares;


    public AnthonyBravo_A2_Hare(int numOfSquares) {
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
    public void sleep() {
        position += 0; //No movement
    }

    public void bigHop() {
        position += 9;
    }

    public void bigSlip() {
        int new_position = position - 12;
        position = (new_position<=0)? 1:new_position;
    }

    public void smallHop() {
        position += 1;
    }

    public void smallSlip() {
        int new_position = position - 2;
        position = (new_position<=0)? 1:new_position;
    }

    public void nexMove(int hare_num) {
        if(hare_num >=1 && hare_num <=2)
            sleep();
        else if(hare_num >= 3 && hare_num <= 4)
            bigHop();
        else if(hare_num == 5)
            bigSlip();
        else if(hare_num >= 6 && hare_num <= 8)
            smallHop();
        else
            smallSlip();
    }

    boolean isWinner() {
        return (position>=numOfSquares);
    }
}
