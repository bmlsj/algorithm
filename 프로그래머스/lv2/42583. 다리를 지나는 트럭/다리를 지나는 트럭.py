from collections import deque

def solution(bridge_length, weight, truck_weights):
    
    weight_limit = 0
    time = 0
    truck = deque(truck_weights)
    bridge = deque([0] * bridge_length)
    
    while bridge:
        time += 1
        
        if bridge[0]: 
            weight_limit -= bridge[0]
            
        bridge.popleft()
        if truck:
            if (weight_limit + truck[0]) <= weight:
                weight_limit += truck[0]
                bridge.append(truck.popleft())
                
            else:
                bridge.append(0)
                
    return time