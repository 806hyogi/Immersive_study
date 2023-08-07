#연습문제 (29.7)
'''
x = 10
y = 3

def get_quotient_remainder(a, b):
    return a // b, a % b
 
quotient, remainder = get_quotient_remainder(x, y)
print('몫: {0}, 나머지: {1}'.format(quotient, remainder))
'''

#심사문제

x, y = map(int, input().split())

def calc(x, y):
    a = x + y
    s = x - y
    m = x * y
    d = x / y
    return a, s, m, d

a, s, m, d = calc(x, y)
print('덧셈: {0}, 뺄젬: {1}, 곱셈: {2}, 나눗셈: {3}'.format(a, s, m, d))