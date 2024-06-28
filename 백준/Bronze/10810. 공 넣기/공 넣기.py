N, M = list(map(int, input().split()))
baskets = [0*i for i in range(N)]

for _ in range(M):
    i, j, k = list(map(int, input().split()))
    for idx in range(i, j+1):
        baskets[idx-1] = k
        
for ball in range(N):
    print(baskets[ball], end=' ')