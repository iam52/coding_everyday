def solution(my_string):
    answer = 0
    
    parts = my_string.split()
    
    first_num = int(parts[0])
    
    for i in range(1, len(parts), 2):
        operator = parts[i]
        numbers = int(parts[i + 1])
        
        if operator == '+':
            first_num += numbers
        elif operator == '-':
            first_num -= numbers
    
    answer = first_num
    
    return answer