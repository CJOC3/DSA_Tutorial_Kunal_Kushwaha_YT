x = int(input("Enter a number to get HCF and LCM: "))
y = int(input("Enter another number to get HCF and LCM: "))


#HCF by division method
#https://www.cuemath.com/numbers/hcf-highest-common-factor/
foundHCF = 0
foundLCM = 0
c = 1

if (x < y):
    dividend, high_num = y
    divisor = x
    high_num = y
    small_num = x
else:
    dividend = x
    divisor = y
    high_num = x
    small_num = y
    
while (foundHCF == 0):
    rem = dividend % divisor
    if (rem == 0):
        HCF = divisor
        foundHCF = 1
    dividend = divisor
    divisor = rem
    
print("HCF: "+ str(HCF))

#https://prepinsta.com/lcm/tips-and-tricks-and-shortcuts/
while (foundLCM == 0):
    # print(high_num)
    # print(small_num)

    # print(c)
    
    high_num_multiple = high_num * c
    # print(high_num_multiple)
    
    if (high_num_multiple % small_num == 0):
        LCM  = high_num_multiple
        foundLCM = 1
    c += 1

print("LCM: " + str(LCM))