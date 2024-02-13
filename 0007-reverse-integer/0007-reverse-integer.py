class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            x = x * -1
            reversed_num = -1 * int(str(x)[::-1])
        else:
            reversed_num = int(str(x)[::-1])
        
        if reversed_num > -2**31 and reversed_num < 2**31 :
            return reversed_num
        return 0