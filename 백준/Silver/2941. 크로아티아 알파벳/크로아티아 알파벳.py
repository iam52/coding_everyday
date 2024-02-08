alphabet = input()
changed = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in changed:
    if i in alphabet:
        alphabet = alphabet.replace(i, '?')
print(len(alphabet))