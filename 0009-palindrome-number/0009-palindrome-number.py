class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        strX = str(x)
        reverseInt = int(strX[::-1])
        if x == reverseInt:
            return True
        return False