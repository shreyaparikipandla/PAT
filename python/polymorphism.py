#method overriding-run time 
#method loading in python only accepts the latest definition of a func 
class A:
    def message(self):
        print("message")
    def message(self,data):
        print("message with the data")
#when we give 2 functions with the same name the second function overrides the first func and 
#it executes 2nd func 
#if we give ob.message() itll give error as the first func is overrided
ob=A()
ob.message(10)

class B:
    def message(self,data):
        print("message with the data")
    def message(self):
        print("message")
ob1=B()
ob1.message()
