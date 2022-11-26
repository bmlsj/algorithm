
station = []
person = []
# 1부터 10번역까지
for _ in range(10):
    station.append(list(map(int, input().split())))

person.append(station[0][1])
result = 0

for i in range(1, 10):
    result = person[ i -1] - station[i][0] + station[i][1]
    person.append(result)

print(max(person))
