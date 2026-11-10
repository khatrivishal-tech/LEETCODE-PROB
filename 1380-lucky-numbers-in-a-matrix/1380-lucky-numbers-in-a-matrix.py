class Solution(object):
    def luckyNumbers(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        mineachrow = []
        for row in matrix:
            mineachrow.append(min(row))
        maxincols = []
        for c in range(len(matrix[0])):
            maxi = matrix[0][c]
            for r in range(len(matrix)):
                if matrix[r][c] > maxi:
                    maxi = matrix[r][c]
            maxincols.append(maxi)
        ans = []
        for num in mineachrow:
            if num in maxincols:
                ans.append(num)
        return ans
