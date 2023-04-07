# -*- coding: utf-8 -*-

# 클래스(docstring)은 Python 클래스의 첫 번째 문장에 작성된 문자열입니다.
# 클래스에 대한 설명과 클래스의 기능, 사용 방법, 매개 변수, 반환 값 등과 같은
# 중요한 정보를 포함
class Person :
    """
    사람을 표현하는 클래스
    
    '''
    
    Attributes
    ----------
    name : str
        name of the person
    
    age : int
        age of the person
    
    
    Methods
    ----------
    info(extrainfo = ""):
        print the person's name, age and etc    
    """

    def __init__(self, name, age) :
        """
        Constructs all the necessary attributes for the person object

        Parameters
        __________
           name : str
                name of the person
    
            age : int
                age of the person 
        """
        self.name = name # 외부에서 입력된 name이, 클래스 내부의 변수(self.name)로 저장
        self.age = age # 
    
    def info(self, extrainfo=None):
        """
        Print the person's name, age and etc

        If the parameter extrainfo is passed, then it is appedned to ...
        
        Parameters
        __________
           extrainfo : str
                More info to be written(Default i More)

                
        Return
        ---------
        None
        """

        print(f'내 이름은 {self.name}. 내 나이는 {self.age}임'+ str(extrainfo))
    


if __name__ == "__main__":
    human1 = Person("enshu", age =32)
    human1.info("나의 직장은 휴먼")
    print(Person.__doc__)
    help(Person)
    