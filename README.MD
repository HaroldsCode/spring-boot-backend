# usuario (GET, POST, PUT, DELETE)
 ## EndPoints
	- api/v1/user - Get, post
	- api/v1/user/{nombre} - Get
	- api/v1/user/{id} - Put, Delete
 ## Estructuras
	{
		"nombre": string,
		"rol": {
			"id_rol": numero,
			"nombre": string
		},
		"activo": char
	}

# rol (GET)
 ## EndPoints
	- api/v1/rol
 ## Estructuras
	{
		"id_rol": numero,
		"nombre": string
	}
