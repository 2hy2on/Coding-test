class Solution:
    def reverse(self, x: int) -> int:
        if x>0: #Positive
            value=int(str(x)[::-1]) #reversed
        else: #Negative and zero
            value=-1*int(str(x*-1)[::-1])  #reversed
        
        if value not in range(-2**31,2**31): #Overflow 
            value=0
        
        return value
        