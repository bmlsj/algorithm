
def solution(numbers):
    # permutations 사용시 시간초과 발생

    # int-> str 변환
    numbers = list(map(str, numbers))
    # * 람다함수를 사용해서 666, 101010, 222 일때 첫번째 인덱스 값의 내림차순으로 정렬
    # 이유 -> 3, 300 일때 333, 300300300 -> 이렇게 되서 300이 뒤로 가게 할 수 있다.
    
    
    # x * 3을 해주는 이유 : 각 num의 자릿수가 1000이하이니까요! 가령 9, 991 이면 9에다가 *2해도 99, 991로 여전히 991이 더 앞편에 정렬되기 때문
    # 만일 numbers가 [221,2,10] 이렇게 주어졌다고 가정했을때
    # x*2를 하면 [221221,22,1010],,,이렇게 되면 22보다 221이 문자열 비교해도 더 큰수로 나오기 때문에 원하는 정렬이 되지 않는다.
    # 100이하라면 모를까 1000이하의 조건이라면 x*3을 해줘야 하고, 10000이하의 조건이라면 x*4를 해줘야 하지 않을까?
    numbers.sort(key=lambda x: x * 3, reverse=True)
    
    # int로 한번 변환 해주는 이유는 모든 값이 0일때 0으로 변환해주려함 => ex) 0000 -> 0
    return str(int(''.join(numbers)))


