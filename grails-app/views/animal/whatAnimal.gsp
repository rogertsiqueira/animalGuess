<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main" />
		<title>Animals Guess</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body>
		<g:form name="formAnimal" controller="animal" action="save" update="">
			Que animal você pensou?<br />
			<input type="text" id="nome" name="nome" value="" /> <br />
			O que o seu animal faz, que o(a) ${animal.ask} não faz? <br />		
			<input type="text" id="carac" name="carac" value="" /> <br />
			<input type="hidden" name="id" value="${animal.id}" />
			<input type="submit" value="Ok" name="Ok" />			
		</g:form>
	</body>
</html>