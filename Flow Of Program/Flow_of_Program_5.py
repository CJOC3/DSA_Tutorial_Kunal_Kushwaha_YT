sum_val = 0

check = 0
while (check == 0):
    num = input("Enter a number: ")
    
    strNum = str(num)
    if (strNum == 'x'):
        check = 1
    else:  
        sum_val += int(num)
print("Total sum is " + str(sum_val))