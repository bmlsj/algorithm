def solution(myString, pat):
    
    긴문자열 = ''
    정답리스트 = []
    for 문자 in myString:
        긴문자열 += 문자
        if 긴문자열.endswith(pat):
            정답리스트.append(긴문자열)
            continue
        
    return 정답리스트[-1]