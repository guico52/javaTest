package train2;

public class Date {
    private Day day;
    private Month month;
    private Year year;

    public Date(int month, int day, int year){
        this.year = new Year(year);
        this.month = new Month(month, this.year);
        this.day = new Day(day, this.month);
    }

    public void increment(){
        if(!day.increment()){
            if(!month.increment()){
                year.increment();
                month.setMonth(1, year);
            }
            day.setDay(1, month);
        }
    }

    public void printDate(){
        System.out.println(day.getDay() + "/" + month.getMonth() + "/" + year.getYear());
    }

    public boolean equals(Object o){
        return o instanceof Date && ((Date) o).day.equals(this.day) && ((Date) o).month.equals(this.month) && ((Date) o).year.equals(this.year);
    }

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public Year getYear() {
        return year;
    }

    public String toString(){
        return month.getMonth() + "/" + day.getDay() + "/" + year.getYear();
    }
}
