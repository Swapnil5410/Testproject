import {test, expect} from '@playwright/test'

test('Get API - Get object', async({request})=>{

const Getrequest = await request.get('https://api.restful-api.dev/objects/ff8081819ff5b11001a005b9549e2499');

const response = await Getrequest.json();
console.log(response);
})