# 파이썬에서 조작할 수 있는 화면을 만들 때는 표준 라이브러리인 'tkinter'를 사용합니다. 
# tkinter는 GUI 툴킷이라고 하는, 창 위에 버튼이나 라벨을 나열하여 조작할 수 있는 화면을 만들 수 있는 라이브러리 입니다.

import tkinter as tk

root=tk.Tk() #화면을 만든다
root.geometry("200x100") #화면의 크기를 정한다(단위는 픽셀)

lbl=tk.Label(text="LABEL")
btn=tk.Button(text="PUSH")

lbl.pack()
btn.pack()
tk.mainloop() #만든 창을 표시한다