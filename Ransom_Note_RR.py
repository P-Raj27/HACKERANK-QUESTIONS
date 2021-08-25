from collections import defaultdict
def checkMagazine(magazine, note):  # using default dict 
    d =defaultdict(int)
    for word in magazine:
        if word in d:
            d[word]+=1
        else:
            d[word]=1

# if the word in note is present in hashmap (d) then decrement it by one and set flag = True and once its value is< 1 flag is set to zero
    for x in note:
        if (x in d ) and d[x]>0:
            d[x]-=1
            flag = True
        else:
            flag= False
            break

    if flag:
        print('Yes')
    else:
        print('No')
