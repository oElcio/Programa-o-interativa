matriz = [[0 for _ in range(10)] for _ in range(10)]
 
def exibir_matriz(matriz):

    for linha in matriz:

        print(" ".join(f"{num:3}" for num in linha))  
 
print("Adicione os valores da matriz:")

for i in range(10):

    for j in range(10):

        while True:

            try:

                valor = int(input(f"Digite o valor para a posição [{i}][{j}]: "))

                matriz[i][j] = valor

                break 

            except ValueError:

                print("Valor inválido! Digite um número inteiro.")
 
print("\nMatriz completa:")

exibir_matriz(matriz)

 
