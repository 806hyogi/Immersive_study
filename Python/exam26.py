# 연습문제 (30.6)
# korean, english, mathematics, science = 100, 86, 81, 91

# def get_max_score(*args):
#     return max(args)

# max_score = get_max_score(korean, english, mathematics, science)
# print('높은 점수:', max_score)
 
# max_score = get_max_score(english, science)
# print('높은 점수:', max_score)

# 삼사문제
korean, english, mathematics, science = map(int, input().split())

def get_min_max_score(*args):
    return min(args), max(args)

def get_averge(**args):
    j = 0
    for i in args.values():
        j += i
    return j / len(args)


min_score, max_score = get_min_max_score(korean, english, mathematics, science)
average_score = get_averge(korean = korean, english = english, mathematics = mathematics, science = science)
print('낮은 점수: {0:.2f}, 높은 점수: {1:.2f}, 평균 점수: {2:.2f}'.format(min_score, max_score, average_score))

min_score, max_score = get_min_max_score(english, science)
average_score = get_averge(english = english, science = science)
print('낮은 점수: {0:.2f}, 높은 점수: {1:.2f}, 평균 점수: {2:.2f}'.format(min_score, max_score, average_score))
