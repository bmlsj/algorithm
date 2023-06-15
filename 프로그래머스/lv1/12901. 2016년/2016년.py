def solution(a, b):
    
    days = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    months = [31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31]
    
    total_days = 0
    for i in range(a-1):
        total_days += months[i]
    
    total_days += b
    
    return days[total_days % 7 - 1]
    