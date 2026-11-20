class Solution:
    def replaceDigits(self, s: str) -> str:
        letters = "abcdefghijklmnopqrstuvwxyz"
        res = []
        for i in range(len(s)):
            if s[i].isdigit():
                res.append(letters[letters.index(s[i-1])+int(s[i])])
            else:
                res.append(s[i])
        return "".join(res)