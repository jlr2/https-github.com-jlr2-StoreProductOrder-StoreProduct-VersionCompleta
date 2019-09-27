# product-service

It's a service which is part of a microservices project. This project consists in an online store, and the service manage the products.
This service storage products data.


## Execution

You can execute the project using the command `mvn clean springboot:run` in boot module. 

## How it works

### POST
The URI to made POST is 

`/api/v1/products`

The body to insert is like this:
```
{
	"stock": 10,
	"name": "name4",
	"brand": "marca2",
	"price": 1.0,
	"supplier":"supplier1"
}
````   
           
### GET
The URI to made  **GET** is
 `/api/v1/products`
 

### PUT
 The URI to made **PUT** products is:
`/api/v1/products/productId`

where *productId* is the id of the product that you want to upgrade. 

When use this URI is for disable the product

For upgrade some product the URI is 

`/api/v1/products/productId`

where *productId* is the id of the product that you want to upgrade. 

The body to upgrade the product is like this:

```
{
    "id": 1,
    "stock": 1,
    "name": "name3",
    "brand": "marca2",
    "modifiedDate": "2019-04-25T11:37:46.140+0000",
    "price": 1,
    "supplier": "supplier3"
}
````        
