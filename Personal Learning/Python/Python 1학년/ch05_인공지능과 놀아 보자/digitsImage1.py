import sklearn.datasets
import matplotlib.pyplot as plt

digits = sklearn.datasets.load_digits()

plt.imshow(digits.images[0], cmap="Greys") #수치 데이터를 회색의 농담 이미지로 만든다
plt.show()