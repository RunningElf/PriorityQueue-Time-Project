/*
 Create an application that uses a "PriorityQueue" to perform the following

Creates a PriorityQueue object uses the constructor that receives a "Comparator" 
object as an argument.  A class that implements the Comparator<Time1> interface 
must be created.  An instance that implements Comparator<Time1> must be passed 
as an argument to the PriorityQueue constructor.

Stores 5 "Time1" objects using the "Time1" class shown in Fig. 8.1 on page 317. 
Displays the "Universal Time" in priority order

Note: To determine the ordering when implementing the "Comparator" interface, 
convert the time into seconds (i.e., hours * 3600 + minutes * 60 + seconds), 
smaller values infer higher priority)
 */

/*Course Number & Section: CIS5200
Assignment Designation: Project 4 
Name: Nikkita Hirayama
*/
package project.pkg4;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Project4 
{

   
    public static void main(String[] args) {
       
       
        CompareQueue compare = new CompareQueue();//create a compare object with Time1

        PriorityQueue<Time1> queue = new PriorityQueue<>(compare);//create a Priority Queue Object for time
        
        Scanner input = new Scanner(System.in);
        int hour, minute, second;
        
        for(int x = 0; x < 3; x++)//collects 5 different times from the user to input into the queue
        {
            System.out.println("Input Universal time");
            System.out.print("Hour: ");
            hour = input.nextInt();
            System.out.print("Minute: ");
            minute = input.nextInt();
            System.out.print("Second: ");
            second = input.nextInt();
            
            queue.offer(new Time1(hour, minute, second));
            System.out.println();
            
        }
        
        while(queue.size() > 0)
        {
            System.out.printf("%s%n", queue.peek().toUniversalString());//veiw the top element
            queue.poll();//remove the top element
        }
        
    }
    
}
