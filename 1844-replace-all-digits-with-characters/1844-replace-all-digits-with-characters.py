class Solution:
    def shift(self,c,x):
        num = ord(c)
        num = num + int(x)
        return chr(num)
    def replaceDigits(self, s: str) -> str:
        n = len(s)
        i = 1
        st = list(s)
        while i < n:
            c = s[i-1]
            x = int(s[i])
            st[i] = self.shift(c,x)
            i += 2
        return "".join(st)