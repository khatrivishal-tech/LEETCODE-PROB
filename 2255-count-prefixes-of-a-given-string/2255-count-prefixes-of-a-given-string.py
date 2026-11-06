class Solution(object):
    def countPrefixes(self, words, s):
        """
        :type words: List[str]
        :type s: str
        :rtype: int
        """
        cnt = 0
        for word in words:
            if s.startswith(word):
                cnt += 1 
        return cnt