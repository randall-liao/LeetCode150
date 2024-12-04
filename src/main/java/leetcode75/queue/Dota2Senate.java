package leetcode75.queue;


import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

  public static String predictPartyVictory(String senate) {
    char[] senates = senate.toCharArray();
    int senatesLength = senates.length;
    Queue<Integer> radiantIndexVotingQueue = new LinkedList<>();
    Queue<Integer> direIndexVotingQueue = new LinkedList<>();
    for (int i = 0; i < senatesLength; i++) {
      switch (senates[i]) {
        case 'R':
          radiantIndexVotingQueue.add(i);
          break;
        case 'D':
          direIndexVotingQueue.add(i);
          break;
      }
    }
    while (!radiantIndexVotingQueue.isEmpty() && !direIndexVotingQueue.isEmpty()) {
      Integer radiantIndex = radiantIndexVotingQueue.remove();
      Integer direIndex = direIndexVotingQueue.remove();
      if (radiantIndex < direIndex) {
        // The smaller index can vote first, and remove the other one by adding itself back to the
        // queue.
        radiantIndexVotingQueue.add(radiantIndex + senatesLength);
      } else {
        direIndexVotingQueue.add(direIndex + senatesLength);
      }
    }
    if (radiantIndexVotingQueue.isEmpty()) {
      return "Dire";
    } else {
      return "Radiant";
    }
  }

}
