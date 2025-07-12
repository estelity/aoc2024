# day 3 pt 1

def findDo(i, input):
    if input[i:i+4] == "do()":
        return True
    else:
        return False

def findDont(i, input):
    if input[i:i+7] == "don't()":
        return True
    else:
        return False

with open('/Users/grace.shen/Personal/aoc2024/day3/day3input.txt') as file:
    input = file.read()

valid = []
on = True

for i in range(len(input) - 3):
    product = 1
    length = 0

    if findDo(i, input):
        on = True
    if findDont(i, input):
        on = False

    if not on:
        continue

    # mul(8,9)
    if input[i:i+4] == "mul(":
        length = 4
        if not input[i+length].isdigit():
            continue
        while (input[i+length].isdigit()):
            length += 1
        product *= int(input[i+4:i+length])
        commaIndex = i + length
        if input[i+length] != ',':
            continue
        length += 1
        if not input[i+length].isdigit():
            continue
        while (input[i+length].isdigit()):
            length += 1
        product *= int(input[commaIndex+1:i+length])
        if input[i+length] != ')':
            continue
        valid.append(product)
        
totalSum = 0
for int in valid:
    totalSum += int

print(totalSum)