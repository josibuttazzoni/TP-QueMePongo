## Septima Iteracion

- Como usuarie de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas

URI: GET http://www.quemepongo.com/usuarios/{id}/guardarropas

Respuesta posible  
```json
[ 
  {
  "id_prenda":"1",
  "tipo_prenda":"un_tipo",
  "material":"un_material",
  "color":"un_color"
  },
  {
  "id_prenda":"2",
  "tipo_prenda":"un_tipo",
  "material":"un_material",
  "color":"un_color"
  },
  {
  "id_prenda":"3",
  "tipo_prenda":"un_tipo",
  "material":"un_material",
  "color":"un_color"
  },
  {
  "id_prenda":"4",
  "tipo_prenda":"un_tipo",
  "material":"un_material",
  "color":"un_color"
  } 
]
```

- Como usuario de QueMePongo, quiero crear una prenda desde el navegador

URI: POST http://www.quemepongo.com/usuarios/{id}/guardarropas

Body posible enviado
```json
{
  "tipo_prenda":"remera",
  "material":"algodon",
  "color":"rojo"
}
```

- Como usuarie de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla

URI (ej. prenda id 5): GET http://www.quemepongo.com/usuarios/{id}/guardarropas/5

Respuesta posible
```json
{
  "id_prenda":"5",
  "tipo_prenda":"campera",
  "material":"jean",
  "color":"celeste"
}
```

- Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas

URI (ej. prenda id 5): DELETE http://www.quemepongo.com/usuarios/{id}/guardarropas/5

- Como usuarie de QueMePongo, quiero poder ver mis eventos para administrarlos

URI : GET http://www.quemepongo.com/usuarios/{id}/eventos

Respuesta posible

```json
[ 
  {
  "id_evento":"1",
  "tipo_evento":"un_tipo"
  },
  {
  "id_evento":"2",
  "tipo_evento":"un_tipo"
  },
  {
  "id_evento":"3",
  "tipo_evento":"un_tipo"
  },
  {
  "id_evento":"4",
  "tipo_evento":"un_tipo"
  } 
]
```

- Como usuarie de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador

URI : GET http://www.quemepongo.com/usuarios/{id}/eventos/{id}/sugerencias

Respuesta posible

```json
[ 
  {
    "prenda_superior":
    {
    "id_prenda":"5",
    "tipo_prenda":"campera",
    "material":"jean",
    "color":"celeste"
    },
    "prenda_inferior":
    {
    "id_prenda":"6",
    "tipo_prenda":"pantalon",
    "material":"jean",
    "color":"negro"
    },
    "calzado":
    {
    "id_prenda":"3",
    "tipo_prenda":"zapatillas",
    "material":"lona",
    "color":"blanco"
    }
  },
  {
    "prenda_superior":
    {
    "id_prenda":"1",
    "tipo_prenda":"remera",
    "material":"lino",
    "color":"beige"
    },
    "prenda_inferior":
    {
    "id_prenda":"2",
    "tipo_prenda":"short",
    "material":"gabardina",
    "color":"blanco"
    },
    "calzado":
    {
    "id_prenda":"9",
    "tipo_prenda":"sandalias",
    "material":"cuero",
    "color":"negro"
    }
  }
]
```
