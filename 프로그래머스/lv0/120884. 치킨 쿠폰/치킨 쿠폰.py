def solution(chicken):
    
    coupon = chicken # 1081
    service = 0
    
    while coupon > 9:
        service += (coupon // 10)
        coupon = (coupon % 10) + (coupon // 10)
        
    return service
    
    
    