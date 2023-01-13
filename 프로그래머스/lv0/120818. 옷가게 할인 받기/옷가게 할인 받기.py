def solution(price):
    
    if 1000000 >= price >= 500000:
        price *= 0.8

    elif 500000> price >= 300000:
        price *= 0.9

    elif 300000 > price >= 100000:
        price *= 0.95
    
    return int(price)
