<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main" />
		<title>Animals Guess</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body>
		<div id="divMain">
			<h1>Pense em um animal</h1>
			<g:link controller="animal" action="start" params="[id: animal?.id]">
			<input type="button" value="Ok" class="button" />			
			</g:link>
			
			<g:link controller="animal" action="home">
			<input type="button" value="Home" class="button" />			
			</g:link>			
		</div>
	</body>
</html>
