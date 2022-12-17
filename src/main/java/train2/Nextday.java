package train2;

public class Nextday {

    public static Date nextDay(Date d){
        Date nextDay = new Date(d.getMonth().getMonth(), d.getDay().getDay(), d.getYear().getYear());
        nextDay.increment();
        return nextDay;
    }
}
