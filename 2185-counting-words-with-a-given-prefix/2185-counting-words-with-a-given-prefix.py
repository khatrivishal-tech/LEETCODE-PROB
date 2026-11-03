class Solution(object):
    def prefixCount(self, words, pref):
        """
        :type words: List[str]
        :type pref: str
        :rtype: int
        """
        cnt = 0 
        prefsize = len(pref)
        for word in words:
            if pref == word[0:prefsize]:
                cnt += 1
        return cnt