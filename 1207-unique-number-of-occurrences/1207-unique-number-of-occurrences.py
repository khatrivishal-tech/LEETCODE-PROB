class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        d = {}
        for num in arr:
            if num not in d:
                d[num] = 1
            else:
                d[num] += 1
        s = set()
        for i in d.values():
            s.add(i)
        #print(s)
        if len(d) == len(s):
            return True
        else:
            return False