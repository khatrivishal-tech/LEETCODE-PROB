class Solution:
    def sortByBits(self, arr: list[int]) -> list[int]:
        n = len(arr)
        for i in range(n-1):
            for j in range(n-1-i):
                bin1 = bin(arr[j])
                bin2 = bin(arr[j+1])
                if bin1.count('1') > bin2.count('1'):
                    arr[j] , arr[j+1] = arr[j+1] , arr[j]
                elif bin1.count('1') == bin2.count('1') and arr[j] > arr[j+1]:
                    arr[j] , arr[j+1] = arr[j+1] , arr[j]
        return arr

