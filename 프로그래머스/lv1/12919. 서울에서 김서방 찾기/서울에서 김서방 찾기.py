def solution(seoul):
    
    if "Kim" in seoul:
        x = seoul.index("Kim")
        return f"김서방은 {x}에 있다"
    else: 
        return -1
