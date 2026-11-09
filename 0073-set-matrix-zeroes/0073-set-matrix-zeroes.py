class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        co = copy.deepcopy(matrix)
        for i in range(n):
            for j in range(len(matrix[i])):
                if co[i][j] == 0:
                    r , c = 0 , 0
                    while r < n:
                        matrix[r][j] = 0
                        r += 1
                    while c < len(co[i]):
                        matrix[i][c] = 0
                        c += 1