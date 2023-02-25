def solution(numbers):
    dic = {"zero": "0", "one": "1", "two": "2", "three": "3", "four": "4", "five": "5", "six": "6", "seven": "7", "eight": "8", "nine": "9"}
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    s = ''
    ans = ''

    for j in numbers:
        s += j
        if s in num:
            ans += dic[s]
            s = ''
            
    return int(ans)