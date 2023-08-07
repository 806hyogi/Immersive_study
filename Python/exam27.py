# 연습문제 (31.4)
# def is_pallindrome(word):

#     if len(word) < 2:
#         return True
#     if word[0] != word[-1]:
#         return False
#     return is_pallindrome

# print(is_pallindrome('hello'))
# print(is_pallindrome('level'))

# 심사문제

def fib(n):
    if n <= 1:
        return n
    else:
        return fib(n-1) + fib(n-2)

n = int(input())
print(fib(n))