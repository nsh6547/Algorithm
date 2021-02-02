switch_num =input()
switch_info=list(map(int ,input().split(' ')))
stu_num = int(input())
stu_info=[]

for _ in range(stu_num):
    stu= list(map(int,input().split(' ')))
    stu_info.append(stu)
for x in range(len(stu_info)):
    if stu_info[x][0]==1:
        for y in range(len(switch_info)):

            if ((y+1) % stu_info[x][1]) ==0:
                if switch_info[y] ==0 :
                    switch_info[y] =1
                else:
                    switch_info[y] =0
        print(switch_info)
    else:
        if switch_info[stu_info[x][1]-1] == 0:
            switch_info[stu_info[x][1]-1] = 1
        else:
            switch_info[stu_info[x][1]-1] = 0
        left= stu_info[x][1]-2
        right=stu_info[x][1]
        while(left >=0 and (right <= len(switch_info)-1) and switch_info[left]==switch_info[right]):
            if switch_info[left] == 0:
                switch_info[left] = 1
            else:
                switch_info[left] = 0

            if switch_info[right] == 0:
                switch_info[right] = 1
            else:
                switch_info[right] = 0
            left -= 1
            right += 1
cnt=1
for x in switch_info:
    print(x,end='')
    if cnt<len(switch_info):
        print(' ', end='')
    if(cnt%20==0):
        print('')
    cnt += 1