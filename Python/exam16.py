# 연습문제 (19.5)

for i in range(5):
    for j in range(5):
                                     
        if j < i:
            print(' ', end='')
        else:
            print('*', end='')
                                     
    print()

# 심사문제

size = int(input())
for i in range(size):
    for j in range(size - i - 1):
        print(' ', end = '')
    for j in range(2 * i + 1):
        print('*', end='')
    print()