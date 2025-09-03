n = int(input())
cards = set(map(int, input().split()))

m = int(input())
queries = list(map(int, input().split()))

results = [1 if q in cards else 0 for q in queries]
print(' '.join(map(str, results)))