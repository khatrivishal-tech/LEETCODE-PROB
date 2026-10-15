class Solution(object):
    def numOfStrings(self, patterns, word):
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        cnt = 0
        for ch in patterns:
            if ch in word:
                cnt += 1

        return cnt