
t = int(input())

for i in range(1, t+1):

    n = input()

    if n == n[::-1]:
        print(f"#{i} 1")
    else:
        print(f"#{i} 0")
