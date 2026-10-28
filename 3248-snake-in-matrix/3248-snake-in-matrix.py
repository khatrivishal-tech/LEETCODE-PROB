class Solution(object):
    def finalPositionOfSnake(self, n, commands):
        """
        :type n: int
        :type commands: List[str]
        :rtype: int
        """
        r = 0 
        c = 0
        for cd in commands:
            if cd == "UP":
                r -= 1
            elif cd == "DOWN":
                r += 1
            elif cd == "RIGHT":
                c += 1
            else:
                c -= 1
        return r * n + c