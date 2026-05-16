def bubble_sort_desc(unsort_list: list[int]) -> list[int]:
    length: int = len(unsort_list)
    if length < 2:
        return unsort_list
    for pass_count in range(length):
        for i in range(1, length - pass_count):
            if unsort_list[i - 1] < unsort_list[i]:
                # incorrect state
                unsort_list[i - 1], unsort_list[i] = unsort_list[i], unsort_list[i - 1]
    return unsort_list

def bubble_sort_asc(unsorted_list: list[int]) -> list[int]:
    length: int = len(unsorted_list)
    if length < 2:
        return unsorted_list
    for i in range(length):
        for j in range(1, length - i):
            if unsorted_list[j] < unsorted_list[j - 1]:
                unsorted_list[j], unsorted_list[j - 1] = unsorted_list[j - 1], unsorted_list[j]
    return unsorted_list
