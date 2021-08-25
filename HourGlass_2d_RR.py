def hourglassSum(arr):
    mx = -64
    row = 0
    col = 0
    while row < 4 :
        temp = arr[row][col] + arr[row][col+1]+arr[row][col+2]+arr[row+1][col+1] + arr[row+2][col]+arr[row+2][col+1]+ arr[row+2][col+2]
        if temp > mx:
            mx = temp
        col +=1
        if col == 4:
            col = 0
            row +=1
    return mx
