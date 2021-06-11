array1 = [2, 4, 6, 2, 5]
array2 = [5, 1, 1, 5]


def solve(arr):
    prevSum = 0
    maxSum = 0
    for value in arr:
        temp = maxSum
        maxSum = max(maxSum, prevSum + value)
        prevSum = temp
    return maxSum


print(solve(array1))
print(solve(array2))
