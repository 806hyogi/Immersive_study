# 파이썬으로 별찍기(숙제)
# for i in range(100):
#     print(f"{i}Hello, world")


for i in range(3):
    for j in range(7):
        print('*', end='')
    print()

import turtle as t
 
import turtle as t
 
t.shape('turtle')
t.speed('fastest')      # 거북이 속도를 가장 빠르게 설정
for i in range(5000):    # 300번 반복
    t.forward(i)        # i만큼 앞으로 이동. 반복할 때마다 선이 길어짐
    t.right(100)         # 오른쪽으로 91도 회전