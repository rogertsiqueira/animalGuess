<!DOCTYPE html>

<html>
	<head>
		<meta name="layout" content="main" />
		<title>Animals Guess</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body>
		<div id="divQ">
			<h1>O animal que você pensou ${animal.ask}?</h1>
			<g:link controller="animal" action="yes" params="[id: animal.id]">
			<input type="button" value="Yes" class="button"/>
			</g:link>
			<g:link controller="animal" action="no" params="[id: animal.id]">
			<input type="button" value="No" class="button"/>
			</g:link>
			<input type="hidden" name="id" value="${animal.id}"/>
		</div>
	</body>
</html>