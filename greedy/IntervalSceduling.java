package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class IntervalSceduling {

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 4));
		intervals.add(new Interval(3, 6));
		intervals.add(new Interval(5, 7));
		intervals.add(new Interval(8, 10));

		List<Interval> result = sceduleIntervals(intervals);
		System.out.println("Maximal set of mutually compartible intervals:");
		for (Interval interval : result) {
			System.out.println("[" + interval.start + ", " + interval.end + "]");
		}
	}

	public static List<Interval> sceduleIntervals(List<Interval> intervals) {
		Collections.sort(intervals, Comparator.comparingInt(o -> o.end));
		List<Interval> result = new ArrayList<>();
		if (intervals.isEmpty()) {
			return result;
		}
		Interval lastInterval = intervals.get(0);
		result.add(lastInterval);
		for (int i = 1; i < intervals.size(); i++) {
			Interval currentInterval = intervals.get(i);
			if (currentInterval.start >= lastInterval.end) {
				result.add(currentInterval);
				lastInterval = currentInterval;
			}
		}
		return result;

	}

}
