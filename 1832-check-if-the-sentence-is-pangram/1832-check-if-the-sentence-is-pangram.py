class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        string = "abcdefghijklmnopqrstuvwxyz"
        for i in string:
            if i not in sentence:
                return False
        return True