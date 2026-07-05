class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        n = len(s)
        ans = ""
        for i in range(n):
            for j in range(i+1, n+1):
                sub = s[i:j]
                chars = set(sub)
                nice = True
                for ch in chars:
                    if ch.lower() not in chars or ch.upper() not in chars:
                        nice = False
                        break
                if nice and len(sub) > len(ans):
                    ans = sub
        return ans
