# pip install requests
import requests

url = "http://python.cyber.co.kr/pds/books/python2nd/test1.html"
response = requests.get(url)  # 웹 페이지를 구한다.

response.encoding = response.apparent_encoding # 글자가 깨지지 않도록 한다... 있어도 없어도 되는뎅


filename = "download2.txt"
with open (filename, mode= "w", encoding="UTF-8") as f:
    f.write(response.text)

#인터넷에 있는 HTML 파일을 컴퓨터에 저장하기