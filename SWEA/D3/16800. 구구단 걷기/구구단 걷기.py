t = int(input())

for k in range(1, t + 1):

    num = int(input())
    arr = []

    for i in range(1, int(num**0.5) + 1):
        if num % i == 0:
            arr.append((i - 1) + (num // i) - 1)

    print(f"#{k} {min(arr)}")