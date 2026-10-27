class Solution(object):
    def calculateScore(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        s1 = bin(a)[2:]
        s2 = bin(b)[2:]
        s1str = str(s1)
        s2str = str(s2)
        s1score=0
        s2score=0
        for i in s1str:
            if i == '1':
                s1score+=1
        for j in s2str:
            if j == '1':
                s2score+=1
        if s1score>=s2score:
            return s1score * s2score
        else:
            return s2score // s1score