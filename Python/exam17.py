# 연습문제 (20.7)
# for i in range(1, 101):
#     if i % 2 == 0 and i % 11 == 0:
#         print('FizzBuzz')
#     elif i % 2 == 0:
#         print('Fizz')
#     elif i % 11 == 0:
#         print('Buzz')
#     else:
#         print(i)

# 심사문제
a, b = map(int, input().split())

for k in range(a, b+1):
    
    if k == a:
        print("FizzBuzz")
        continue
    
    if k == b:
        print("Fizz")
        continue

    print(k)
    k += 1