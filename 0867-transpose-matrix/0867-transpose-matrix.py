class Solution:
    def transpose(self, matrix: list[list[int]]) -> list[list[int]]:
        res = []
        for i in range(len(matrix[0])):
            j = 0
            temp = []
            while  j < len(matrix):
                temp.append(matrix[j][i])
                j+=1
            res.append(temp)
        return res