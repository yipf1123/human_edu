# pip install beautifulsoup4
import requests
from bs4 import BeautifulSoup

#웹 페이지를 구해 해석한다.
load_url = "http://python.cyber.co.kr./pds/books/python2nd/test2.html"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

#ID로 검색한 후 그 안의 모든 li 태그를 검색해 표시한다.
chap2 = soup.find(id="chap2")
for element in chap2.find_all("li"):
    print(element.text)