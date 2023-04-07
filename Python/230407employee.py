# -*- coding: utf-8 -*-

# 레스토랑
class Employee:

    # init
    def __init__(self, name, tip =0) :
        
        # 이름과, tip 변수 정의
        self.name = name

        # 조건문 추가
        if tip >= 0:
            self.tip = tip
        else:
            self.tip = 0
            print("0이하는 그냥 0원으로 처리할게요..")
    
    # 클래스 메서드
    def sum_tip(self, amount):
        self.tip += amount
    
    def weekly_tip(self):
        return self.tip / 7
    
if __name__ == "__main__":
    emp1 = Employee("enshu", -50000)
    # emp2 = Employee("jeonghwan", 50000)
    # print(emp1.name, emp1.tip)
    # print(emp2.name, emp2.tip)
    #클래스 내부의 매개변수를 강제로 재정의
    emp1.tip = emp1.tip + 2000
    emp1.sum_tip(3000)
    emp1.sum_tip(8000)
    result = emp1.weekly_tip()
    print(result)
    