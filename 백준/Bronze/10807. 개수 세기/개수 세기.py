N = int(input())
num_list = list(map(int, input().split()))
v = int(input())

n = 0
for i in range(N):
    if num_list[i] == v:
        n += 1
        
print(n)