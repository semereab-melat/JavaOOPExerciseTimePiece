import java.text.DecimalFormat;

/***************************************************************
 Filename: TimePiece
 Created by: melat
 Created on: 17/11/2021
 Comment: to print a details of a watch, clock
 ***************************************************************/
public class TimePiece {

    private static DecimalFormat df = new DecimalFormat("00");
    private String timeType, readType;
    private double cost;
    private int hour, minute, second;
    private boolean canTalk;

    public TimePiece(){

    }//Default Constructor
    public TimePiece(String pTimeType, double pCost, String pReadTime, boolean hasAudio)
    {
        timeType = pTimeType;
        cost = pCost;
        readType = pReadTime;
        hour = 0;
        minute = 0;
        canTalk = hasAudio;
    }// alternative constructor
    public TimePiece(String pTimeType, double pCost, int pHour, int pMinute, String pReadTime, boolean hasAudio)
    {
        timeType = pTimeType;
        cost = pCost;
        readType = pReadTime;
        hour = pHour;
        minute = pMinute;
        canTalk = hasAudio;
    }// alternative constructor
    public String showTime()
    {
        return df.format(hour) + ":" + df.format(minute);
    }//showTime

    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0,000.00");
        return "Cost Price:\t\t£" +  df.format(cost) + "\nType of read out:\t\t" + readType
                + "\nCurrent \tTime:\t\t" + showTime() ;

    }//toString()
    public void canTalk()
    {
        if(canTalk)
        {
            System.out.println("This time piece can talk");
        }//if
        else
            System.out.println("This time piece cannot talk");
    }//canTalk

    public void setMinutes(int minutes)
    {
        minute = minutes;
    }//setminutes()

    public void setHours(int hours)
    {
        hour = hours;
    }//setHours()
    public void setTimeType(int hours, int minutes)
    {
         setHours(hours);
         setMinutes(minutes);
    }//setTime
    public int hourTime(int pHour){
        return hour;
    }

    public int minuteTime(int pMinute){
        return minute;
    }

    public void updateTime(int addedHours, int addedeMinutes) {
        final int MINUTES = 60, DAYHOUR = 24;
        int totalMinute, totalHour;
        totalMinute = addedeMinutes + minute;
        totalMinute = totalMinute % MINUTES;
        totalHour = hour + addedHours + totalMinute / MINUTES;
        totalHour = addedHours % DAYHOUR;
        System.out.println("Updated Time: " + df.format(totalHour) + ":" + df.format(totalMinute));
    }//updateTime()

}//class
