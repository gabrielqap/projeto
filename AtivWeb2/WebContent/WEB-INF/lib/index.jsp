<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>

<h1>Cadastro de funcionario</h1>
<form action="" method="post">
Nome: <input type="text" name="NomeFuncionario">
Departamento: <input type="text" name="NomeDepFuncionario">
Salario: <input type="text" name="Salario">
<br>
<input type="submit" value="EnviarFuncionario">
<input type="reset" value="Limpar">
</form>

<h1>Cadastro de departamento</h1>
<form action="" method="post">
Nome do departamento: <input type="text" name="NomeDep">
<br>
<input type="submit" value="EnviarDep">
<input type="reset" value="LimparDep">
</form>

<h1>Cadastro do chefe</h1>
<form action="" method="post">
Nome do chefe: <input type="text" name="ChefeDoDep">
Nome do departamento: <input type="text" name="NomeDoDep">
<br>
<input type="submit" value="EnviarChef">
<input type="reset" value="LimparChef">
</form>

</body>
</html>