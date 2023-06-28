def solution(genres, plays):
    
    # 많이 재생된 장르
    # 장르 내 많이 재생된 노래
    # 재생 횟수가 같다면, 고유번호(인덱스)가 낮은 노래
    
    musicPlay = {}
    for i in range(len(plays)):
        musicPlay[i] = plays[i]
    
    musicPlay = dict(sorted(musicPlay.items(), key=lambda t:t[1], reverse=True))
    
    
    # 최대 재생횟수를 가지는 장르순으로 정렬
    genre = list(set(genres))
    genrePlay = dict()
    for g in genre:
        genrePlay[g] = 0
        
    for i in range(len(genres)):
        genrePlay[genres[i]] += plays[i]
    print(genrePlay)
    genrePlay = sorted(genrePlay, key=lambda a:genrePlay[a], reverse=True)

    ans = []
    cnt = dict()
    for gen in genrePlay:
        cnt[gen] = 0
        
    for gen in genrePlay:
        for idx, value in musicPlay.items():
            if genres[idx] == gen and cnt[genres[idx]] < 2:
                cnt[genres[idx]] += 1
                ans.append(idx)

    return ans
    