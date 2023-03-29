import requests
from bs4 import BeautifulSoup

#웹 페이지를 구해 해석한다.
load_url = "http://python.cyber.co.kr/pds/books/python2nd/test2.html"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

# 모든 a 태그를 검색하고 링크를 표시한다.
for element in soup.find_all("a"):
    print(element.net)
    url = element.get("href")
    print(url)