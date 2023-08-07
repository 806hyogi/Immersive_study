#연습문제 (8.4)

korean = 92
english = 47
mathematics = 86
science = 81

print(korean >= 50 & english >= 50 & mathematics >= 50 & science >= 50)

#심사문제
kor, eng, math, sci = map (int, input().split())
print(kor >= 90 and eng > 80 and math > 85 and sci >= 80)