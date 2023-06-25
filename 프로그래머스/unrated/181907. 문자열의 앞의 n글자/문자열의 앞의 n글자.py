def split(string, num):

    ans = ''
    for s in range(len(string)):
        ans += string[s]
        if s == num - 1:
            return ans
        
def solution(my_string, n):
    return split(my_string, n)