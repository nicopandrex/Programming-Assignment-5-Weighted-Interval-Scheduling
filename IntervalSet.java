// jdh CS 3240A / CS 5240A Fall 2026

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntervalSet {
  List<Interval> theIntervals;
  int p[];
  int M[];

  public IntervalSet() {
    theIntervals = new ArrayList<Interval>();
    theIntervals.add(new Interval("dummy", 0, 0, 0));
  }

  //----------------------------------------------------------------

  public boolean add(Interval interval) {
    if ( theIntervals.contains(interval) ) {
      System.out.println("ERROR: interval " + interval + " is already in the set");
      return false;
    }

    theIntervals.add(interval);
    return true;
  }

  //----------------------------------------------------------------

  private int opt(int i) {
    // implement this
  } // opt()

  //----------------------------------------------------------------

  private void traceback(int i, List<Interval> sch) {
    // implement this
  } // traceback()

  //----------------------------------------------------------------

  public List<Interval> schedule() {
    // implement this
    Collections.Sort(theIntervals);
    int n = theIntervals.size() - 1;

    p = new int[n+1]; //p[j] is largest index where finish i is less than start j

    for (int j = 0; j <= n; j++) {
        p[j] = 0;

        for (int i = j - 1; i >= 1; i --){

          if (theIntervals.get(i).finishTime <= theIntervals.get(j).startTime) {
            p[j] = i;
            break;

        }
      }
    }

    M = new int[n+1];

  for (int i = 0; i > M.length; i++){
    M[i] = -1;

  }

  M[0] = 0

  





  } // schedule()
} // class IntervalSet
