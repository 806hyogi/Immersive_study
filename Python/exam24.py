#연습문제 (28.3)

# n = int(input())
# text = input()
# words = text.split()
 
# if (len(words) < n):
#     print('wrong')
# else:
#     n_gram = zip(*[words[i:] for i in range(n)])
#     for i in n_gram:
#         print(i)

#심사문제
with open('words.txt', 'r') as file:
    lines = file.readlines()
    
    for line in lines:
        line = line.strip('\n')
    
        if(line == line[::-1]):
            print(line)
        
    