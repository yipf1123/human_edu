# pip install beautifulsoup4
import requests
from bs4 import BeautifulSoup

#웹 페이지를 구해 해석한다.
load_url = "http://python.cyber.co.kr./pds/books/python2nd/test2.html"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

#ID로 검색해 그 태그의 내용을 표시한다
chap2 = soup.find(id="chap2")
print(chap2)