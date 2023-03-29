# pip install requests
import requests

url = "http://python.cyber.co.kr/pds/books/python2nd/test1.html"
response = requests.get(url)  # 웹 페이지를 구한다.

response.encoding = response.apparent_encoding # 글자가 깨지지 않도록 한다... 있어도 없어도 되는뎅


filename = "download.txt"
f = open (filename, mode="w", encoding ="UTF-8") # 파일을 쓰기 모드로 연다

f.write(response.text) # 데이터를 쓴다 

f.close #파일을 닫는다