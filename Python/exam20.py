# 연습문제 (24.4)
# path = 'C:\\Users\\dojang\\AppData\\Local\\Programs\\Python\\Python36-32\\python.exe'

# x = path.split('\\')
# filename = x[-1]

# print(filename)

# 심사문제 : 특정 단어 개수 세기

s = input().split()
count = 0

for i in s:
    i = i.strip(',.')
    if i == 'the':
        count += 1

print(count)


# 심사문제2
a = list(map(int, input().split(';')))
a.sort(reverse=True)
for i in a:
    print('%9s' % format(i, ','))
print()
