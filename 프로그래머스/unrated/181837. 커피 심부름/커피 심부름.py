def solution(orders):
    
    # 4500, 5000
    
    cash = 0
    for order in orders:
        if 'americano' in order:
            cash += 4500
        elif 'latte' in order:
            cash += 5000
        else:
            cash += 4500
            
    return cash