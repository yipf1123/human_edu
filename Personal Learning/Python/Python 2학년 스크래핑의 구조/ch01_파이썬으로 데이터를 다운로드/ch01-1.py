# pip install requests
import requests

url = "http://python.cyber.co.kr/pds/books/python2nd/test1.html"
response = requests.get(url)  # 웹 페이지를 구한다.

response.encoding = response.apparent_encoding # 글자가 깨지지 않도록 한다

print(response.text) # 구한 문자열 데이터를 표시한다