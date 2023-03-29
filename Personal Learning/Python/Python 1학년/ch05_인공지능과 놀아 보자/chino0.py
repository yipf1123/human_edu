import tkinter as tk
import tkinter.filedialog as fd
import PIL.Image
import PIL.ImageTk

# 이미지 파일을 수치 리스트로 변환시킨다
def imageToData(filename):
    # 이미지를 8x8의 그레이스케일로 변환
    grayImage = PIL.Image.open(filename).convert("L")
    grayImage = grayImage.resize((8,8),PIL.Image.ANTIALIAS)
    # 해당 이미지를 표시한다.
    dispImage = PIL.ImageTk.PhotoImage(grayImage.resize((300,300)))
    imageLabel.configure(image=dispImage)
    imageLabel.image=dispImage

# 파일 대화상자를 연다
def openFile():
    fpath = fd.askopenfilename()
    if fpath:
        # 이미지 파일을 수치 리스트로 변환한다
        data = imageToData(fpath)
    
# 앱의 창을 만든다
root = tk.Tk()
root.geometry("400x400")

btn = tk.Button(root, text = "파일 열기", command = openFile )
imageLabel=tk.Label()

btn.pack()
imageLabel.pack()

tk.mainloop()