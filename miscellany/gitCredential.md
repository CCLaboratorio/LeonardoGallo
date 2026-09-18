<h3>Credenciales de git</h3>

Para configurar tu git de tal manera que no te vuelva a pedir contraseña cada que realices una instrucción que requiera autenticación pudes ocupar lo siguiente:

- Configuración atemporal:

	```$ git config --global credential.helper store```

	Con esto, en el siguiente acceso que se realices al almacén remoto, el usuario y contraseña introducidos quedan almacenados en un fichero ubicado en:
	
		~/.git-credentials

	Esta opción se recomienda usar únicamente en tu equipo personal.	

- Configuración temporal

	```$ git config --global credential.helper 'cache --timeout=3600'```

	Una vez transcurrida una hora (3600 segundos), el siguiente acceso que se realice al repositorio volverá a solicitar usuario y contraseña.

	Esta opción es útli cuando no estás trabajando en tu equipo personal y sólo te tomará un tiempo determinado realzar modificaciones al almacén.

