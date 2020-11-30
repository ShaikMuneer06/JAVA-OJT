package day2;
import java.util.*; 
  
// An Interval 
class Interval 
{ 
    int start,end; 
      
    Interval() 
    { 
        start = 0;
        end = 0;
    } 
    Interval(int s,int e){
    	start = s;
    	end = e;
    }
} 
public class Merge_Intervals {
	    public ArrayList<Interval> merge(ArrayList<Interval> intervals){
	    	if(intervals == null || intervals.size() <= 1){
	    		return intervals;
	    	}
	    	Collections.sort(intervals, new IntervalComparator());
	    	ArrayList<Interval> result = new ArrayList<Interval>();
	    	Interval prev = intervals.get(0);
	    	for(int i = 1;i<intervals.size();i++){
	    		Interval curr = intervals.get(i);
	    		if(prev.end >= curr.start){
	    			Interval merged = new Interval(prev.start,Math.max(prev.end,curr.end));
	    		prev = merged;
	    		}
	    		else{
	    			result.add(prev);
	    			prev = curr;
	    		}
	    	}
	    	result.add(prev);
	    	return result;
	    }
	    class IntervalComparator implements Comparator<Interval>{
	    	public int compare(Interval i1,Interval i2){
	    		return i1.start - i2.start;
	    	}
	    }
	    // Driver Code 
	    public static void main(String args[]) { 
	    	Merge_Intervals d = new Merge_Intervals();
	        ArrayList<Interval> arr=new ArrayList<Interval>(); 
	        arr.add(1,3);
	        arr.add(2,6);
	        arr.add(8,10);
	        arr.add(15,18);
	        d.merge(arr);
	    } 
	} 

