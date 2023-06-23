def solution(want, number, discount):
    # 매일 한가지 제품 행사 - 하루에 1개 구매 가능
    # 구매하려는 제품과 수량이 - 할인 날짜와 10일 연속 일치할 경우 회원가입

    def want_dict():
        want_list = {}
        for v, i in zip(want, number):
            want_list[v] = i
        return want_list

    want_list = want_dict()
    day = 0
    for i in range(len(discount)):
        cnt = 0
        while cnt < 10:
            if i + cnt >= len(discount):
                break

            if (discount[i + cnt]) in want and (want_list[discount[i + cnt]] > 0):
                want_list[discount[i + cnt]] -= 1
                cnt += 1
                if cnt == 10:
                    want_list = want_dict()
                    day += 1
                    break

            else:
                want_list = want_dict()
                break

    return day