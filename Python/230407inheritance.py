# -*- coding: utf-8 -*-
# 상속(Inheritance)은 
# 이미 정의된 클래스(부모 클래스)의 모든 속성과 메서드를
# 자식 클래스가 물려받는 것을 말합니다. (확장의 개념)
class Employee :

    def __init__(self, name, tip =30000):
        self.name = name
        self.tip =tip

    def sum_tip(self, amount):
        self.tip += amount
        return self.tip
    
class Manager(Employee):

    def __int__(self, name, tip = 50000, project=None):
        Employee.__init__(self, name, tip)
        self.project = project

    def display(self):
        print("Manager", self.name)
    
    
    def sum_tip(self, amount = 0, bonus = 2):
        if amount > 0 :
            Employee.sum_tip(self, amount*bonus)

        else :
            Employee.sum_tip(self, amount)

if __name__ == "__main__":
    mng =Manager("enshu")
    print(mng.name) # enshu
    mng.display() # Manager enshu
    print(mng.tip)
    mng.sum_tip(2000)
    print(mng.tip)
    