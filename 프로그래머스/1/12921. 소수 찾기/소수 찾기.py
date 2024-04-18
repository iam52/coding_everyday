def solution(n):
    # 에라토스테네스의 체
    prime = [True] * (n+1) # True 값이 들어간 배열 n만큼 생성
    p = 2 # 제일 작은 소수 2부터 시작
    
    while (p*p <= n): # p의 배수가 n보다 작을 동안,
        if prime[p] == True: # 만들어 놓은 배열의 p번째가 True이면,
            for i in range(p*p, n+1, p): # 이미 제외한 배수를 찾을 필요 없이 p*p부터 배수 탐색 후 False
                prime[i] = False
        p += 1 # n번째까지 반복
        
    prime_nums = []
    for p in range(2, n+1)    :
        if prime[p]:
            prime_nums.append(p) # 가장 작은 소수 2부터 정해진 수까지 만들어 놓은 배열 prime에서 True인 값을 저장
    
    return len(prime_nums)