/*
 * Copied from 8.1 Time1.java
Time class declaration maintains the time in 24 -hour format
 */
package project.pkg4;

/**
 *
 * @author Nikkita Hirayama
 */
public class Time1 {
    private int hour;//0-23
    private int minute;//0-59
    private int second;//0-59
    
    Time1(int hour, int minute, int second)
    {
        setTime(hour, minute, second);
    }
    //set a new time value using universal time; throw an exception if the 
    //hour, minute or second is invalid
    public void setTime(int hour, int minute, int second)
    {
        
        //validate hour, minute, and second
        if (hour <0 || hour >= 24 || minute <0 ||minute >= 60 ||
                   second<0 || second>=60)
        {
            throw new IllegalArgumentException("hour minute and/or second was out of range");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //getter methods
    int getHour()
    {
        return hour;
    }
    int getMinute()
    {
        return minute;
    }
    int getSecond()
    {
        return second;
    }
    
    //convert to String in universal-tme format (HH::MM::SS)
    public String toUniversalString()
    {
        return String.format("%02d%02d:%02d", hour, minute, second);
    }
    
    //convert to String in standard-time format(H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%02d:%02d:%02d %s", 
                ((hour == 0 || hour == 12)? 12: hour % 12), minute, second, (hour < 12 ?"AM" : "PM"));

    }
    
}//end class Time1
