<h3>Credenciales de git</h3>

Después de generar tu Token Clásico a través de la opción:

	Settings -> Developer Settings -> Personal access tokens -> Tokens (classic) -> Generate new token (classic)

1. Copia y guarda en un lugar seguro la cadena que te proporcionó Github como Token de acceso personal. 
2. Clonar tu almacén ```$ git clone _rutaProporcionadaConTerminación.git_```
3. Coloca tu nombre de usuario y pega el token proporcionado con Ctrl + Shift + v

Con esto debería iniciar el proceso de clonación y te lanzará un Warning ya que la carpeta que acabas de clonar está vacía.

Para configurar tu git de tal manera que no te vuelva a pedir contraseña cada que realices una instrucción que requiera autenticación ejecuta lo siguiente en la consola:

- Configuración atemporal:

	```$ git config --global credential.helper store```

	Con esto, en el siguiente acceso que realices al almacén remoto, el usuario y contraseña introducidos quedan almacenados en un fichero ubicado en:
	
		~/.git-credentials

	Esta opción se recomienda usar únicamente en tu equipo personal.	

- Configuración temporal

	```$ git config --global credential.helper 'cache --timeout=3600'```

	Una vez transcurrida una hora (3600 segundos), el siguiente acceso que se realice al almacén volverá a solicitar usuario y contraseña.

	Esta opción es útli cuando no estás trabajando en tu equipo personal y sólo te tomará un tiempo determinado realizar modificaciones al almacén.

Ahora para que uses nuevamente tu token y quede almacenado gracias a la instrucción anterior, ingresa a la carpeta creada después de clonar y dentro crea un README.md y súbelo a tu almacén remoto, para ello ejecuta la siguiente serie de instrucciones.

``` $ emacs README.md
    $ git add README.md
    $ git commit -m "Se crea el README.md"
    $ git push ```
