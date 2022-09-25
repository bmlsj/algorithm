def solution(s):
    ans = list(s)
    if len(ans) % 2:
        return ans[int(len(ans)/2)]
    else:
        return "".join(ans[int(len(ans)/2)-1:int(len(s)/2)+1])
    