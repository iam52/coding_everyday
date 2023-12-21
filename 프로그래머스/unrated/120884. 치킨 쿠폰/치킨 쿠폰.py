def solution(chicken):
    # 서비스 치킨의 수를 초기화합니다.
    service_chicken = 0

    # 받은 쿠폰 수를 초기화합니다.
    coupons = 0

    # 주문한 치킨 수만큼 반복합니다.
    while chicken > 0:
        # 치킨을 시킬 때마다 쿠폰을 하나 받습니다.
        coupons += 1

        # 치킨을 하나 줄입니다.
        chicken -= 1

        # 쿠폰이 10장이 되면 서비스 치킨을 받고, 쿠폰을 10장 사용합니다.
        if coupons == 10:
            service_chicken += 1
            coupons -= 10

            # 서비스 치킨에 대해서도 쿠폰을 하나 받습니다.
            coupons += 1

    # 최종적으로 받을 수 있는 서비스 치킨의 수를 반환합니다.
    return service_chicken