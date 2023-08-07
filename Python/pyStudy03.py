
def calc():
    num1 = float(input("num1: "))
    op = input("연산자 입력: ")
    num2 = float(input("num2: "))

    if(op == "+"):
        result = num1 + num2
    elif(op == "-"):
        result = num1 - num2
    elif(op == "*"):
        result = num1 - num2
    elif(op == "/"):
        result = num1 - num2
    else:
        print("0으로 나눌 수 없습니다.")
        return
    
    print(f"결과: {result}")

calc()