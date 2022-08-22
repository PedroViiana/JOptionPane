# JOptionPane
Criação de um Login
Construa uma classe para representar um
usuário (chamada, Usuario)
– Com dois atributos para armazenar o nome (chamado,
nome) e senha (chamado, senha) do usuário
– Com um construtor que receba como parâmetros o
nome e a senha do usuário
– Com dois métodos, um para devolver o nome do
usuário (chamado, getNome( ) ) e outro para validar a
senha (chamado, validaSenha( ) )

Desenvolva a interface para
tela de login
– Altere o nome das variáveis
da tela: txtNome e txtSenha
– Implemente o evento click
do botão Entrar

Construa um classe (chamada TelaPrincipal)
que represente a tela principal do seu
sistema. Na classe TelaPrincipal:
• Adicione um novo atribute para
armazenar o cliente logado: private
Usuario usuario
• Adicione um campo de texto (chamado
txtLogin)
• Adicione um novo construtor que receba
por parâmetro o usuário logado

Criamos um objeto Usuario
2. Chamamos o método validaSenha para autenticar o usuário
3. Se o usuário for autenticado então
1. Chamamos um método para deixar invisível a TelaLogin
2. Criamos um objetos da TelaPrincipal
3. Chamamos um método para deixar visível a TelaPrincipal

