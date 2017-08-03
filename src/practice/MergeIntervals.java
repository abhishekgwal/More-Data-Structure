package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }

public class MergeIntervals {

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(intervals.size() == 0)
            return intervals;
        if(intervals.size() == 1)
            return intervals;
        
        Collections.sort(intervals, new IntervalComparator());
        
        Iterator itr=intervals.iterator();  
        while(itr.hasNext()){  
        Interval st=(Interval)itr.next();  
        System.out.println(st.start+" "+st.end+ " ");  
        }
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;
        
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        for(int i = 1; i < intervals.size(); i++){
            Interval current = intervals.get(i);
            if(current.start <= end){
                end = Math.max(current.end, end);
            }else{
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
            
        }
        
        result.add(new Interval(start, end));
        
        return result;
        }

public static void main (String[] args) throws java.lang.Exception
{
    ArrayList<Interval> x = new ArrayList<Interval>();
    Interval i1 = new Interval(1,3);
    Interval i2 = new Interval(5,9);
    Interval i3 = new Interval(1,2);
    Interval i4 = new Interval(2,6);
    Interval i5 = new Interval(11,12);

    x.add(i1);x.add(i2);x.add(i3);x.add(i4); x.add(i5);

    ArrayList<Interval> r = merge(x);

    for(Interval i : r)
    {
    	System.out.println("Final Output " +i.start+" "+i.end);
    }

	}
}


class IntervalComparator implements Comparator{
        public int compare(Object o1, Object o2){
            Interval i1 = (Interval)o1;
            Interval i2 = (Interval)o2;
            return i1.start - i2.start;
        }
}
