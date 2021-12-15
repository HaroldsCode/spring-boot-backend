# usuario (GET, POST, PUT, DELETE)
 ## EndPoints
	- api/v1/user
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
