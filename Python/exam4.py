# 연습문제 (7.4)
year = 2000
month = 10
day = 27
hour = 11
minute = 43
second = 59

print(year, month, day, sep='/', end=' ') # 문자열 끝에 추가
print(hour, minute, second, sep=':')

# 심사문제

year, month, day, hour, month, second = input().split()

print(year, month, day, sep='-', end='T') # 문자열 끝에 추가
print(hour, minute, second, sep=':')