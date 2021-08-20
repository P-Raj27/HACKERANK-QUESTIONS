# PROBLEM LINK :  https://www.hackerrank.com/challenges/sparse-arrays/problem


def matchingStrings(strings, queries):
    result = []
    hmap = {}
    for s in strings: # initializing the map
        hmap[s] = 0

    for x in strings: # counting the occurence
        hmap[x] +=1

    for q in queries: 
    # checking if query is present,  then get its value since query = key
        if q in list(hmap.keys()):
            result.append(hmap[q])
        else:
            result.append(0)
    return(result)
