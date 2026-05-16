
# [_, 2, 3, 4, 5, _]
class MyCircularDeque:

    def __init__(self, k: int):
        self.size = k
        self.arr = [-1] * self.size
        self.count = 0
        self.start = 0 # Inclusive
        self.end = 0 # Exclusive

    def insertFront(self, value: int) -> bool:
        if self.size == self.count:
            return False
        else:
            self.count += 1
            self.start = (self.start - 1 + self.size) % self.size
            self.arr[self.start] = value
            return True

    def insertLast(self, value: int) -> bool:
        if self.size == self.count:
            return False
        else:
            self.count += 1
            self.arr[self.end] = value
            self.end = (self.end + 1) % self.size
            return True

    def deleteFront(self) -> bool:
        if self.count == 0:
            return False
        else:
            self.count -= 1
            self.arr[self.start] = -1
            self.start = (self.start + 1) % self.size
            return True

    def deleteLast(self) -> bool:
        if self.count == 0:
            return False
        else:
            self.count -= 1
            self.end = (self.end - 1 + self.size) % self.size
            self.arr[self.end] = -1
            return True

    def getFront(self) -> int:
        return self.arr[self.start]

    def getRear(self) -> int:
        return self.arr[(self.end - 1 + self.size) % self.size]

    def isEmpty(self) -> bool:
        return self.count == 0

    def isFull(self) -> bool:
        return self.count == self.size
