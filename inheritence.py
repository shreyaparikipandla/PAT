#single level inheritence
class A:
    def message(self):
        print("in class a")
class B(A):
    def message(self):
        print("in class b")
        #A().message()
    super(A).message()#to print the function of parent class or just super() is used
    # or instead of using super keyword we can just call parent class
#multi level inheritence

class C(B):
    def message(self):
        print("in class c")
ob=C()
ob.message()

#hierachial inheritencce 
class D:
    def message(self):
        print("in class d")
class E(D):
    def message(self):
        print("in class e")
class F(D):
    def message(self):
        print("in class f")
dd=F()
dd.message()

#multiple inheritence
class parent1:
    def message(self):
        print("in class a")
class parent2:
    def message(self):
        print("in class b")
class child(parent1,parent2):#whatever parent class we give first itll execute first
    pass 
ob2=child()
ob2.message()
