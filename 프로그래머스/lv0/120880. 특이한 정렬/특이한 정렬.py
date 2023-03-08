def solution(numlist, n):
    
    num = sorted(numlist)
    numlist = sorted(numlist)
    for i in range(len(num)):
        num[i] -= n
    
    # print(num)
    num_sort = []
    for i, v in enumerate(num):
        num_sort.append([numlist[i], abs(v)])
    
    # print(num_sort)
    num_sort = sorted(num_sort, key=lambda num_sort: num_sort[1])

    for i in range(len(num_sort)-1):
        if num_sort[i][1] == num_sort[i+1][1]:
            num_sort[i][0], num_sort[i+1][0] = num_sort[i+1][0], num_sort[i][0]
    
    ans = []
    for i in range(len(num_sort)):
        ans.append(num_sort[i][0])
    
    print(ans)
    return ans