# 연습문제 (14.6)

written_test = 75
coding_test = True
 
if written_test >= 80 & coding_test == True:
    print('합격')
else:
    print('불합격')

# 심사문제
x = list(map(int, input().split()))
print(x)
re = sum(x) / len(x)
if re > 100 :
    print("잘못된 점수")
elif(re >= 80) :
    print("합격")
else:
    print("불합격")