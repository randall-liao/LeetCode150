package leetcode75.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

  public static String predictPartyVictory(String senate) {
    char[] senates = senate.toCharArray();
    int senatesLength = senates.length;
    boolean[] isBanned = new boolean[senatesLength];
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
    int pointer = 0;
    while (!radiantIndexVotingQueue.isEmpty() && !direIndexVotingQueue.isEmpty()) {
      if (!isBanned[pointer]) {
        // When senate can vote, it will ban the next senate in opposite party
        switch (senates[pointer]) {
          case 'R':
            Iterator<Integer> iterator = direIndexVotingQueue.iterator();
            boolean isVoted = false;
            while (iterator.hasNext()) {
              Integer index = iterator.next();
              if (index > pointer) {
                isBanned[index] = true;
                iterator.remove();
                isVoted = true;
                break;
              }
            }
            if (!isVoted && !direIndexVotingQueue.isEmpty()) {
              isBanned[direIndexVotingQueue.remove()] = true;
            }
            break;
          case 'D':
            Iterator<Integer> iteratorD = radiantIndexVotingQueue.iterator();
            boolean isVotedD = false;
            while (iteratorD.hasNext()) {
              Integer index = iteratorD.next();
              if (index > pointer) {
                isBanned[index] = true;
                iteratorD.remove();
                isVotedD = true;
                break;
              }
            }
            if (!isVotedD && !radiantIndexVotingQueue.isEmpty()) {
              isBanned[radiantIndexVotingQueue.remove()] = true;
            }
            break;
        }
      }
      pointer = loopingArray(pointer, senatesLength);
    }
    if (radiantIndexVotingQueue.isEmpty()) {
      return "Dire";
    } else {
      return "Radiant";
    }
  }

  private static int loopingArray(int pointer, int arrayLength) {
    if (pointer == arrayLength - 1) {
      return 0;
    } else {
      return ++pointer;
    }
  }
}
