  import {test, expect} from '@playwright/test'
//create token API
  test('create token',async({request})=>{
   
   const response =  await request.post("https://restful-booker.herokuapp.com/auth",{
      headers:{
        'content-type' : 'application/json'
      },
      data:{
    "username" : "admin",
    "password" : "password123"
}
    });
const responseBody = await response.json();
console.log(responseBody.token)
  
  })


    test('create booking',async({request})=>{
   
   const response =  await request.post("https://restful-booker.herokuapp.com/booking",{
      headers:{
        'content-type' : 'application/json'
      },
      data:{
    "firstname" : "liece",
    "lastname" : "joe",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
    });
const responseBody = await response.json();
console.log(responseBody)
  
  })



test('get booking', async ({ request }) => {
  // Replace with a valid booking ID or correct endpoint URL
  const response = await request.get('https://restful-booker.herokuapp.com/booking/3765');

  // Check response status FIRST
  expect(response.ok()).toBeTruthy(); // Ensures 2xx status code

  // Safely parse JSON only after confirming 200 OK
  const responseBody = await response.json();
  console.log(responseBody);
});

  