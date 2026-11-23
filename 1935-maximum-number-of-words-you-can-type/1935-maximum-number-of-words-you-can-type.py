class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split()
        c = 0
        for word in words:
            for let in brokenLetters:
                if let in word:
                    break
            else:
                c += 1
        return c