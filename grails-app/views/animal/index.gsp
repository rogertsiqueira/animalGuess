<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main" />
		<title>Animals Guess</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body>
		<div id="divMain">
			<h1> Welcome to Animals Guess</h1>
			<g:link controller="animal" action="play">
			<input type="button" value="Play" class="button"/>
			</g:link>
			<g:link controller="animal" action="clearDB">
			<input type="button" value="Clear Database" class="button"/>
			</g:link>
		</div>
	</body>
</html>