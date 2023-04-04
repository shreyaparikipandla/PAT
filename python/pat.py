class Student:
    def __init__(self):
        self.arr=[]
    '''if we dont give self.arr=[]-empty list 
    deep copying occurs -which means whatever we do to ob the ob1 will change too
    [1, 2, 3]
    [1, 2, 3, 10]'''
    '''we can overcome but using self and copy() method '''
    '''def __init__(self,name):
        self.name=name
    def printname(self):
        print(self.name)'''
    def addele(self,value):
        self.arr.append(value)
    def printarr(self):
        print(self.arr)
'''ob=Student("shreya")
ob1=Student("pragna")'''
ob=Student()
ob.addele(1)
ob.addele(2)
ob.addele(3)
ob.printarr()
ob1=Student()
ob1.addele(10)
ob1.printarr()
ob3=Student()
ob3.addele(88)
ob3.printarr()