from tkinter import*

janela = Tk() #inicializa a tela
janela.geometry("600x700+0+0") #tamanho da tela
janela.title("SISTEMA PARA DIAGNÓSTICO DE DOENÇAS EM SOJA") #titulo da tela
janela.configure(background = 'grey') #cor de fundo da tela

q1=Label(janela,text='Damaged Area= ') #pergunta sobre area danificada
q1.grid(row=10, column= 0) #cria o label

dal=Listbox(janela,height=5)
dal.insert(1,"LOW AREA")
dal.insert(2,"UPPER AREA")
dal.insert(3,"WHOLE FIELD")
dal.insert(4,"SCATTERED")
dal.insert(5,"UNKNOWN")
dal.grid(row=130,column=200)

q2=Label(janela,text= 'canker lesion = ')
q2.grid(row= 0, column =10)

cll=Listbox(janela, height =5)
cll.insert(1,"BROWN")
cll.insert(2,"TAN")
cll.insert(3,"DNA")
cll.insert(4,"DK-BROWN-BLK")
cll.insert(5,"UNKNOWN")
cll.grid(row=300,column=600)

q3=Label(janela,text = 'Crop Hist = ' )
q4=Label(janela,text = 'Date = ' )
q5=Label(janela,text = 'external decay = ' )
q6=Label(janela,text = 'fruit spot = ' )
q7=Label(janela,text = 'fruiting bodies = ' )
q8=Label(janela,text = 'fruit pods = ' )
q9=Label(janela, text = 'germination =')
q10=Label(janela, text = 'hail =')
q11=Label(janela, text = 'int discolor =')
q12=Label(janela, text = 'leaf malf =')
q13=Label(janela, text = 'leaf mild = ')
q14=Label(janela, text = 'leaf shread =')
q15=Label(janela, text = 'leafspot size =')
q16=Label(janela, text = 'leafspot marg = ')
q17=Label(janela, text = 'leaves = ')
q18=Label(janela, text = 'lodging = ')
q19=Label(janela, text = 'mold growth = ')
q20=Label(janela, text = 'mycelium = ')
q21=Label(janela, text = 'plant stand = ')
q22=Label(janela, text = 'precip = ')
q23=Label(janela, text = 'roots = ')
q24=Label(janela, text = 'sclerotia = ')
q25=Label(janela, text = 'seed = ')
q26=Label(janela, text = 'seed discolor = ')
q27=Label(janela, text = 'seed size = ')
q28=Label(janela, text = 'seed tmt = ')
q29=Label(janela, text = 'severity = ')
q30=Label(janela, text = 'shriveling = ')
q31=Label(janela, text = 'stem = ')
q32=Label(janela, text = 'stem canker = ')
q33=Label(janela, text = 'temp = ')



janela.mainloop()