#연습문제 (27.5)
# with open('words.txt', 'r') as file:
                           
#     count = 0
#     words = file.readlines()           
#     for word in words:
#         if len(word.strip('\n')) <= 10: #읽어온 문자열에서 \n을 삭제
#             count += 1        
#     print(count)

#심사문제

with open('words.txt', 'r') as file:
    words = file.readline().split()
    for word in words:
        if 'c' in word:
            print(word.strip('\n,.'))

