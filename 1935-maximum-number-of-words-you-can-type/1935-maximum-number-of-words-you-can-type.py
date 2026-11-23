class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split()
        c = 0
        for word in words:
            cnt = 1
            for i in range(len(brokenLetters)):
                if brokenLetters[i] in word:
                   cnt = 0
                   break
            c += cnt 
        return c