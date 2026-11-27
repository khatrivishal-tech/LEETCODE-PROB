class Solution:
    def transpose(self, matrix: list[list[int]]) -> list[list[int]]:
        res = []
        n = len(matrix)
        m = len(matrix[0])
        for i in range(m):
            j = 0
            temp = []
            while  j < n:
                temp.append(matrix[j][i])
                j+=1
            res.append(temp)
        return res