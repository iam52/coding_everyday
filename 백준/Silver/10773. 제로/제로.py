import sys

k = int(sys.stdin.readline().strip())

stack = []

for _ in range(k):
    num = int(sys.stdin.readline().strip())
    
    if (num == 0):
        stack.pop()
    else:
        stack.append(num)
        
result = 0
if not stack:
    print(0)
else:
    print(sum(stack))