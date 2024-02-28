class Solution:
    def addBinary(self, a: str, b: str) -> str:
#         함수 외워야겠다...
        return bin(int(a, base=2) + int(b, base=2))[2:]
        