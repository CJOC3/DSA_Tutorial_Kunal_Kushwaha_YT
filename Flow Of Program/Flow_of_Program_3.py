num = int(input("Enter a number and get its multiplication table: "))
c = 1 
while (c <= 10):
    res = num * c 
    print(str(num) + " x " + str(c) + " = " + str(res))
    c += 1