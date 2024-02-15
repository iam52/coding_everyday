def solution(bandage, health, attacks):
    answer = 0
    last_attack = max(attacks)[0]
    t, x, y = bandage
    current_health, healing_time, con_success_time = health, 0, 0

    for i in range(1, last_attack+1):
        healing_time += 1
        con_success_time +=1

        for attack in attacks:
            if attack[0] == i:
                current_health -= attack[1]
                healing_time, con_success_time = 0, 0

        if current_health <= 0:
            return -1

        if healing_time != 0 and con_success_time != 0:
            current_health += x

        if con_success_time == t:
            current_health += y

        if healing_time == t:
            healing_time, con_success_time = 0, 0

        if current_health > health:
            current_health = health

    answer = current_health
    return answer