<h3>Credenciales de git</h3>

- Configuración atemporal 

	```$ git config --global credential.helper store```

Con esto, en el siguiente acceso que se realice al repositorio remoto,
el usuario y contraseña introducidos quedan almacenados en un fichero ubicado en:
	
	~/.git-credentials
	
- Configuración temporal

	```$ git config --global credential.helper 'cache --timeout=3600'```

Una vez transcurrida una hora (3600 segundos), el siguiente acceso que se realice al
repositorio volverá a solicitar usuario y contraseña.

