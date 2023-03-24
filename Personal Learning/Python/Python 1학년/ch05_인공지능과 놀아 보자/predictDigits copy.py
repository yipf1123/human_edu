import sklearn.datasets
import sklearn.svm
import PIL.Image 
import numpy

# 이미지 파일을 수치 리스트로 변환한다
def imageToData(filename):
    # 이미지를 8×8의 그레이스케일로 변환
    grayImage = PIL.Image.open(filename).convert("L")
    grayImage = grayImage.resize((8,8),PIL.Image.ANTIALIAS)
    # 수치 리스트로 변환
    numImage = numpy.asarray(grayImage, dtype = float)
    numImage = numpy.floor(16 - 16 * (numImage / 256))
    numImage = numImage.flatten()

    return numImage

# 숫자를 예측한다
def predictDigits(data):
    # 학습용 데이터를 읽어 들인다
    digits = sklearn.datasets.load_digits()
    # 머신러닝(기계학습)을 한다
    clf = sklearn.svm.SVC(gamma = 0.001)
    clf.fit(digits.data, digits.target)
    # 예측 결과를 표시한다
    n = clf.predict([data])
    print("예측=",n)

# 이미지 파일을 수치 리스트로 변환한다
data = imageToData("2.png")
# 숫자를 예측한다
predictDigits(data)