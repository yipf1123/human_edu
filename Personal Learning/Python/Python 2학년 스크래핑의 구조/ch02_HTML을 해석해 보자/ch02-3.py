# pip install beautifulsoup4
import requests
from bs4 import BeautifulSoup

#웹 페이지를 구해 해석한다.
load_url = "http://python.cyber.co.kr./pds/books/python2nd/test1.html"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

print(soup.find("title").text)
print(soup.find("h2").text)
print(soup.find("li").text)