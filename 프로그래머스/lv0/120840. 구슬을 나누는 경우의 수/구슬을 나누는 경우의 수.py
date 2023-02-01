def solution(balls, share):

    return factorial(balls) / (factorial(balls-share) * factorial(share))


def factorial(num):
    if num <= 1:
        return 1
    else:
        return num * factorial(num-1)