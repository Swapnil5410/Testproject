import {test, expect, request} from '@playwright/test'

var id: string;

test ('create object',async({request})=>{

const postRequest = await request.post("https://api.restful-api.dev/objects",{

   headers:{
    'Content-Type': 'application/json'
   }, 
   "data":{
  "name": "Apple MacBook Pro 17",
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
expect (postRequestJ.name).toBe('Apple MacBook Pro 17');
//expect(postRequestJ.createdAt).toMatch(/^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}/);
expect(postRequestJ.data.year).toBe(2019);
expect(postRequestJ.data.price).toBe(1849.99);
console.log('test successful');
console.log(postRequestJ);
id= await postRequestJ.id;

})


test('Get API - Get object', async({request})=>{

const Getrequest = await request.get(`https://api.restful-api.dev/objects/${id}`);

const response = await Getrequest.json();
console.log(response);
})


test ('Delete API', async({request})=>{

const delreq = await request.delete(`https://api.restful-api.dev/objects/${id}`);

expect (delreq.status()).toBe(200);

if (delreq.status() === 200){
    console.log("The resource successfully deleted")
}
else{
        console.log("The resource not deleted")
}

})


test ('Not found API', async({request})=>{

const delreq = await request.delete(`https://api.restful-api.dev/objects/${id}`);

expect (delreq.status()).toBe(404);

if (delreq.status() === 404) {
  console.log('Success: The resource was successfully deleted or not found.');
} else {
  console.log(`Unexpected status code received: ${delreq.status()}`);
}
})