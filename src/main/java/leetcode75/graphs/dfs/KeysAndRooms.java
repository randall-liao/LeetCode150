package leetcode75.graphs.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class KeysAndRooms {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Stack<Integer> keysForRoom = new Stack<>();
    Set<Integer> roomVisited = new HashSet<>();
    List<Integer> keysInRoomZero = rooms.get(0);
    roomVisited.add(0);
    for (Integer key : keysInRoomZero) {
      keysForRoom.push(key);
    }
    while (!keysForRoom.isEmpty()) {
      Integer key = keysForRoom.pop();
      if (!roomVisited.contains(key)) {
        // if a room have not been visited, visit the room and collect all keys
        roomVisited.add(key);
        List<Integer> keysInRoom = rooms.get(key);
        for (Integer newKey : keysInRoom) {
          keysForRoom.push(newKey);
        }
      }
      // skip the room if visited
    }
    return rooms.size() == roomVisited.size();
  }
}
