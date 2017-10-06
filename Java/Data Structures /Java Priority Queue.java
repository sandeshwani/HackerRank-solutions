/*
In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.

You have to deal with  types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending token order.
Given a sequence of  events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.

Input Format

The first line contains an integer, , denoting the total number of events. Each of the  subsequent lines will be of the following two forms:

ENTER name CGPA token - The student to be inserted into the priority queue.
SERVED - The highest priority student in the queue was served.
Constraints

Constraints


 where 
 where each token i is a unique integer.

Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(String fname, double cgpa, int id) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public String toString(){
	   return cgpa + " " + fname + " " + token;
   }
}

class cgpaComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.getCgpa()!=s2.getCgpa()){
			return s1.getCgpa()>s2.getCgpa()?-1:1;
		}
		else if(s1.getFname().compareTo(s2.getFname())!=0){
			
				return s1.getFname().compareTo(s2.getFname()) > 0 ? 1 : -1;
				
		}
		else {
			return s1.getToken() > s2.getToken() ? 1 : -1;
		}
			
		
	}
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      cgpaComparator cgpaDesc = new cgpaComparator();
      
      int totalEvents = Integer.parseInt(in.nextLine());
      /*
       If you want to sort elements in queue, we must pass integer and comparator while declaring queue.
       But in case of list it would have been different. 
       List<Student> stu = new ArrayList<Student>();
       and than we would have call Collections.sort(stu, cgpaDesc) whenever we need to sort the elements in list
       */
      Queue<Student> stu = new PriorityQueue<Student>(totalEvents, cgpaDesc);
      
      
      while(totalEvents>0){
    	  	String event = in.next();
    	  	if(event.compareToIgnoreCase("Served")==0){
    	  		//Collections.sort(stu, cgpa);
    	  		/*Error in the above line:- The method sort(List<T>, Comparator<? super T>) in the type Collections is not applicable for the arguments 
                (Queue<Student>, cgpaComparator)*/
    	  		
    	  		//stu.remove(0);
    	  		stu.poll();
    	  		//System.out.println(stu.poll().getFname());
    	  	}
    	  	else if(event.compareToIgnoreCase("Enter")==0){
    	  		
    	  	
            Student stud = new Student(in.next(), Double.parseDouble(in.next()), Integer.parseInt(in.next()) );
            stu.offer(stud);
            
            
            
          
           //System.out.println(stu);
           
    	  	}
    	  	totalEvents--;
      }
      //System.out.println(stu);
      /*Iterator itr=stu.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      } */
      if (stu.isEmpty()) {
    	  System.out.println("EMPTY");
      } else {
    		  while (!stu.isEmpty()) {
    	  System.out.println(stu.poll().getFname());
      }
    }
      
      
    
      
    }
}


