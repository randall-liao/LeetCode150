
class CycleArray:
    def __init__(self, size=1):
        """
        Initializes the circular array.
        [start, end) is a left-closed, right-open interval.
        """
        self.size = size
        self.arr = [None] * size
        self.start = 0  # Inclusive
        self.end = 0    # Exclusive
        self.count = 0

    def add_first(self, val):
        """Adds an element to the head (O(1))."""
        if self.is_full():
            self.resize(self.size * 2)
        self.start = (self.start - 1 + self.size) % self.size
        self.arr[self.start] = val
        self.count += 1

    def add_last(self, val):
        """Adds an element to the tail (O(1))."""
        if self.is_full():
            self.resize(self.size * 2)
        self.arr[self.end] = val
        self.end = (self.end + 1) % self.size
        self.count += 1

    def remove_first(self):
        """Removes an element from the head (O(1))."""
        if self.is_empty():
            raise OverflowError("Empty Array")
        self.arr[self.start] = None
        self.count -= 1
        self.start = (self.start + 1) % self.size
        if self.count > 0 and self.count == self.size // 4:
            self.resize(self.size // 2)

    def remove_last(self):
        """Removes an element from the tail (O(1))."""
        if self.is_empty():
            raise OverflowError("Empty Array")
        self.end = (self.end - 1 + self.size) % self.size
        self.arr[self.end] = None
        self.count -= 1
        if self.count > 0 and self.count == self.size // 4:
            self.resize(self.size // 2)


    def get_first(self):
        """Returns the first element (O(1))."""
        return self.arr[self.start]


    def get_last(self):
        """Returns the last element (O(1))."""
        return self.arr[(self.end - 1) % self.size]

    def resize(self, new_size):
        """Handles dynamic scaling of the underlying array."""
        new_arr = [None] * new_size
        for i in range(self.count):
            new_arr[i] = self.arr[(self.start + i) % self.size]
        self.arr = new_arr
        self.size = new_size
        self.end = self.count
        self.start = 0

    def is_full(self) -> bool:
        """Checks if count == size."""
        return self.count == self.size

    def is_empty(self) -> bool:
        """Checks if count == 0."""
        return self.count == 0

    def get_count(self) -> int:
        """Returns current number of elements."""
        return self.count
