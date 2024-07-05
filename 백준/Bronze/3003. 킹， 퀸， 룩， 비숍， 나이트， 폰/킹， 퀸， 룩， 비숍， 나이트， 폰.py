have = list(map(int, input().split()))
total = [1, 1, 2, 2, 2, 8]

result = [t-h for t, h in zip(total, have)]

print(*result)

