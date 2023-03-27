# -*- coding:utf-8 -*-

def sum(a, b):
    """ 숫자의 합을 수하는 함수입니다.
    Args:
        a(int) : 숫자
        b(int) : 숫자
    Returns:
        int
    """
    c = a + b
    return c

if __name__ == "__main__":
    a = [1, 2]
    b = [3, 4]
    result = sum(a, b)
    print(result)

    docstring = sum.__doc__
    border = '#' * 20
    print('{}\n{}\n'.format(border, docstring, border))

'''
docstring은 책의 목차와 비슷함. 
함수나 클래스, 모듈 등의 코드 블록에 대한 설명을 제공하는 문자열
이 문자열은 함수나 클래스의 첫 번째 행에 작성되며, 이 행은 항상 문자열 리터럴로 시작해야 함
코드의 가독성을 높이고 다른 개발자들이 코드를 이해하고 사용하는데 도움을 줌
''' 