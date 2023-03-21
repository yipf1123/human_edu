import tkinter as tk

def dispLabel():
    lbl.configure(text="안녕하세요") #라벨의 문자를 "안녕하세요"로 변경한다

root=tk.Tk()
root.geometry("200x100") 

lbl=tk.Label(text="LABEL") # 라벨
btn=tk.Button(text="PUSH", command=dispLabel) # 함수를 실행하도록 버튼 수정

lbl.pack() # 배치순서 : lbl - btn
btn.pack()
tk.mainloop() #만든 화면을 보여주는 명령