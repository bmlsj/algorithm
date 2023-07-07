
s = input()

left = sum(map(int, s[:len(s)//2]))
right = sum(map(int, s[len(s)//2:]))

print("LUCKY" if left == right else "READY")