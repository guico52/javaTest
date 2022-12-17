package train2;

public class Year extends CalendarUnit {

    public Year(int currentPos) {
        setYear(currentPos);
    }

    public void setYear(int year){
        setCurrentPos(year);
        if(!this.isValid()){
            throw new IllegalArgumentException("Not a valid month");
        }
    }

    public int getYear(){
        return currentPos;
    }

    @Override
    public boolean increment() {
        currentPos++;
        if(currentPos == 0){
            currentPos = 1;
        }
        return true;
    }

    public boolean isLeap(){
        return (currentPos % 4 == 0 && currentPos % 100 != 0) || currentPos % 400 == 0;
    }



    @Override
    protected boolean isValid() {
        return this.currentPos != 0;
    }

    public boolean equals(Object o){
        return  o instanceof Year && this.currentPos == ((Year) o).currentPos;
    }
}
