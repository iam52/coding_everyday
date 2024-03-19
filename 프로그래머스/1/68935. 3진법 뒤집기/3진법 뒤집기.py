def solution(n):
    tenary = ''
    while n > 0:
        n, remain = divmod(n, 3)
        tenary = str(remain) + tenary
    reversed = tenary[::-1]
    return int(reversed, 3)