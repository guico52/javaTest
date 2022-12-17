package train2;

public class Month extends CalendarUnit{

    private Year year;

    private int[] sizeIndex = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Month(int month, Year year){
        setMonth(month, year);
    }

    public void setMonth(int month, Year year){
        setCurrentPos(month);
        this.year = year;
        if(!this.isValid()){
            throw new IllegalArgumentException("Not a valid month");
        }
    }

    public int getMonth(){
        return currentPos;
    }

    public int getMonthSize(){
        if(year.isLeap()){
            sizeIndex[1] = 29;
        }
        return sizeIndex[currentPos - 1];
    }


    @Override
    public boolean increment() {
        currentPos++;
        return currentPos <= 12;
    }

    @Override
    public boolean isValid() {
        return year != null && year.isValid() && this.currentPos >=1 && this.currentPos <= 12;
    }

    public boolean equals(Object o){
        return o instanceof Month && ((Month) o).currentPos == this.currentPos && ((Month) o).year.equals(this.year);
    }
}
