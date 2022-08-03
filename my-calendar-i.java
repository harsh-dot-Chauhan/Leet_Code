//https://leetcode.com/problems/my-calendar-i
class MyCalendar {
    List<Integer>s; 
    List<Integer> e; 

    public MyCalendar() {
        s = new ArrayList<Integer>();
        e = new ArrayList<Integer>();
    }
    
    public boolean book(int start, int end) {
        if(s.size()==0){
            s.add(start);
            e.add(end);
            return true;
        }
        else{
        for(int i=0;i<s.size();i++){
            if(s.get(i)<=start && e.get(i)>start)
                return false;
            else if(s.get(i)>start && s.get(i)<end)
                return false;    
        }
            s.add(start);
            e.add(end);
        }
        return true;
    }
}
