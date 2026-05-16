from abc import ABC, abstractmethod
from collections import deque
from typing import override


class Stack[T](ABC):
    @abstractmethod
    def push(self, item: T) -> None:
        pass

    @abstractmethod
    def pop(self) -> T:
        pass

    @abstractmethod
    def peek(self) -> T:
        pass


class ListStack[T](Stack[T]):

    def __init__(self):
        self._list: list[T] = []

    @override
    def push(self, item: T) -> None:
        self._list.append(item)

    @override
    def pop(self) -> T:
        return self._list.pop()

    @override
    def peek(self) -> T:
        return self._list[-1]

class DequeStack[T](Stack[T]):

    def __init__(self):
        self._deque = deque()

    @override
    def push(self, item: T) -> None:
        self._deque.appendleft(item)

    @override
    def pop(self) -> T:
        return self._deque.popleft()

    @override
    def peek(self) -> T:
        return self._deque[0]
