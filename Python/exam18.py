# 연습문제 (22.9)
a = ['alpha', 'bravo', 'charlie', 'delta', 'echo', 'foxtrot', 'golf', 'hotel', 'india']
b = [i for i in a if len(i) == 5]
 
print(b)

#심사문제
a, b = map(int, input().split())
re = [2**i for i in range(a, b+1) if not(i == a+1 or i == b-1)]
print(re)
