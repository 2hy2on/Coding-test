class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        ans = dividend/divisor
        if ans < -(2**31): ans = -(2**31)
        elif ans > 2**31-1 : ans = 2**31-1
            
        if ans < 0:     ans = ceil(ans)
        elif ans > 0:   ans = floor(ans)
            
        return int(ans)
