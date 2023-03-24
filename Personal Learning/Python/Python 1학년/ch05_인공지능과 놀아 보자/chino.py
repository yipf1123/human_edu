import tkinter as tk
import tkinter.filedialog as fd
import PIL.Image
import PIL.ImageTk
#머신러닝에서 사용하는 모듈
import sklearn.datasets
import sklearn.svm
import numpy

# 이미지 파일을 수치 리스트로 변환시킨다
def imageToData(filename):
    # 이미지를 8x8의 그레이스케일로 변환
    grayImage = PIL.Image.open(filename).convert("L")
    grayImage = grayImage.resize((8,8),PIL.Image.ANTIALIAS)
    # 해당 이미지를 표시한다.
    dispImage = PIL.ImageTk.PhotoImage(grayImage.resize((300,300)))
    imageLabel.configure(image=dispImage)
    imageLabel.image=dispImage
    #수치 리스트로 변환
    numImage = numpy.asarray(grayImage, dtype=float)
    numImage = numpy.floor(16 -16 * (numImage/256))
    numImage = numImage.flatten()
    return numImage

def predictDigits(data):
    # 학습용 데이터를 읽어 들인다
    digits = sklearn.datasets.load_digits()
    # 머신러닝을 한다
    clf = sklearn.svm.SVC(gamma=0.001)
    clf.fit(digits.data, digits.target)
    #예측 결과를 표시한다
    n = clf.predict([data])
    textLabel.configure(text = "이 그림은" + str(n) + "입니다!")


# 파일 대화상자를 연다
def openFile():
    fpath = fd.askopenfilename()
    if fpath:
        # 이미지 파일을 수치 리스트로 변환한다
        data = imageToData(fpath)
        predictDigits(data)
    
# 앱의 창을 만든다
root = tk.Tk()
root.geometry("400x400")

btn = tk.Button(root, text = "파일 열기", command = openFile )
imageLabel=tk.Label()
btn.pack()
imageLabel.pack()

#예측 결과를 표시하는 라벨
textLabel=tk.Label(text ="손글씨 숫자를 인식합니다!")
textLabel.pack()                   

tk.mainloop()