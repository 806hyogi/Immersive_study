# 연습문제 23.6
a = [[[0 for col in range(3)] for row in range(4)] for depth in range(2)]
 
print(a)

# 자뢰찾기
def boomCheck(row: int, col: int) -> int:
    cnt = 0
    for colGap in range(-1, 2):
        for rowGap in range(-1, 2):
            if 0 <= col + colGap < len(matrix[row]) and 0 <= row + rowGap < len(matrix):
                if matrix[row + rowGap][col + colGap] == "*":
                    cnt += 1
    return cnt


if __name__ == "__main__":
    matrix = []
    cols, rows = map(int, input().split())
    for i in range(rows):
        matrix.append(list(input()))

    for row in range(rows):
        for col in range(cols):
            if matrix[row][col] == ".":
                boomCnt = boomCheck(row, col)
                print(boomCnt, end="")
            else:
                print(matrix[row][col], end="")
        print()
