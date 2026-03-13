print("BEM VINDO AO SEU SISTEMA MATH")

def pa():
    print("Progresão Aritimetica")
    termos =input("Digite os 2 primeiros numeros entre espaço: ")
    numeros = termos.split()
    num1 = int(numeros[0])
    num2 = int(numeros[1])

    r = num2-num1
    n = int(input("Quantos termos vc deseja: "))
    for i in range(n):

        form = num1 + i * r

        print(f"{i+1}° Termos:{form}")
    print()
    print(f"Razão: {r}")

def pg():
    print("Progresão Geometrica")
    termos =input("Digite os 2 primeiros numeros entre espaço: ")
    numeros = termos.split()
    num1 = int(numeros[0])
    num2 = int(numeros[1])

    r = num2/num1

    n = int(input("Quantos termos vc deseja: "))

    for i in range(n):

        form = num1 * (r ** i)

        print(f"{i+1}° Termos:{form}")
    print()
    print(f"Razão: {r}")

    

def cmp():
    classes = {}
    while True:
        opt = input("\n[1]Add [2]Mostrar [3]Del [S]Sair: ").upper()
        
        if opt == '1':
            n = input("Nome: ")
            classes[n] = float(input(f"Valor para {n}: "))
            
        elif opt == '2':
            if not classes:
                print("Lista vazia.")
                continue
            
            total = 1
            print("\n--- Lista de Classes ---")
            for k, v in classes.items():
                total *= v
                print(f"• {k}: {v}")
            
            print(f"*-*-*-*-*-*-*-*-*-*-*-*-*-*")
            print(f"Resultado: {total}")
                
        elif opt == '3':
            n = input("Nome para deletar: ")
            if classes.pop(n, None):
                print(f"'{n}' removido com sucesso.")
            else:
                print("Erro: Nome não encontrado.")
            
        elif opt == 'S': 
            break
        else: 
            print("Opção Inválida.")

def mf():
    print("Multiplicão Fatorial")
    n = int(input("Digite um número inteiro positivo para calcular o fatorial: "))

    if n < 0:
        print("Fatorial não é definido para números negativos.")
    elif n == 0:
        print("O fatorial de 0 é 1.")
    else:
        resultado = 1
        calculo = []
    
        # Gera a sequência do número até 1
        for i in range(n, 0, -1):
            resultado *= i
            calculo.append(str(i))
    
        # Monta a string do cálculo (ex: 5 * 4 * 3 * 2 * 1)
        string_calculo = " * ".join(calculo)
    
        print(f"\nCálculo: {string_calculo}")
        print(f"Resultado de {n}! é: {resultado}")

def sobre():
    print("Criado por Edcley em 20 minutos")
    print("Para ponto extra e aula de Math")

    
print("Escolhas as funçoes desejadas: ")
print("1. PA - Progresão Aritemetica")
print("2. PG - Progresão Geometrica")
print("3. CMP - Principio Multipicativo da Contagem")
print("3. MF - Multiplicão Fatorial")
print("4. Sobre")

escmain=int(input("Qual vc escolheu? "))

if escmain == 1:
    pa()
elif escmain == 2:
    pg()
elif escmain == 3:
    cmp()
elif escmain  == 4:
    mf()
