# 연습문제 (37.2)
class Rectangle:
    def __init__(self, x1, y1, x2, y2):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2
 
rect = Rectangle(x1=20, y1=20, x2=40, y2=30)

width = abs(rect.x2 - rect.x1)
height = abs(rect.y2 - rect.y1)
area = width * height
print(area)

# 심사문제
import math

class Point2D:
    def __init__(self, x = 0, y = 0):
        self.x = x
        self.y = y

length = 0.0
p = [Point2D(), Point2D(), Point2D(), Point2D()]
p[0].x, p[0].y, p[1].x, p[1].y, p[2].x, p[2].y, p[3].x, p[3].y = map(int, input().split())

for i in range(len(p) - 1):
    a = p[i + 1].x - p[i].x
    b = p[i + 1].y - p[i].y
    
    length += math.sqrt((a*a) + (b*b))


print(length)