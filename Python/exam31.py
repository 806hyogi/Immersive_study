# 연습문제 (35.5)
# class Date:
#     @staticmethod
#     def is_date_valid(str):
#         year, month, day = map(int, str.split('-'))
#         return month <= 12 and day <= 31

# if Date.is_date_valid('2000-12-31'):
#     print('올바른 날짜 형식입니다.')
# else:
#     print('잘못된 날짜 형식입니다.')

# 심사문제
class Time:
    def __init__(self, hour, minute, second):
        self.hour = hour
        self.minute = minute
        self.second = second
    
    def is_time_valid(time_string):
        hour, minute, second = map(int, time_string.split(':'))
        if hour <= 24 and minute <= 59 and second <= 60:
            return True
        else:
            return False
    
    @classmethod
    def from_String(cl, time_String):
        cl.hour, cl.minute, cl.second = list(map(int, time_string.split(":")))
        re = cl(cl.hour, cl.minute, cl.second)
        return re


time_string = input()

if Time.is_time_valid(time_string):
    t = Time.from_String(time_string)
    print(t.hour, t.minute, t.second)
else:
    print('잘못된 날짜 형식입니다.')
    