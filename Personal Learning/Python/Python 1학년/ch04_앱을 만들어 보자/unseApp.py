import tkinter as tk
import random

def dispLabel():
    jebi=["대길", "중길", "소길", "흉"]
    lbl.configure(text=random.choice(jebi))

root=tk.Tk()
root.geometry("200x100")

lbl=tk.Label(text="LABEL")
btn=tk.Button(text="PUSH", command=dispLabel)

lbl.pack()
btn.pack()
tk.mainloop()