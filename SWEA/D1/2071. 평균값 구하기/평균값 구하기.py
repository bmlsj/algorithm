
t = int(input())

for i in range(t):
	
    total = 0
    for nums in map(int, input().split()):
        total += nums
        
    print(f"#{i+1} {round(total / 10)}")