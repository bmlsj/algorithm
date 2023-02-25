def solution(bin1, bin2):
    num = int(bin1, 2) + int(bin2, 2)
    
    return bin(num)[2:]