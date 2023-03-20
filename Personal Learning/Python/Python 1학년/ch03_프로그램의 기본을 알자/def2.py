def postTaxPrice(price): #인수와 반환값이 있는 함수
    ans=price*1.1
    return ans 

print(int(postTaxPrice(1000)),"원")
print(int(postTaxPrice(1280)),"원")
print(int(postTaxPrice(9800)),"원")