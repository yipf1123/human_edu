from restaurant import Comments, Menus
all_menus = [
    {"menu" : "김밥", "price" : 1500},
    {"menu" : "떡볶이", "price" : 3000},
    {"menu" : "우동", "price" : 4000},
    {"menu" : "라면", "price" : 2500}
]
class Order(Menus):
    _data = all_menus
    _name = "휴먼김밥천국"
    _status = True
    def __init__(self):
        print(Comments.title%self._name)
    def set_products(self):
        Menus.food_names = []
        Menus.food_prices = []
        for food in self._data:
            Menus.food_names.append(food['menu'])
            Menus.food_prices.append(food['price'])
    def run(self):
        self.set_products()
        while self._status:
            try:
                inputMoney = int(input(Comments.insert_price))
            except ValueError:
                print(Comments.select_error)
            else:
                self.selectMenu(inputMoney) # 아래 메서드에서 정의
    def selectMenu(self, money):
        print(Comments.select_menu)
        for idx, name in enumerate(Menus.food_names):
            price = Menus.food_prices[idx]
            print(Comments.product_description %(str(idx+1), name, price))
        inputFood = int(input(Comments.select_menu))
        self.payment(money, inputFood)
    def payment(self, money, idx):
        name = Menus.food_names[idx]
        price = Menus.food_prices[idx]
        if money >= price:
            balance = money - price
            print(Comments.finish_sale %(name, str(balance)))
        else:
            print(Comments.insufficient_price %(name, str(money)))
if __name__=="__main__":
    order = Order()
    try:
        order.run()
    except KeyboardInterrupt:
        order._status = False
        print(Comments.terminate_sale)



























