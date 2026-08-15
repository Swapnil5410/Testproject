//https://restful-api.dev/

import {test, expect, request} from '@playwright/test'


test ('create object',async({request})=>{

const postRequest = await request.post("https://api.restful-api.dev/objects",{

   headers:{
    'Content-Type': 'application/json'
   }, 
   "data":{
  "name": "Apple MacBook Pro 16",
  "data": {
    "year": 2019,
    "price": 1849.99,
    "CPU model": "Intel Core i9",
    "Hard disk size": "1 TB"
  }
}
}) 
expect (postRequest.status()).toBe(200);

const postRequestJ = await postRequest.json();
expect (postRequestJ.name).toBe('Apple MacBook Pro 16');
//expect(postRequestJ.createdAt).toMatch(/^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}/);
expect(postRequestJ.data.year).toBe(2019);
expect(postRequestJ.data.price).toBe(1849.99);
console.log('test successful');
console.log(postRequestJ);


})