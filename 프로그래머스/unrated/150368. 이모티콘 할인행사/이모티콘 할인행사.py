from itertools import product

def solution(users, emoticons):
    
    # 할인율 종류
    percentage = [10, 20, 30, 40]    
    # 할인율을 적용할 전체 경우의 수
    product_percent = list(product(percentage, repeat=len(emoticons)))  
    # 경우별 판매액 리스트
    sales = [list(0 for _ in range(len(users))) for _ in range(len(product_percent))]
    # 경우별 이모티콘 플러스 가입자
    plus = [0 for _ in range(len(product_percent))]

    
    for k in range(len(product_percent)):
        for i in range(len(users)):
            buy = 0
            for j in range(len(emoticons)):
                
                # i번째 사용자가 구매할 이모티콘: user[i][0]이상으로 할인하면 구매
                if users[i][0] <= product_percent[k][j]: 
                    # 이모티콘에 할인율을 적용한 금액을 더함
                    buy += int(emoticons[j] * (100 - product_percent[k][j]) / 100)
                
                # 만약 구매한 금액이 유저가 지정한 한도를 넘는다면 이모티콘 플러스 구매
                if buy >= users[i][1]:
                    # 플러스를 구매하면 이모티콘을 따로 구매하지 않음
                    buy = 0
                    # 해당 경우의 수에 +1
                    plus[k] += 1
                    break
            
            # 각 유저가 구매한 이모티콘 금액을 더해준다.
            sales[k][i] += buy

            
    max_cash = 0
    max_plus = max(plus)
    for i in range(len(plus)):
        # 가장 많이 플러스에 가입한 경우 중 가장 판매액이 높은 경우를 구함
        if plus[i] == max_plus:
            max_cash = max(sum(sales[i]), max_cash)

    return [max_plus, max_cash]