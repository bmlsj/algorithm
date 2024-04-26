t = int(input())

for i in range(t):
	
    max_num = 0
    for nums in map(int, input().split()):
    	if max_num < nums:
            max_num = nums
    print(f"#{i+1} {max_num}")