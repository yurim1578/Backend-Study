# 춘향이는 편의점 카운터에서 일한다.
# 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
# 동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
# 예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 
# 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.


def solution(cash : int):
    remained_five = cash % 5

    if cash == 1 or cash == 3 :
        return -1
    elif remained_five % 2 == 0 :
        change = ((cash // 5) + (remained_five // 2))
        return change
    else :
        change = ((cash // 5) - 1) + ((remained_five + 5) // 2)
        return change
        

print(solution(18))

cash = int(input())
remained_five = cash % 5

if cash == 1 or cash == 3 :
    print(-1)
elif remained_five % 2 == 0 :
    change = ((cash // 5) + (remained_five // 2))
    print(change)
else :
    change = ((cash // 5) - 1) + ((remained_five + 5) // 2)
    print(change)

'''
1 = 0
2 = t,1
3 = 0
4 = t,2
5 = f,1
6 = t,3
7 = f,1 t,1
8 = t,4
9 = f,1 t,2
10 = f,2
11 = f,1 t,3
12 = f,2 t,1
13 = f,1 t,4
14 = f,2 t,2
15 = f,3
16 = f,2 t,3
17 = f,2 t,2


'''
