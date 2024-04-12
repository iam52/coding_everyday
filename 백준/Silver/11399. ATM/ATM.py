N = int(input())
nums = list(map(int, input().split()))

nums.sort()
sum = 0
for idx in range(N):
    for idx2 in range(idx + 1):
        sum += nums[idx2]
print(sum)
