def solution(polynomial):
    answer = ''
    poly_dict = {}
    
    terms = polynomial.split(' + ')
    
    for term in terms:
        if 'x' in term:
            if term == 'x':
                coeff = 1
            else:
                coeff = int(term.replace('x', ''))
            poly_dict['x'] = poly_dict.get('x', 0) + coeff
        else:
            poly_dict['const'] = poly_dict.get('const', 0) + int(term)
            
    if poly_dict.get('x', 0) > 1:
        answer += f"{poly_dict['x']}x"
    elif poly_dict.get('x', 0) == 1:
        answer += 'x'
        
    if poly_dict.get('const', 0) > 0:
        if answer:
            answer += " + "
        answer += str(poly_dict['const'])
    
    return answer