import numpy as np

def main():
    # Inicializa uma lista para armazenar os números
    numeros = []

    # Solicita ao usuário que insira 10 números de 0 a 9
    print("Insira 10 números de 0 a 9:")
    while len(numeros) < 10:
        try:
            numero = int(input(f"Digite o número {len(numeros) + 1}: "))
            if 0 <= numero <= 9:
                numeros.append(numero)
            else:
                print("Por favor, insira um número entre 0 e 9.")
        except ValueError:
            print("Entrada inválida! Por favor, insira um número inteiro.")

    # Cria uma matriz 1x10 a partir dos números
    matriz_1x10 = np.array(numeros).reshape(1, 10)

    # Cria uma matriz 10x1 a partir dos números
    matriz_10x1 = np.array(numeros).reshape(10, 1)

    # Exibe as matrizes
    print("\nMatriz 1x10:")
    print(matriz_1x10)

    print("\nMatriz 10x1:")
    print(matriz_10x1)

if __name__ == "__main__":
    main()
