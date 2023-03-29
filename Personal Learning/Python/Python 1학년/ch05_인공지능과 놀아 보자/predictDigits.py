import sklearn.datasets
import sklearn.svm
import PIL.Image
import numpy

# 이미지 파일을 수치 리스트로 변환한다
def imageToData(filename):
    # 이미지를 8x8  그레이스케일로 변환
    grayImage = PIL.Image.open(filename).convert("L")
    grayImage = grayImage.resize((8,8),PIL.Image.ANTIALIAS) 
    # PIL.Image.ANTIALIAS : 미지를 리사이징할 때, 보다 부드럽고 자연스러운 결과물을 얻을 수 있음
    # 수치 리스트로 변환
    numImage = numpy.asarray(grayImage, dtype=float) # 255(흰색) ~ 0
    numImage = numpy.floor(16 - 16 *(numImage/256)) # 0(흰색) ~ 15
    numImage = numImage.flatten()

    return numImage

# 숫자를 예측한다
def predictDigits(data):
    #학습용 데이터를 읽어 들인다
    digits = sklearn.datasets.load_digits()
    #머신러닝을 한다
    clf = sklearn.svm.SVC(gamma=0.001)
    clf.fit(digits.data, digits.target)
    #예측 결과를 표시한다
    n = clf.predict([data])
    print("예측=", n)

# 이미지 파일을 수치 리스트로 변환한다
data = imageToData("C:\\Users\\les80\\Desktop\\human_edu\\Personal Learning\\Python\\Python 1학년\\ch05_인공지능과 놀아 보자\\2.png")
# 백슬래시(\)는 특수한 기능을 하는 이스케이프문자로 사용 --> 역슬래시 두개 연달아 써서 역슬래시 기능을 무효화 하고 문자열로 사용하기
# OR  파일명 앞에 r사용하기
# data = imageToData(r"C:\Users\les80\Desktop\human_edu\Personal Learning\Python\Python 1학년\ch05_인공지능과 놀아 보자\2.png")

# 숫자를 예측한다
predictDigits(data)