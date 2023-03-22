# -*- coding:utf-8 -*-
import streamlit as st
import pandas as pd
import calendar 
import datetime

def main():
    """코드작성"""

    st.title("Hello World")

    st.text('this is {}'.format('good'))

    st.header('This is header')
    
    st.subheader('This is sub Header')

    st.markdown('## This Markdown Header')

    # Colored Text
    st.success('성공')
    st.warning('위험함')
    st.info('This is infomation')
    st.error('This is an error')
    st.exception('This is an exception')

    # 슈퍼펑션 : 코드를 치는 것처럼 나옴
    st.write(1+1)
    st.write(type("normal"))

    a=1
    b=2
    c =a+b
    st.write(c)

    st.write(dir(str))
    st.help(range)

    iris = pd.read_csv("data/iris.csv")
    st.dataframe(iris, 2000, 100)
    #st.dataframe(data=None, width=None, height=None)

    # 색상 추가
    st.title('Adding Color on Table')
    st.dataframe(iris.style.highlight_max(axis=0))
    #axis=0 index

    # static tabel show
    st.table(iris.head(30))

    # st.write
    st.write(iris)  

    # 나의 코드 보여주기
    myCode = """
    def hello():
        print("Hello World!")
    """
    st.code(myCode, language = 'Python')

    # Widgets, 버튼, 체크박스
    name = "Enshu"

    if st.button('Submit'):
        st.write(f'name : {name.upper()}')

    if st.button('Submit', key = 'new02'):
        st.write(f'name : {name.lower()}')

    # Radio button
    status = st.radio("Status", ("활성화", "비활성화"))
  
    if status == '활성화':
        st.write("만나서 반갑습니다")
    elif status == '비활성화':
        st.write("활성화를 해주세요")
    else:
        pass
    
    # Check Box
    # df = pd.DataFrame(calendar.month(23,3))
    if st.checkbox('생일을 선택하기'):
        #  now = datetime.now()
        #  year = now.year
        #  month = now.month
        #  st.write(calendar.month(year, month))
        
        d = st.date_input(
            "When\'s your birthday",
            datetime.date(2019, 7, 6))
        st.write('Your birthday is:', d)
        
        # st.dataframe(df, 200, 200)
        # st.dataframe(calendar.month(23,3), 200, 200)
        #st.write(calendar.month(23,3))

    # selectbox
    programings= ['Python','Java', 'HTML', 'CSS', 'JS']
    choice = st.selectbox('프로그래밍언어:', programings)
    st.write(f'{choice} 언어를 선택함')

    # Multiple Selection
    spoken_lang = ("영어", "일본어", "중국어", "독일어")
    mylangchoice = st.multiselect("언어 선택", spoken_lang, default = "영어")
    st.write("선택", mylangchoice)

    # Slider
    age = st.slider('나이', 1, 120)
    st.write(age)

    # 범위를 양 끝으로 움직일 수 있음
    '''
    color  = st.select_slider('색상 선택:',
                                options = ['노란색', '빨간색', '파란색', '검정색', '흰색'],
                                value = ("노란색", "흰색"))
    st.write(color)
    '''
    start_color, end_color  = st.select_slider('색상 선택:',
                                options = ['노란색', '빨간색', '파란색', '검정색', '흰색'],
                                value = ("노란색", "흰색"))
    st.write(start_color, end_color)


if __name__ == "__main__":
    main()