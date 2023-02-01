def solution(emergency):

    em = {}
    emer = sorted(emergency, reverse=True)


    for idx, value in enumerate(emer):
        em[value] = (idx + 1)

    print(em)
    return [em[x] for x in emergency]