import sklearn.datasets
import matplotlib.pyplot as plt

digits = sklearn.datasets.load_digits()

for i in range(50):     
    plt.subplot(5, 10, i+1)         # 5x10으로 순서대로 표시한다
    plt.axis("off")                 # 아웃라인을 비표시로 한다
    plt.title(digits.target[i])     # 이 숫자는 무엇인가?
    plt.imshow(digits.images[i], cmap="Greys")
plt.show()