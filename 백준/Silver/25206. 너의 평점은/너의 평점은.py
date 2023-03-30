score = []
grade = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5,
         'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0}

for _ in range(20):
    score.append(list(input().split()))

total_credit = 0
total_grade = 0
for i in range(len(score)):
    if score[i][2] != 'P':
        total_grade += (grade[score[i][2]] * float(score[i][1]))
        total_credit += float(score[i][1])

print(total_grade / total_credit)
