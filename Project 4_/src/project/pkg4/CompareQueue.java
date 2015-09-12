/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg4;
import java.util.Comparator;
/**
 *
 * @author Photo Editing
 */
//compare times in a Queue
public class CompareQueue implements Comparator<Time1>{
    
    CompareQueue()
    {
        
    }
    @Override
    public int compare(Time1 time1, Time1 time2)
    {
        int seconds1 = (time1.getHour() *3600) + (time1.getMinute() * 60) + time1.getSecond();
        int seconds2 = (time2.getHour()*3600)+ (time2.getMinute()*60) +time2.getSecond();
        
        if(seconds1 > seconds2)//if the first time is greater than the second return positive 
            return 1;
        if(seconds1 < seconds2)//if the first time is less than the second return a negative
            return -1;
        
        return 0;//if the times are the same return a 0
    }

   
    
    
    
}
