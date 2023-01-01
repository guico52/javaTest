package train4;

public class NextDay {

    public String getNextDay(int year, int month, int day){
        int[][] days = {{31,28,31,30,31,30,31,31,30,31,30,31},
                        {31,29,31,30,31,30,31,31,30,31,30,31}};
        //index=0:平年，index=1:闰年
        int index = 0;
        if(year % 4 == 0 || year % 400 == 0 || year % 100 != 0){
            index = 1;
        }

        //判断输入日期是否正确
        if(month<1 || month>12 || day<1 || day>days[index][month-1])
            return "输入日期不正确";
        //小于当前月份的天数
        if(day < days[index][month-1])
            day++;
        else
        {
            if(month==12)
            {
                year++;
                month=1;
            }
            else
            {
                month++;
                day=1;
            }
        }
        return year + "-" + month + "-" + day;

    }
}
