

class ListCircularQueue:

    def __init__(self, k: int):
        self._size_limit = k
        self._length = 0
        self.lst = []

    def __len__(self):
        return self._length

    def enQueue(self, value: int) -> bool:
        if self.isFull():
            return False
        self.lst.append(value)
        self._length += 1
        return True


    def deQueue(self) -> bool:
        if self.isEmpty():
            return False
        self._length -= 1
        self.lst.pop(0)
        return True


    def Front(self) -> int:
        if self.isEmpty():
            return -1
        return self.lst[0]

    def Rear(self) -> int:
        if self.isEmpty():
            return -1
        return self.lst[-1]

    def isEmpty(self) -> bool:
        return self._length <= 0

    def isFull(self) -> bool:
        return self._length >= self._size_limit
