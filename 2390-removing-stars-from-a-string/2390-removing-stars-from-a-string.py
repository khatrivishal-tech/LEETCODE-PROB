class Solution(object):
    def removeStars(self, s):
        """
        :type s: str
        :rtype: str
        """
        lis = []
        for c in s:
            if c != '*':
                lis.append(c)
            else:
                lis.pop()
        return "".join(lis)