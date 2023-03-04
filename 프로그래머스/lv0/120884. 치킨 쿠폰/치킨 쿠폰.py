def solution(chicken):
    
    coupon = chicken # 1081
    service = 0
    
    while True:
        service += (coupon // 10)
        print(service)
        coupon = (coupon % 10) + (coupon // 10)
        
        if coupon < 10:
            break
    return service
    
    
    