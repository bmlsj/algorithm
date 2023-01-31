n = int(input())

houses = list(map(int, input().split()))
houses = sorted(houses)

print(houses[(n-1)//2])