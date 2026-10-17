class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        cnt = 0
        for word in sentences:
            prev = 0
            prev = len(word.split())
            if prev > cnt:
                cnt = prev
        return cnt
