package leetcode75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KeysAndRoomsTest {

  KeysAndRooms room;

  private static List<List<Integer>> parseRooms(String roomsString) {
    if (roomsString == null || roomsString.isEmpty()) {
      return null; // Or throw an exception if empty input is invalid
    }

    if (!roomsString.startsWith("[") || !roomsString.endsWith("]")) {
      throw new IllegalArgumentException(
          "Invalid rooms string format: Must start and end with square brackets.");
    }

    List<List<Integer>> roomsList = new ArrayList<>();

    // Remove the outer brackets
    String content = roomsString.substring(1, roomsString.length() - 1);

    if (content.isEmpty()) {
      return roomsList; // Handle the case of "[]" which represents no rooms
    }

    // Split the content into individual room strings
    String[] roomStrings = content.split("\\],\\["); // Split by ],[

    for (String roomStr : roomStrings) {
      List<Integer> roomKeys = new ArrayList<>();
      // Remove the inner brackets from each room string
      String cleanedRoomStr = roomStr.replace("[", "").replace("]", "");

      if (!cleanedRoomStr.isEmpty()) {
        // Split the room string by comma to get keys
        String[] keyStrings = cleanedRoomStr.split(",");
        for (String keyStr : keyStrings) {
          try {
            roomKeys.add(
                Integer.parseInt(keyStr.trim())); // Parse key as integer and trim whitespace
          } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid key format in rooms string: " + keyStr, e);
          }
        }
      }
      roomsList.add(roomKeys);
    }

    return roomsList;
  }

  @BeforeEach
  void setUp() {
    this.room = new KeysAndRooms();
  }

  @Test
  void canVisitAllRooms_exampleOne() {
    String rooms = "[[1],[2],[3],[]]";
    List<List<Integer>> roomList = parseRooms(rooms);
    assertTrue(room.canVisitAllRooms(roomList));
  }

  @Test
  void canVisitAllRooms_exampleTwo() {
    String rooms = "[[1,3],[3,0,1],[2],[0]]";
    List<List<Integer>> roomList = parseRooms(rooms);
    assertFalse(room.canVisitAllRooms(roomList));
  }
}
