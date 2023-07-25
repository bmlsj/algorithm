def solution(wallpaper):
    
    INF = 50
    
    dots = []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[0])):
            if wallpaper[i][j] == '#':
                dots.append([i, j])
                dots.append([i+1, j+1])
    
    dots.sort()
    min_x, min_y = INF, INF
    max_x, max_y = -INF, -INF
    for i in range(len(dots)):
        min_x = min(min_x, dots[i][0])
        min_y = min(min_y, dots[i][1])
        max_x = max(max_x, dots[i][0])
        max_y = max(max_y, dots[i][1])
    
    return [min_x, min_y, max_x, max_y]