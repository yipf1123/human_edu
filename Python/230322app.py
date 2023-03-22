# -*- coding:utf-8 -*-
import streamlit as st
import pandas as pd
import calendar 
import datetime
from PIL import Image

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
  
    # color  = st.select_slider('색상 선택:',
    #                             options = ['노란색', '빨간색', '파란색', '검정색', '흰색'],
    #                             value = ("노란색", "흰색"))
    # st.write(color)
  
    start_color, end_color  = st.select_slider('색상 선택:',
                                options = ['노란색', '빨간색', '파란색', '검정색', '흰색'],
                                value = ("노란색", "흰색"))
    st.write(start_color, end_color)

## 멀티 미디어 파일
    img = Image.open('data/image_03.jpg')
    st.image(img)

    img_url = 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAzMjRfMTE0%2FMDAxNjQ4MTE5MDQ2NTUy.aGK-kSYKJJB0ahEVfQdH4VYx06Gu6Eg6paHF4AZnY5Mg.lIOUHDKnk2fTm5fw8HV_u_olmOWfw_bDeQwk2L2cp5Mg.JPEG.olivia_1005%2F6F9D362B-4B6D-4186-A8CF-B3B1D51703C0.jpg&type=sc960_832'
    st.image(img_url)

    # 비디오 출력
    # 컨텍스트 매니저 :  with 블록 안에서 리소스를 안전하게 열고 사용한 뒤,
    #                  블록을 벗어나면 자동으로 리소스를 닫아줍니다. 
    #                  이는 코드의 간결성과 에러 처리를 보다 효율적으로 할 수 있도록 도와줌
    with open('data/secret_of_success.mp4', 'rb') as rb:
        video_file = rb.read()
        st.video(video_file, start_time = 1)
    # rb :바이너리 모드(Binary mode)는 파일을 byte 단위로 처리하는 모드

    # 오디오 출력
    with open('data/song.mp3', 'rb') as rb:
        audio_file = rb.read()
        st.audio(audio_file, format="audio/mp3", start_time = 60)

    # 유튜브 비디오 출력
    st.video('https://youtu.be/90QOWMQm0S0')

    # text
    fname = st.text_input('입력해주세요')
    st.title(fname)

    message = st.text_area('입력해주세요', height=300, value='Hello, world!')
    st.write(message)

    nums = st.number_input('숫자 입력')
    st.write(nums)

    mytime = st.time_input('시간')
    st.write(mytime)

    # color Picker
    color = st.color_picker('색상 선택')
    st.write(color)

if __name__ == "__main__":
    main()