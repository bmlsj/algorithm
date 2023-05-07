
t = int(input())
score = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']
for i in range(1, t + 1):

    n, k = map(int, input().split())
    stu = []

    for idx in range(n):
        mid, final, assign = map(int, input().split())
        total = (mid * 0.35) + (final * 0.45) + (assign * 0.2)
        stu.append(total)

    k_score = stu[k-1]  # k번째 학생의 점수

    stu.sort(reverse=True)
    div = n // 10  
    k_idx = stu.index(k_score) // div 

    print(f"#{i} {score[k_idx]}")
