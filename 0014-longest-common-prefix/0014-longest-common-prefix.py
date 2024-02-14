from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        else:
            for i in range(len(strs[0])):
                for j in range(1, len(strs)):
                    if i >= len(strs[j]) or strs[0][i] != strs[j][i]:
                        return strs[0][:i]
            return strs[0]
