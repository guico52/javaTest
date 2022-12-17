package train2;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Assert;
import org.junit.Test;
import train2.Date;
import train2.Nextday;


public class NextdayTest {

    // 有效
    @Test
    public void testDate01() {
        Date date = new Date(2,29,2016);
        Date d = Nextday.nextDay(date);
        String result = d.toString();
        Assert.assertEquals("3/1/2016",result);

    }
    @Test
    public void testDate02() {
        Date date = new Date(2,28,2017);
        Nextday n = new Nextday();
        Date d = Nextday.nextDay(date);
        String result = d.toString();
        Assert.assertEquals("3/1/2017",result);

    }
    @Test
    public void testDate03() {
        Date date = new Date(1,31,2017);
        Nextday n = new Nextday();
        Date d = Nextday.nextDay(date);
        String result = d.toString();
        Assert.assertEquals("2/1/2017",result);
    }
    @Test
    public void testDate04() {
        Date date = new Date(4,30,2017);
        Nextday n = new Nextday();
        Date d = Nextday.nextDay(date);
        String result = d.toString();
        Assert.assertEquals("5/1/2017",result);
    }

    @Test
    public void testDate05(){
        try{
            Date date = new Date(-1,1,1901);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid month"));

        }
    }
    @Test
    public void testDate06(){
        try{
            Date date = new Date(13,1,1901);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid month"));

        }
    }
    @Test
    public void testDate07(){
        try{
            Date date = new Date(1,-1,1901);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate08(){
        try{
            Date date = new Date(2,30,2016);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate09(){
        try{
            Date date = new Date(2,29,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate10(){
        try{
            Date date = new Date(3,32,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate11(){
        try{
            Date date = new Date(4,31,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate12(){
        try{
            Date date = new Date(4,32,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate13(){
        try{
            Date date = new Date(4,32,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate14(){
        try{
            Date date = new Date(0,3,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid month"));
        }
    }
    @Test
    public void testDate15(){
        try{
            Date date = new Date(4,0,2017);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate16(){
        try{
            Date date = new Date(4,3,0);
            Nextday n = new Nextday();
            Date d = Nextday.nextDay(date);
        }catch (IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("Not a valid month"));
        }
    }


}


