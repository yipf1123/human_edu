library(dplyr) #데이터 가공 및 전처리를 위한 패키지

install.packages("tidyverse")
# 데이터를 처리하고 시각화하는데 사용되며,
# 이를 통해 데이터 과학, 통계, 기계 학습 등 다양한 분야에서 데이터 분석을 수행
help(lm)
# lm : 선형 회귀 분석(linear regression analysis)을 수행하기 위해 사용

result = 1 / 20 * 30
result1 <- 1 / 20 * 30

# vector : 다양한 데이터 타입을 담을 수 있지만, 
#          동일한 데이터 타입의 값들로만 구성됨

char_vector <- c('A','B','C')
class(char_vector)

char_vector

#c() 함수는 여러 값을 하나의 벡터로 묶어
city <- c("서울","부산","서울","부산")
class(city)

# factor() 함수는 범주형 변수를 생성할 때 사용
# 범주형 변수란, 몇 개의 고유한 값으로 이루어진 변수
city <- factor(c("서울","부산","서울","부산"))
class(city)
city
# dplyr SQL 문법과 유사한게 많음

install.packages("nycflights13") #뉴욕시(NYC)의 2013년 항공편 정보를 담고 있는 데이터셋

library(nycflights13)
library(dplyr)

flights = nycflights13::flights
#nycflights13 패키지에서 제공하는 flights 데이터셋을 불러오는 코드
# :: 연산자는 패키지 내에서 특정 함수나 데이터에 접근할 때 사용하는 연산자로,
# 왼쪽에 패키지명을 적고 오른쪽에 함수나 데이터명을 적어주면 됨
glimpse(flights) #데이터셋의 구조와 내용을 요약하여 출력
# str()함수는 데이터셋의 구조와 내용을 모두 출력


# select(): 데이터에서 열(column)을 선택하거나 제외합니다.
# python flights.groupby.....
#SELECT FROM WHERE 필드명 IN ()
flights %>%
  select(year, month, day, carrier, distance) %>%
  #select(): 데이터에서 열(column)을 선택하거나 제외합니다.
  filter(distance >= 1400 & carrier %in% c( "UA", "AA", "B6")) %>%
  #filter(): 데이터를 조건에 따라 필터링합니다.
  group_by(carrier) %>%
  #group_by(): 데이터를 그룹화합니다.
  summarise(avg_distance = mean(distance)) %>%
  #summarise(): 데이터를 집계하여 요약합니다.
  arrange(desc(avg_distance)) %>%
  # desc 내림차순
  filter(avg_distance >= 2100)    

# 결측치 다루기
NA > 10 # NA --> 난 모름

NA == 5 # NA --> 난 모름

NA + 100 # NA --> 난 모름

NA * 100 # NA --> 난 모름

NA == NA # NA --> 난 모름
# NA를 포함한 벡터의 합을 구하면 결과가 NA가 됩니다.
# 이러한 문제를 피하기 위해 sum() 함수 등을 사용할 때
# na.rm=TRUE 옵션을 지정하여 NA를 제외하고 계산할 수 있습니다.

a = NA
is.na(a)
#변수 a가 NA인지 아닌지 논리값(TRUE 또는 FALSE)을 반환

temp <- tibble(x = c(1,2,NA,4))
#tibble을 이용하여 변수 x를 가지는 데이터프레임을 생성
temp

# filter
temp %>% filter(x > 1)

# filter, 꼭 반드시 NA도 같이 출력이 되어야 함
temp %>% filter( x > 1 | is.na(x))
temp %>% filter(is.na(x))

# SELECT문 다시보기
glimpse(flights)
flights %>%
  select(year, month, day, dep_time, sched_dep_time, sched_arr_time)

flights %>%
  select(year : dep_delay)

flights %>%
  select(-(year : dep_delay))

glimpse(flights)

flights %>%
  select(contains("time"))
#contains() 함수는 문자열을 포함하는 열을 선택하는 함수
help("select")

# mutate() :새로운 변수를 계산하거나 기존 변수를 변환하는 데 사용
data <- flights %>%
  select(year:day, ends_with("_time"), distance)

glimpse(data)
data %>%
  mutate(time_diff = arr_time - dep_time,
         speed = distance /air_time *60,
         newthings =1) %>%
  select(dep_time, arr_time, time_diff, speed, newthings)

#윈도우 함수
#rank(), dense_rank(), row_number()
temp_num <- c(1,2,2,2,NA,3,3,4,5)
row_number(temp_num) # 데이터프레임에서 각 행의 순서
dense_rank(temp_num) # 데이터프레임에서 각 행의 밀집 순위(dense rank)를 반환
percent_rank(temp_num) #데이터프레임에서 각 행의 백분위 순위(percent rank)를 반환

# dplyr + ggplot2 한꺼번에 코드를 작성하기
flights %>%
  group_by(dest) %>%
  summarise(count = n(), #행의 개수 계산
            dist = mean(distance, na.rm= TRUE),
            delay = mean(arr_delay, na.rm = TRUE)) %>%
  filter(count > 10000 & dest != "ACK") %>%  
  ggplot(aes(x= dist, y= delay))+
    geom_point() +
    xlim(0, 3000)
    theme_bw()

# 파일 입출력
# CSV 파일 불러오기
mpg = read.csv(file = "R/data/mpg6.csv")
write.csv(mpg,file = 'R/data/result.csv')

# 데이터 엑셀로 내보내기
install.packages('writexl')
library(writexl)
write_xlsx(mpg,"R/data/result.xlsx")


# 엑셀 파일 불러오기
install.packages("readxl")
library(readxl)
mpg2 = read_excel(path = "R/data/result.xlsx")
mpg2



