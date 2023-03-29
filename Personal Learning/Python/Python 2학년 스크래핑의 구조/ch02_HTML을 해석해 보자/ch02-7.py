import requests
from bs4 import BeautifulSoup

#웹 페이지를 구해 해석한다
load_url = "http://news.daum.net"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

#class로 검색하고 그 안에 있는 모든 a태그를 검색해 표시한다.
topic = soup.find(class_="list_newsissue")	
for element in topic.find_all("a"):	
		print(element.text)
