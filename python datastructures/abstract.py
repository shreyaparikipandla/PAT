#in python we dont have abstract keyword, we have to import 

from abc import ABC,abstractmethod #importing abstarct class and method

#class example inheriting ABC class 
class Example(ABC): # abstract class 
    @abstractmethod #used to specify what it is dng 
    def m1(self):
        pass 
    #even if we write body itll not execute as abstract methods shldnt define anything but still it
    #doesnt throw any error
class student(Example):
    def m1(self):
        print("hello")
    
# if we want to create objects we can create another class inheriting abstract class and 
# create objects with it 
ob1=student()
ob1.m1()
