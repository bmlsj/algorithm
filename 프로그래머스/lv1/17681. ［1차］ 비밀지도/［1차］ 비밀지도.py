def solution(n, arr1, arr2):
    
    arr1 = [bin(i)[2:] for i in arr1]
    arr2 = [bin(i)[2:] for i in arr2]
    
    for i in range(len(arr1)):
        if len(arr1[i]) != n:
            while (n - len(arr1[i])):
                arr1[i] = '0' + arr1[i]
            arr1[i] = arr1[i]
    
    for i in range(len(arr2)):
        if len(arr2[i]) != n:
            while (n - len(arr2[i])):
                arr2[i] = '0' + arr2[i]
            arr2[i] = arr2[i]
    
    map = [[0]*len(arr1) for i in range(len(arr1))]
    
    for i in range(len(arr1)):
        for j in range(len(arr1)):
            if (arr1[i][j] == '1') or (arr2[i][j] == '1'):
                map[i][j] = '#'
            else:
                map[i][j] = ' '
    
    print(map)
    return [''.join(i) for i in map]