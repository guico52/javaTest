package train2;

public class Day extends CalendarUnit {

    private Month month;

    public Day(int day, Month month){
        setDay(day, month);
    }

    public void setDay(int day, Month month){
        setCurrentPos(day);
        this.month = month;
        if(!this.isValid()){
            throw new IllegalArgumentException("Not a valid day");
        }
    }

    public int getDay(){
        return currentPos;
    }

    public boolean increment(){
        currentPos++;
        return currentPos <= month.getMonthSize();
    }

    public boolean isValid(){
        return month != null && month.isValid() && this.currentPos >=1 && this.currentPos <= month.getMonthSize();
    }

    public boolean equals(Object o){
        return o instanceof Day && ((Day) o).currentPos == this.currentPos && ((Day) o).month.equals(this.month);
    }
}
