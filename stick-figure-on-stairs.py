# Number of stairs
kStairCount = 10

def printStickFigure(spaces):
   spaces *= 5
   padding =  " " * spaces + " "
   end = " " * ((kStairCount-1) * 5 - spaces) 
   end += "*"
   print(padding + " o  ******" + end)
   print(padding + "/|\ *     " + end)
   print(padding + "/ \ *     " + end)

for i in range(kStairCount-1, -1, -1):
   printStickFigure(i)

print("*" * (5 * kStairCount + 7))
