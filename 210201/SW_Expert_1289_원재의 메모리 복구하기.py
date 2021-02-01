T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    cnt=0
    bit=input()

    if bit[0]=='1' :
        cnt+=1
    for x in range(len(bit)-1):
        if bit[x]==bit[x+1]:
            continue
        else:
            cnt+=1
    print("#"+str(test_case)+" "+str(cnt))