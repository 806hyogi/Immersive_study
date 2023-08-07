# 연습문제 (38.6)
try:
    file = open('maria.txt', 'r')
except FileNotFoundError:
    print('파일이 없습니다.')
else:
    s = file.read()
    file.close()

# 심사문제

class NotPalindromeError(Exception):
    def __init__(self):
        super().__init__("회문이 아닙니다.")

def palindrome(word):
    is_palindrome = True
    for i in range(len(word) // 2):
        if word[i] != word[-1 - i]:
            is_palindrome = False
            break
    if is_palindrome == True:
        print(word)
    else:
        raise NotPalindromeError


try:
    word = input()
    palindrome(word)
except NotPalindromeError as e:
    print(e)