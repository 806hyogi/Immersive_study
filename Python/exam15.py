#연습문제 (18.5)
# i = 0
# while True:
#     if i % 10 != 3:
#         i += 1
#         continue

#     if i > 73:
#         break

#     print(i, end=' ')
#     i += 1

#심사문제

start, stop = map(int, input().split())

i = start

while True:
    

    if i % 10 == 3:
        i += 1
        continue

    if i > stop:
        break

    print(i, end=' ')
    i += 1  
    
    