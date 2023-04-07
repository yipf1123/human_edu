install.packages("ggplot2")
library(ggplot2)

iris = iris

# 데이터 구조
str(iris)

# 데이터 시각화
ggplot(data = iris,
        aes(x= Sepal.Length,
            y=Petal.Width))+
    geom_point() +
    # 옵션
    theme_bw() + #흰색 배경에 검은색 테두리와 흑백으로 구성
    xlim(0,20) +
    ylim(0,5)
# mpg 데이터 가져오기
data()
mpg = mpg
str(mpg)

ggplot(mpg,aes(x =displ,
               y =cty)) +
  geom_point(alpha = 0.3, shape=3) +
  theme_bw()

table(mpg$cyl) #변수(열)의 값들을 세어서 테이블 형태로 반환하는 함수

# Facets
# 그래프를 세부적으로 분리
ggplot(data= mpg, aes(x = displ, y = hwy, color = trans)) +
  geom_point(size=2) +
  facet_wrap(~ manufacturer, nrow = 3) +   
  #열의 고유값을 기준으로 서브플롯을 생성하고, 
  #한 행당 3개의 서브플롯을 배치하는 것 
  # 서브플롯(Subplot)은 하나의 큰 그래프 영역 안에
  # 작은 그래프들을 배치하여 여러 개의 그래프를 한번에 보여줄 수 있는 그래프        
  theme_bw()

table(mpg$manufacturer)

ggplot(data = mpg) +
  geom_smooth(aes(x = displ, y = hwy))

ggplot(data = mpg) +
  geom_boxplot(aes(x = class, y = hwy))
