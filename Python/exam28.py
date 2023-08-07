# 연습문제 (32.4)
# files = ['font', '1.png', '10.jpg', '11.gif', '2.jpg', '3.png', 'table.xslx', 'spec.docx']

# print(list(filter(lambda x: x.find('.jpg') != -1 or x.find('.png') != -1, files)))

# 삼사문제
files = input().split()
print(list(map(lambda x: '9' + x if len(x) < 8 else x, files)))