import tkinter as tk # 창을 표시하는 모듈
import tkinter.filedialog as fd # 파일 대화상자를 사용하는 모듈
import PIL.Image # 이미지를 다루는 모듈
import PIL.ImageTk # tkinter로 만든 화면상에 이미지를 표시시키는 모듈

def dispPhoto(path): # 이미지 파일일 표시하는 함수
    # 이미지를 읽어 들이고 회색으로 변환한다.
    newImage=PIL.Image.open(path).convert("L").resize((300,300))
    # 해당 이미지를 라벨에 표시한다
    ImageData=PIL.ImageTk.PhotoImage(newImage)
    imageLabel.configure(image=ImageData)
    imageLabel.image=ImageData

def openFile(): #파일 대화상자를 열기 위한 함수
    fpath=fd.askopenfilename()

    if fpath:
        dispPhoto(fpath)

root=tk.Tk()
root.geometry("400x350")

btn=tk.Button(text="파일 열기", command=openFile)
imageLabel=tk.Label()
btn.pack()
imageLabel.pack()
tk.mainloop()
