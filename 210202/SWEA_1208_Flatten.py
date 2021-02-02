
for tc in range(10):
    max, min =0,101
    dump =int(input())
    box_list=list(map(int,input().split()))

    for x in range(len(box_list)):
        if box_list[x]<min:
            min = box_list[x]
        if box_list[x]>max:
            max = box_list[x]
    for _ in range(dump):
        for x in range(len(box_list)):
            if box_list[x] ==min:
                box_list[x]+=1
                min+=1
                break;

        for x in range(len(box_list)):
            if box_list[x] ==max:
                box_list[x]-=1
                max-=1
                break;
        for x in range(len(box_list)):
            if box_list[x]<min :
                min = box_list[x]
        for x in range(len(box_list)):
            if box_list[x]> max :
                max = box_list[x]
    print("#"+str(tc+1)+" "+str(max-min))

