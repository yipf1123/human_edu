import sklearn.datasets

digits=sklearn.datasets.load_digits()

print("데이터의 개수=",len(digits.images))
print("이미지 데이터=",digits.images[0])
print("무슨 숫자인가=",digits.target[0])

