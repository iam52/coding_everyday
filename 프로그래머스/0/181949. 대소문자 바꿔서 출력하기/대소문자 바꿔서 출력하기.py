str = input()
temp = ''
for i in str:
    if i == i.lower():
        temp += i.upper()
    elif i == i.upper():
        temp += i.lower()
print(temp)