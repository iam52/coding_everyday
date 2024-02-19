def solution(players, callings):
    # 선수들의 위치를 기록하는 딕셔너리 생성
    player_position = {player: i for i, player in enumerate(players)}
    
    for calling in callings:
        # 호출된 선수의 현재 위치 확인
        current_position = player_position[calling]
        
        # 호출된 선수가 바로 앞의 선수와 위치를 바꾸기
        players[current_position], players[current_position - 1] = players[current_position - 1], players[current_position]
        
        # 선수들의 위치를 업데이트
        player_position[players[current_position - 1]] = current_position - 1
        player_position[players[current_position]] = current_position
    
    return players
