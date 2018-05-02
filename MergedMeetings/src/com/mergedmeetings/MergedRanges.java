package com.mergedmeetings;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergedRanges {
	

	public static List<Meeting> mergeRanges(List<Meeting> meetings) {
	
	    // make a copy so we don't destroy the input
	    List<Meeting> sortedMeetings = new ArrayList<>();
	    for (Meeting meeting: meetings) {
	        Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
	        sortedMeetings.add(meetingCopy);
	    }
	
	    // sort by start time
	    Collections.sort(sortedMeetings, new Comparator<Meeting>() {
	        @Override
	        public int compare(Meeting m1, Meeting m2)  {
	            return m1.getStartTime() - m2.getStartTime();
	        }
	    });
	
	    // initialize mergedMeetings with the earliest meeting
	    List<Meeting> mergedMeetings = new ArrayList<>();
	    mergedMeetings.add(sortedMeetings.get(0));
	
	    for (Meeting currentMeeting : sortedMeetings) {
	
	        Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
	
	        // if the current and last meetings overlap, use the latest end time
	        if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
	            lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
	
	        // add the current meeting since it doesn't overlap
	        } else {
	            mergedMeetings.add(currentMeeting);
	        }
	    }
	
	    return mergedMeetings;
	}
}




