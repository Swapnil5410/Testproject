import {test,expect} from '@playwright/test'

test ('Delete API', async({request})=>{

const delreq = await request.delete('https://api.restful-api.dev/objects/ff8081819ff5b11001a005b9549e2499');

expect (delreq.status()).toBe(404);

})