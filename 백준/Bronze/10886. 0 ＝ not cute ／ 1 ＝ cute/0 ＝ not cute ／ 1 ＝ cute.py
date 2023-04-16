score = []
a = int(input())

for _ in range(a):
    score.append(int(input()))

if score.count(1) > score.count(0):
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")