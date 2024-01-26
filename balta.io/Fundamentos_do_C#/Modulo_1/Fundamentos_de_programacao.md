# Linguagem de programação

A linguagem de programação é um conjunto de regras e instruções utilizadas para escrever software. Ela fornece uma forma para os programadores comunicarem com o computador, definindo como as tarefas devem ser executadas. As linguagens de programação permitem a criação de programas, aplicativos e sistemas, transformando as ideias dos desenvolvedores em código compreensível pela máquina.

<br><br>

# Compiladores

Compiladores são programas que traduzem o código fonte de um programa escrito em uma linguagem de programação para código de máquina ou código intermediário. Essa tradução é necessária para que o computador possa entender e executar as instruções escritas pelo programador. Em resumo, compiladores convertem o código legível por humanos em instruções compreensíveis pela máquina, permitindo a execução do software.

<br><br>

# Baixo nível

Linguagens de baixo nível em programação referem-se a linguagens que estão mais próximas da linguagem de máquina e do hardware do computador. Elas proporcionam um controle mais direto sobre os recursos do sistema, mas são menos abstratas e mais difíceis de entender e programar em comparação com linguagens de alto nível. Exemplos incluem Assembly e C.
```assembly
			global    _start

		    section   .text
_start:   	mov rax, 1
			mov rdi, 1
			rsi, message
			mov rdx, 13
			syscall
			mov rax, 60
			xor rdi, rdi
			syscall

			section   .data
message:	db        "Hello, World", 10
```

<br><br>

# Alto nível

Linguagens de alto nível em programação são linguagens de programação que possuem um nível maior de abstração em relação à linguagem de máquina. Elas são mais próximas da linguagem humana, facilitando a escrita e compreensão do código. Isso permite que os programadores se concentrem em lógica e tarefas de alto nível, enquanto a tradução para a linguagem de máquina é realizada por compiladores ou interpretadores. Exemplos incluem Python, Java e C#.
```csharp
namespace  ConsoleApp1
{
	class  Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Hello World");
		}
	}
}
```