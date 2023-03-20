from turtle import*
shape("turtle")
col=["orange","limegreen","gold","plum","tomato"]
for i in range(5):
    color(col[i])
    circle(100) #지름이 100인 원을 그린다
    left(72)
done()
